/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoDSL.impl;

import OntoDSL.OntoDSLPackage;
import OntoDSL.OwnedAndNavigableAssociation;
import OntoDSL.adapter.DslAdapterFactory;
import OntoDSL.adapter.OwnedMemberObserver;

import RefOntoUML.impl.AssociationImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owned And Navigable Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class OwnedAndNavigableAssociationImpl extends AssociationImpl implements OwnedAndNavigableAssociation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected OwnedAndNavigableAssociationImpl() {
		super();

		this.eAdapters().add(new OwnedMemberObserver());
		
//		DslAdapterFactory factory = new DslAdapterFactory();
//		factory.adapt(this, OwnedMemberObserver.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoDSLPackage.Literals.OWNED_AND_NAVIGABLE_ASSOCIATION;
	}

} //OwnedAndNavigableAssociationImpl
