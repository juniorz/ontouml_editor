package OntoDSL.adapter;

import OntoDSL.OntoDSLPackage;
import OntoDSL.impl.OntoDSLPackageImpl;
import RefOntoUML.Association;
import RefOntoUML.NamedElement;
import RefOntoUML.Property;
import RefOntoUML.RefOntoUMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;

public class OwnedMemberObserver extends EContentAdapter {

	private class AutoMemberAdapter {
		private Notification notification;
		private Association association;
		private Property newValue;
		private Property oldValue;

		protected AutoMemberAdapter(Notification notif) {
			notification = notif;
		}
		
		protected void adapt(){
			if(!shouldAdapt()) {
				return;
			}

			System.out.println(" ** vai adaptar ");

			if(hasNewMember()){
				doAction();
			}
			else {
				undoAction();
			}
		}

		private boolean shouldAdapt() {
			int eventType = notification.getEventType();
			return (eventType == Notification.ADD || eventType == Notification.REMOVE);
		}

		private void doAction(){
			System.out.println(" -> ");

			Property newValue = getNewValue();
			getAssociation().getMemberEnd().add(newValue);
			getAssociation().getNavigableOwnedEnd().add(newValue);
		}


		private void undoAction(){
			System.out.println(" <- ");

			Property oldValue = getOldValue();
			getAssociation().getMemberEnd().remove(oldValue);
			getAssociation().getNavigableOwnedEnd().remove(oldValue);
		}

		private boolean hasNewMember(){
			return notification.getNewValue() != null;
		}
	
		private Association getAssociation(){
			if(association == null){
				association = (Association) notification.getNotifier();
			}
			
			return association;
		}

		private Property getNewValue(){
			if(newValue == null){
				newValue = (Property) notification.getNewValue();
			}

			return newValue;
		}

		private Property getOldValue(){
			if(oldValue == null){
				oldValue = (Property) notification.getOldValue();
			}

			return oldValue;
		}
	}
	
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);

//		System.out.print("changed ");
//		EObject target = ((EObject) notification.getNotifier());
//		System.out.print(target.eClass().getName());

		if(false == RefOntoUMLPackage.eINSTANCE.getAssociation().isInstance(target)){
			return;
		}

		Association target = ((Association) notification.getNotifier());

		System.out.print("changed ");
		System.out.print(target.eClass().getName());

		if(target.getName() != null){
			System.out.print(" <" + target.getName()+ ">");
		}

		EStructuralFeature feature = (EStructuralFeature) notification.getFeature();
		if(feature != null){
			System.out.print(" (" + feature.getName()+ ")");
		}

		System.out.println("");

		if( notification.getFeatureID(Association.class) == RefOntoUMLPackage.ASSOCIATION__MEMBER_END ) {
			System.out.println(" tipo: " + notification.getEventType());
		}

		if( notification.getFeatureID(Association.class) == RefOntoUMLPackage.ASSOCIATION__OWNED_END ) {
			System.out.println(" - ownedEnd");
			AutoMemberAdapter adapter = new AutoMemberAdapter(notification);
			adapter.adapt();
		}
	}

	public boolean isAdapterForType(Object type){
		super.isAdapterForType(type);
		return type == OwnedMemberObserver.class;
	}

}
