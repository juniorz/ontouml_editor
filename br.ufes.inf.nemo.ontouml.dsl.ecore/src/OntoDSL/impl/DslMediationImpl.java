/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoDSL.impl;

import OntoDSL.Cardinality;
import OntoDSL.DslMediation;
import OntoDSL.DslRelator;
import OntoDSL.OntoDSLPackage;

import RefOntoUML.Property;

import RefOntoUML.impl.MediationImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link OntoDSL.impl.DslMediationImpl#getMediated <em>Mediated</em>}</li>
 *   <li>{@link OntoDSL.impl.DslMediationImpl#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DslMediationImpl extends MediationImpl implements DslMediation {
	/**
	 * The cached value of the '{@link #getMediated() <em>Mediated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediated()
	 * @generated
	 * @ordered
	 */
	protected Property mediated;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality;

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
	 * @generated
	 */
	public Property getMediated() {
		return mediated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMediated(Property newMediated, NotificationChain msgs) {
		Property oldMediated = mediated;
		mediated = newMediated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntoDSLPackage.DSL_MEDIATION__MEDIATED, oldMediated, newMediated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediated(Property newMediated) {
		if (newMediated != mediated) {
			NotificationChain msgs = null;
			if (mediated != null)
				msgs = ((InternalEObject)mediated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntoDSLPackage.DSL_MEDIATION__MEDIATED, null, msgs);
			if (newMediated != null)
				msgs = ((InternalEObject)newMediated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntoDSLPackage.DSL_MEDIATION__MEDIATED, null, msgs);
			msgs = basicSetMediated(newMediated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoDSLPackage.DSL_MEDIATION__MEDIATED, newMediated, newMediated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntoDSLPackage.DSL_MEDIATION__CARDINALITY, oldCardinality, newCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		if (newCardinality != cardinality) {
			NotificationChain msgs = null;
			if (cardinality != null)
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntoDSLPackage.DSL_MEDIATION__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntoDSLPackage.DSL_MEDIATION__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoDSLPackage.DSL_MEDIATION__CARDINALITY, newCardinality, newCardinality));
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
			case OntoDSLPackage.DSL_MEDIATION__MEDIATED:
				return basicSetMediated(null, msgs);
			case OntoDSLPackage.DSL_MEDIATION__CARDINALITY:
				return basicSetCardinality(null, msgs);
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
			case OntoDSLPackage.DSL_MEDIATION__MEDIATED:
				return getMediated();
			case OntoDSLPackage.DSL_MEDIATION__CARDINALITY:
				return getCardinality();
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
			case OntoDSLPackage.DSL_MEDIATION__MEDIATED:
				setMediated((Property)newValue);
				return;
			case OntoDSLPackage.DSL_MEDIATION__CARDINALITY:
				setCardinality((Cardinality)newValue);
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
			case OntoDSLPackage.DSL_MEDIATION__MEDIATED:
				setMediated((Property)null);
				return;
			case OntoDSLPackage.DSL_MEDIATION__CARDINALITY:
				setCardinality((Cardinality)null);
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
			case OntoDSLPackage.DSL_MEDIATION__MEDIATED:
				return mediated != null;
			case OntoDSLPackage.DSL_MEDIATION__CARDINALITY:
				return cardinality != null;
		}
		return super.eIsSet(featureID);
	}

} //DslMediationImpl
