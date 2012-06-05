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

import RefOntoUML.impl.RelatorImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Relator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OntoDSL.impl.DslRelatorImpl#getMediations <em>Mediations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DslRelatorImpl extends RelatorImpl implements DslRelator {
	/**
	 * The cached value of the '{@link #getMediations() <em>Mediations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediations()
	 * @generated
	 * @ordered
	 */
	protected EList<DslMediation> mediations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslRelatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoDSLPackage.Literals.DSL_RELATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DslMediation> getMediations() {
		if (mediations == null) {
			mediations = new EObjectContainmentWithInverseEList<DslMediation>(DslMediation.class, this, OntoDSLPackage.DSL_RELATOR__MEDIATIONS, OntoDSLPackage.DSL_MEDIATION__RELATOR);
		}
		return mediations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntoDSLPackage.DSL_RELATOR__MEDIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMediations()).basicAdd(otherEnd, msgs);
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
			case OntoDSLPackage.DSL_RELATOR__MEDIATIONS:
				return ((InternalEList<?>)getMediations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntoDSLPackage.DSL_RELATOR__MEDIATIONS:
				return getMediations();
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
			case OntoDSLPackage.DSL_RELATOR__MEDIATIONS:
				getMediations().clear();
				getMediations().addAll((Collection<? extends DslMediation>)newValue);
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
			case OntoDSLPackage.DSL_RELATOR__MEDIATIONS:
				getMediations().clear();
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
			case OntoDSLPackage.DSL_RELATOR__MEDIATIONS:
				return mediations != null && !mediations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DslRelatorImpl
