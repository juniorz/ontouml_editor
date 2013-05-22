package br.ufes.inf.nemo.ontouml.dsl.xtext.processing;

import org.eclipse.emf.ecore.EObject;

import RefOntoUML.Association;
import RefOntoUML.Property;
import RefOntoUML.util.RefOntoUMLSwitch;

public class RefOntoUML {
	public static RefOntoUMLSwitch<EObject> createSwitch() {
		RefOntoUMLSwitch<EObject> refSwitch = new RefOntoUMLSwitch<EObject>(){
			public EObject caseAssociation(Association association) {
				System.out.println("Association " + association.getName());

				everyOwnedEndIsNavigableAndMemberEnd(association);

				return association;
			}
		};
		return refSwitch;
	}

	static private void everyOwnedEndIsNavigableAndMemberEnd(Association association) {
		System.out.println("Association " + association.eContainingFeature().getName());

		for (Property property : association.getOwnedEnd())
		{
			System.out.println(" => property " + property.getName());
			if(false == association.getMemberEnd().contains(property)){
				System.out.println(" * added as memberEnd");
				association.getMemberEnd().add(property);
			}

			if(false == association.getNavigableOwnedEnd().contains(property)){
				System.out.println(" * added as navigableOwnedEnd");
				association.getNavigableOwnedEnd().add(property);
			}
		}
	};
}
