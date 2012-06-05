/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoDSL.impl;

import OntoDSL.DslMediation;
import OntoDSL.DslModel;
import OntoDSL.DslRelator;
import OntoDSL.OntoDSLFactory;
import OntoDSL.OntoDSLPackage;

import OntoDSL.OwnedAndNavigableAssociation;
import RefOntoUML.RefOntoUMLPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OntoDSLPackageImpl extends EPackageImpl implements OntoDSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslMediationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslRelatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownedAndNavigableAssociationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see OntoDSL.OntoDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OntoDSLPackageImpl() {
		super(eNS_URI, OntoDSLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OntoDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OntoDSLPackage init() {
		if (isInited) return (OntoDSLPackage)EPackage.Registry.INSTANCE.getEPackage(OntoDSLPackage.eNS_URI);

		// Obtain or create and register package
		OntoDSLPackageImpl theOntoDSLPackage = (OntoDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OntoDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OntoDSLPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RefOntoUMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOntoDSLPackage.createPackageContents();

		// Initialize created meta-data
		theOntoDSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOntoDSLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OntoDSLPackage.eNS_URI, theOntoDSLPackage);
		return theOntoDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDslMediation() {
		return dslMediationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDslMediation_Relator() {
		return (EReference)dslMediationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDslRelator() {
		return dslRelatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDslRelator_Mediations() {
		return (EReference)dslRelatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDslModel() {
		return dslModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwnedAndNavigableAssociation() {
		return ownedAndNavigableAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoDSLFactory getOntoDSLFactory() {
		return (OntoDSLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dslMediationEClass = createEClass(DSL_MEDIATION);
		createEReference(dslMediationEClass, DSL_MEDIATION__RELATOR);

		dslRelatorEClass = createEClass(DSL_RELATOR);
		createEReference(dslRelatorEClass, DSL_RELATOR__MEDIATIONS);

		dslModelEClass = createEClass(DSL_MODEL);

		ownedAndNavigableAssociationEClass = createEClass(OWNED_AND_NAVIGABLE_ASSOCIATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RefOntoUMLPackage theRefOntoUMLPackage = (RefOntoUMLPackage)EPackage.Registry.INSTANCE.getEPackage(RefOntoUMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dslMediationEClass.getESuperTypes().add(theRefOntoUMLPackage.getMediation());
		dslMediationEClass.getESuperTypes().add(this.getOwnedAndNavigableAssociation());
		dslRelatorEClass.getESuperTypes().add(theRefOntoUMLPackage.getRelator());
		dslModelEClass.getESuperTypes().add(theRefOntoUMLPackage.getModel());
		ownedAndNavigableAssociationEClass.getESuperTypes().add(theRefOntoUMLPackage.getAssociation());

		// Initialize classes and features; add operations and parameters
		initEClass(dslMediationEClass, DslMediation.class, "DslMediation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslMediation_Relator(), this.getDslRelator(), this.getDslRelator_Mediations(), "relator", null, 0, 1, DslMediation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(dslMediationEClass, theRefOntoUMLPackage.getProperty(), "getOwnedMediatedEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(dslMediationEClass, null, "setOwnedMediatedEnd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRefOntoUMLPackage.getProperty(), "mediated", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dslRelatorEClass, DslRelator.class, "DslRelator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslRelator_Mediations(), this.getDslMediation(), this.getDslMediation_Relator(), "mediations", null, 1, -1, DslRelator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslModelEClass, DslModel.class, "DslModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ownedAndNavigableAssociationEClass, OwnedAndNavigableAssociation.class, "OwnedAndNavigableAssociation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OntoDSLPackageImpl
