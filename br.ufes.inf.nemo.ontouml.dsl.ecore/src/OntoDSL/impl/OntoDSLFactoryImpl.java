/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoDSL.impl;

import OntoDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OntoDSLFactoryImpl extends EFactoryImpl implements OntoDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OntoDSLFactory init() {
		try {
			OntoDSLFactory theOntoDSLFactory = (OntoDSLFactory)EPackage.Registry.INSTANCE.getEFactory("http://nemo.inf.ufes.br/ontouml/dsl"); 
			if (theOntoDSLFactory != null) {
				return theOntoDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OntoDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoDSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OntoDSLPackage.DSL_MEDIATION: return createDslMediation();
			case OntoDSLPackage.DSL_RELATOR: return createDslRelator();
			case OntoDSLPackage.DSL_MODEL: return createDslModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslMediation createDslMediation() {
		DslMediationImpl dslMediation = new DslMediationImpl();
		return dslMediation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslRelator createDslRelator() {
		DslRelatorImpl dslRelator = new DslRelatorImpl();
		return dslRelator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslModel createDslModel() {
		DslModelImpl dslModel = new DslModelImpl();
		return dslModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoDSLPackage getOntoDSLPackage() {
		return (OntoDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OntoDSLPackage getPackage() {
		return OntoDSLPackage.eINSTANCE;
	}

} //OntoDSLFactoryImpl
