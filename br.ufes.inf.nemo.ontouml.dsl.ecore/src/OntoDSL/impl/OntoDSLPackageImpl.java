/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoDSL.impl;

import OntoDSL.Cardinality;
import OntoDSL.DslMediation;
import OntoDSL.DslModel;
import OntoDSL.DslRelator;
import OntoDSL.LiteralAnyCardinality;
import OntoDSL.LiteralAtLeastOneCardinality;
import OntoDSL.LiteralCardinality;
import OntoDSL.LiteralOptionalCardinality;
import OntoDSL.OntoDSLFactory;
import OntoDSL.OntoDSLPackage;

import RefOntoUML.RefOntoUMLPackage;

import org.eclipse.emf.ecore.EAttribute;
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
	private EClass cardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalOptionalCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalAtLeastOneCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalAnyCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalCardinalityEClass = null;

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
	public EReference getDslMediation_Mediated() {
		return (EReference)dslMediationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDslMediation_Cardinality() {
		return (EReference)dslMediationEClass.getEStructuralFeatures().get(2);
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
	public EClass getCardinality() {
		return cardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_Lower() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_Upper() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralOptionalCardinality() {
		return literalOptionalCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralAtLeastOneCardinality() {
		return literalAtLeastOneCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralAnyCardinality() {
		return literalAnyCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralCardinality() {
		return literalCardinalityEClass;
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
		createEReference(dslMediationEClass, DSL_MEDIATION__MEDIATED);
		createEReference(dslMediationEClass, DSL_MEDIATION__CARDINALITY);

		dslRelatorEClass = createEClass(DSL_RELATOR);
		createEReference(dslRelatorEClass, DSL_RELATOR__MEDIATIONS);

		dslModelEClass = createEClass(DSL_MODEL);

		cardinalityEClass = createEClass(CARDINALITY);
		createEAttribute(cardinalityEClass, CARDINALITY__LOWER);
		createEAttribute(cardinalityEClass, CARDINALITY__UPPER);

		literalOptionalCardinalityEClass = createEClass(LITERAL_OPTIONAL_CARDINALITY);

		literalAtLeastOneCardinalityEClass = createEClass(LITERAL_AT_LEAST_ONE_CARDINALITY);

		literalAnyCardinalityEClass = createEClass(LITERAL_ANY_CARDINALITY);

		literalCardinalityEClass = createEClass(LITERAL_CARDINALITY);
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
		dslRelatorEClass.getESuperTypes().add(theRefOntoUMLPackage.getRelator());
		dslModelEClass.getESuperTypes().add(theRefOntoUMLPackage.getModel());
		literalOptionalCardinalityEClass.getESuperTypes().add(this.getLiteralCardinality());
		literalAtLeastOneCardinalityEClass.getESuperTypes().add(this.getLiteralCardinality());
		literalAnyCardinalityEClass.getESuperTypes().add(this.getLiteralCardinality());
		literalCardinalityEClass.getESuperTypes().add(this.getCardinality());

		// Initialize classes and features; add operations and parameters
		initEClass(dslMediationEClass, DslMediation.class, "DslMediation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslMediation_Relator(), this.getDslRelator(), this.getDslRelator_Mediations(), "relator", null, 0, 1, DslMediation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslMediation_Mediated(), theRefOntoUMLPackage.getProperty(), null, "mediated", null, 0, 1, DslMediation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslMediation_Cardinality(), this.getCardinality(), null, "cardinality", null, 0, 1, DslMediation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslRelatorEClass, DslRelator.class, "DslRelator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslRelator_Mediations(), this.getDslMediation(), this.getDslMediation_Relator(), "mediations", null, 1, -1, DslRelator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslModelEClass, DslModel.class, "DslModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinality_Lower(), theRefOntoUMLPackage.getInteger(), "lower", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_Upper(), theRefOntoUMLPackage.getUnlimitedNatural(), "upper", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalOptionalCardinalityEClass, LiteralOptionalCardinality.class, "LiteralOptionalCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalAtLeastOneCardinalityEClass, LiteralAtLeastOneCardinality.class, "LiteralAtLeastOneCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalAnyCardinalityEClass, LiteralAnyCardinality.class, "LiteralAnyCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalCardinalityEClass, LiteralCardinality.class, "LiteralCardinality", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OntoDSLPackageImpl
