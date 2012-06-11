/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoDSL.impl;

import OntoDSL.DslModel;
import OntoDSL.OntoDSLPackage;
import OntoDSL.adapter.DslAdapterFactory;
import OntoDSL.adapter.OwnedMemberObserver;

import RefOntoUML.impl.ModelImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DslModelImpl extends ModelImpl implements DslModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DslModelImpl() {
		super();
		
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
		return OntoDSLPackage.Literals.DSL_MODEL;
	}

} //DslModelImpl
