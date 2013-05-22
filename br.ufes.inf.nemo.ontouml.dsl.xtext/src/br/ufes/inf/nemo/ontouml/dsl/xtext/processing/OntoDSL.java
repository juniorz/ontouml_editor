package br.ufes.inf.nemo.ontouml.dsl.xtext.processing;

import org.eclipse.emf.ecore.EObject;

import OntoDSL.DslMediation;
import OntoDSL.DslRelator;
import OntoDSL.util.OntoDSLSwitch;
import RefOntoUML.Property;
import RefOntoUML.RefOntoUMLFactory;

public class OntoDSL {
	public static OntoDSLSwitch<EObject> createSwitch() {
		OntoDSLSwitch<EObject> dslSwitch = new OntoDSLSwitch<EObject>() {
			public EObject caseDslMediation(DslMediation mediation)
			{
				System.out.println("DslMediation " + mediation.getName());

				mediation.getOwnedEnd().clear();
				mediation.getMemberEnd().clear();

				createRelatorEnd(mediation);
				createMediatedEnd(mediation);

				debug(mediation);

				return mediation;
			}

			private void createMediatedEnd(DslMediation mediation) {
				Property mediated = mediation.getMediated();
				if(null != mediated){
					mediated.setIsReadOnly(true); //DependencyRelationshipConstraint2
					mediation.getMemberEnd().add(1, mediated);
					mediation.getNavigableOwnedEnd().add(1, mediated);
				}
			}

			private void createRelatorEnd(DslMediation mediation) {
				RefOntoUMLFactory factory = RefOntoUMLFactory.eINSTANCE;
				Property end;
				DslRelator relator = mediation.getRelator();

				if(null != relator) {
					System.out.println(" - relator " + relator.getName());
					end = factory.createProperty();
					end.setType(relator);

					mediation.getOwnedEnd().add(0, end);
					mediation.getMemberEnd().add(0, end);
					mediation.getNavigableOwnedEnd().add(0, end);
				}
			}
		};
		return dslSwitch;
	}
	
	private static void debug(DslMediation mediation) {
		System.out.println(" => resultado");
		Property relatorEnd = mediation.relatorEnd();
		Property mediateEnd = mediation.mediatedEnd();
		Property targetEnd = mediation.targetEnd();

		if(relatorEnd != null && relatorEnd.getType() != null){
			System.out.println("  * relator = " + relatorEnd.getType().getName());
		}

		if(mediateEnd != null && mediateEnd.getType() != null){
			System.out.println("  * mediated = " + mediateEnd.getType().getName());
		}

		if(targetEnd != null){
			System.out.println("  * targetEnd is read only? = " + targetEnd.isIsReadOnly());
		}
	};
}
