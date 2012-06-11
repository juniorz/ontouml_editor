package br.ufes.inf.nemo.ontouml.dsl.xtext.linking;

import OntoDSL.DslModel;
import OntoDSL.DslRelator;
import OntoDSL.OntoDSLPackage;
import OntoDSL.util.OntoDSLSwitch;
import RefOntoUML.Association;
import RefOntoUML.Classifier;
import RefOntoUML.LiteralInteger;
import RefOntoUML.Mediation;
import RefOntoUML.Property;
import RefOntoUML.RefOntoUMLFactory;
import RefOntoUML.RefOntoUMLPackage;
import RefOntoUML.impl.LiteralIntegerImpl;
import RefOntoUML.util.RefOntoUMLSwitch;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.lazy.LazyLinker;

public class DslLinker extends LazyLinker {
	@Override
	protected void afterModelLinked(EObject model, IDiagnosticConsumer diagnosticsConsumer) {
		System.out.println("DslLinker#afterModelLinked");

		RefOntoUMLSwitch<EObject> refSwitch = new RefOntoUMLSwitch<EObject>(){
			public EObject caseAssociation(Association association) {
				System.out.println("Association " + association.getName());

				for (Property property : association.getOwnedEnd())
				{
					if(false == association.getMemberEnd().contains(property)){
						association.getMemberEnd().add(property);
					}

					if(false == association.getNavigableOwnedEnd().contains(property)){
						association.getNavigableOwnedEnd().add(property);
					}
				}

				return association;
			};
		};

		
		OntoDSLSwitch<EObject> dslSwitch = new OntoDSLSwitch<EObject>() {
			public EObject caseDslMediation(OntoDSL.DslMediation mediation)
			{
				System.out.println("DslMediation " + mediation.getName());

				RefOntoUMLFactory factory = RefOntoUMLFactory.eINSTANCE;
				Property end;

				mediation.getOwnedEnd().clear();
				mediation.getMemberEnd().clear();

				DslRelator relator = mediation.getRelator();
				if(null != relator) {
					System.out.println(" - relator " + relator.getName());
					end = factory.createProperty();
					end.setType(relator);

//					LiteralInteger lower = factory.createLiteralInteger();
//					lower.setValue(0);
//
//					LiteralInteger upper = factory.createLiteralInteger();
//					upper.setValue(1);
//					
//					end.setLowerValue(lower);
//					end.setUpperValue(upper);

					mediation.getOwnedEnd().add(0, end);
					mediation.getMemberEnd().add(0, end);
				}

				// N‹o posso adicionar no ownedEnd porque ele j‡ est‡ em outra associa‹o containment
				Property mediated = mediation.getMediated();
				if(null != mediated){
					mediated.setIsReadOnly(true); //DependencyRelationshipConstraint2
					mediation.getMemberEnd().add(1, mediated);			
				}

				
				System.out.println(" => resultado");
				System.out.println("  * relator = " + mediation.relatorEnd().getType().getName());
				System.out.println("  * mediated = " + mediation.mediatedEnd().getType().getName());

				System.out.println("  * targetEnd is read only? = " + mediation.targetEnd().isIsReadOnly());

				return mediation;
			};
		};

		
		this.ontoDslTraverse(model, dslSwitch);
		this.refTraverse(model, refSwitch);

	}

	private void ontoDslTraverse(EObject model, OntoDSLSwitch<EObject> eSwittch){
		TreeIterator<EObject> allContents = EcoreUtil.getAllContents(model, true);

		while(allContents.hasNext()){
			EObject eObject = allContents.next();		
			eSwittch.doSwitch(eObject);
		}
	}

	private void refTraverse(EObject model, RefOntoUMLSwitch<EObject> eSwittch){
		TreeIterator<EObject> allContents = EcoreUtil.getAllContents(model, true);

		while(allContents.hasNext()){
			EObject eObject = allContents.next();		
			eSwittch.doSwitch(eObject);
		}
	}

}
