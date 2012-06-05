/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoDSL.impl;

import OntoDSL.DslMediation;
import OntoDSL.DslRelator;
import OntoDSL.OntoDSLPackage;

import RefOntoUML.Property;

import RefOntoUML.impl.MediationImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Mediation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OntoDSL.impl.DslMediationImpl#getRelator <em>Relator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DslMediationImpl extends MediationImpl implements DslMediation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslMediationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoDSLPackage.Literals.DSL_MEDIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslRelator getRelator() {
		if (eContainerFeatureID() != OntoDSLPackage.DSL_MEDIATION__RELATOR) return null;
		return (DslRelator)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelator(DslRelator newRelator, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRelator, OntoDSLPackage.DSL_MEDIATION__RELATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelator(DslRelator newRelator) {
		if (newRelator != eInternalContainer() || (eContainerFeatureID() != OntoDSLPackage.DSL_MEDIATION__RELATOR && newRelator != null)) {
			if (EcoreUtil.isAncestor(this, newRelator))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRelator != null)
				msgs = ((InternalEObject)newRelator).eInverseAdd(this, OntoDSLPackage.DSL_RELATOR__MEDIATIONS, DslRelator.class, msgs);
			msgs = basicSetRelator(newRelator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoDSLPackage.DSL_MEDIATION__RELATOR, newRelator, newRelator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Property getOwnedMediatedEnd() {
		return mediatedEnd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOwnedMediatedEnd(Property mediated) {

		Property mediatedEnd = null;

		try {
			mediatedEnd = getMemberEnd().get(1);	
		} catch (IndexOutOfBoundsException e) {
			//
		}

		// TODO inserir uma property para o sourceEnd()
		// getMemberEnd().add(0, relatorProperty);
		
		if(mediated == null){
			if(mediatedEnd != null){
				this.getMemberEnd().remove(mediatedEnd);
				this.getNavigableOwnedEnd().remove(mediatedEnd);
				this.getOwnedEnd().remove(mediatedEnd);
			}
		}
		else {
			this.getOwnedEnd().add(mediated);
			this.getNavigableOwnedEnd().add(mediated);
			this.getMemberEnd().add(mediated);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntoDSLPackage.DSL_MEDIATION__RELATOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRelator((DslRelator)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntoDSLPackage.DSL_MEDIATION__RELATOR:
				return basicSetRelator(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OntoDSLPackage.DSL_MEDIATION__RELATOR:
				return eInternalContainer().eInverseRemove(this, OntoDSLPackage.DSL_RELATOR__MEDIATIONS, DslRelator.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntoDSLPackage.DSL_MEDIATION__RELATOR:
				return getRelator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OntoDSLPackage.DSL_MEDIATION__RELATOR:
				setRelator((DslRelator)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OntoDSLPackage.DSL_MEDIATION__RELATOR:
				setRelator((DslRelator)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OntoDSLPackage.DSL_MEDIATION__RELATOR:
				return getRelator() != null;
		}
		return super.eIsSet(featureID);
	}

} //DslMediationImpl
