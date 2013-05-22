/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoDSL;

import RefOntoUML.RefOntoUMLPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see OntoDSL.OntoDSLFactory
 * @model kind="package"
 * @generated
 */
public interface OntoDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "OntoDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nemo.inf.ufes.br/ontouml/dsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "OntoDSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OntoDSLPackage eINSTANCE = OntoDSL.impl.OntoDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link OntoDSL.impl.DslMediationImpl <em>Dsl Mediation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoDSL.impl.DslMediationImpl
	 * @see OntoDSL.impl.OntoDSLPackageImpl#getDslMediation()
	 * @generated
	 */
	int DSL_MEDIATION = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__EANNOTATIONS = RefOntoUMLPackage.MEDIATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__OWNED_ELEMENT = RefOntoUMLPackage.MEDIATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__OWNER = RefOntoUMLPackage.MEDIATION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__OWNED_COMMENT = RefOntoUMLPackage.MEDIATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__NAME = RefOntoUMLPackage.MEDIATION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__VISIBILITY = RefOntoUMLPackage.MEDIATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__QUALIFIED_NAME = RefOntoUMLPackage.MEDIATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__CLIENT_DEPENDENCY = RefOntoUMLPackage.MEDIATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__NAMESPACE = RefOntoUMLPackage.MEDIATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__NAME_EXPRESSION = RefOntoUMLPackage.MEDIATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__ELEMENT_IMPORT = RefOntoUMLPackage.MEDIATION__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__PACKAGE_IMPORT = RefOntoUMLPackage.MEDIATION__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__OWNED_RULE = RefOntoUMLPackage.MEDIATION__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__MEMBER = RefOntoUMLPackage.MEDIATION__MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__IMPORTED_MEMBER = RefOntoUMLPackage.MEDIATION__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__OWNED_MEMBER = RefOntoUMLPackage.MEDIATION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__IS_LEAF = RefOntoUMLPackage.MEDIATION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__REDEFINED_ELEMENT = RefOntoUMLPackage.MEDIATION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__REDEFINITION_CONTEXT = RefOntoUMLPackage.MEDIATION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__PACKAGE = RefOntoUMLPackage.MEDIATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__IS_ABSTRACT = RefOntoUMLPackage.MEDIATION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__GENERALIZATION = RefOntoUMLPackage.MEDIATION__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__POWERTYPE_EXTENT = RefOntoUMLPackage.MEDIATION__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__FEATURE = RefOntoUMLPackage.MEDIATION__FEATURE;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__INHERITED_MEMBER = RefOntoUMLPackage.MEDIATION__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__REDEFINED_CLASSIFIER = RefOntoUMLPackage.MEDIATION__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__GENERAL = RefOntoUMLPackage.MEDIATION__GENERAL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__ATTRIBUTE = RefOntoUMLPackage.MEDIATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__RELATED_ELEMENT = RefOntoUMLPackage.MEDIATION__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__OWNED_END = RefOntoUMLPackage.MEDIATION__OWNED_END;

	/**
	 * The feature id for the '<em><b>Member End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__MEMBER_END = RefOntoUMLPackage.MEDIATION__MEMBER_END;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__IS_DERIVED = RefOntoUMLPackage.MEDIATION__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>End Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__END_TYPE = RefOntoUMLPackage.MEDIATION__END_TYPE;

	/**
	 * The feature id for the '<em><b>Navigable Owned End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__NAVIGABLE_OWNED_END = RefOntoUMLPackage.MEDIATION__NAVIGABLE_OWNED_END;

	/**
	 * The feature id for the '<em><b>Relator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__RELATOR = RefOntoUMLPackage.MEDIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mediated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__MEDIATED = RefOntoUMLPackage.MEDIATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION__CARDINALITY = RefOntoUMLPackage.MEDIATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dsl Mediation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MEDIATION_FEATURE_COUNT = RefOntoUMLPackage.MEDIATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link OntoDSL.impl.DslRelatorImpl <em>Dsl Relator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoDSL.impl.DslRelatorImpl
	 * @see OntoDSL.impl.OntoDSLPackageImpl#getDslRelator()
	 * @generated
	 */
	int DSL_RELATOR = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__EANNOTATIONS = RefOntoUMLPackage.RELATOR__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__OWNED_ELEMENT = RefOntoUMLPackage.RELATOR__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__OWNER = RefOntoUMLPackage.RELATOR__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__OWNED_COMMENT = RefOntoUMLPackage.RELATOR__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__NAME = RefOntoUMLPackage.RELATOR__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__VISIBILITY = RefOntoUMLPackage.RELATOR__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__QUALIFIED_NAME = RefOntoUMLPackage.RELATOR__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__CLIENT_DEPENDENCY = RefOntoUMLPackage.RELATOR__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__NAMESPACE = RefOntoUMLPackage.RELATOR__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__NAME_EXPRESSION = RefOntoUMLPackage.RELATOR__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__ELEMENT_IMPORT = RefOntoUMLPackage.RELATOR__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__PACKAGE_IMPORT = RefOntoUMLPackage.RELATOR__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__OWNED_RULE = RefOntoUMLPackage.RELATOR__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__MEMBER = RefOntoUMLPackage.RELATOR__MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__IMPORTED_MEMBER = RefOntoUMLPackage.RELATOR__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__OWNED_MEMBER = RefOntoUMLPackage.RELATOR__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__IS_LEAF = RefOntoUMLPackage.RELATOR__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__REDEFINED_ELEMENT = RefOntoUMLPackage.RELATOR__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__REDEFINITION_CONTEXT = RefOntoUMLPackage.RELATOR__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__PACKAGE = RefOntoUMLPackage.RELATOR__PACKAGE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__IS_ABSTRACT = RefOntoUMLPackage.RELATOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__GENERALIZATION = RefOntoUMLPackage.RELATOR__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__POWERTYPE_EXTENT = RefOntoUMLPackage.RELATOR__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__FEATURE = RefOntoUMLPackage.RELATOR__FEATURE;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__INHERITED_MEMBER = RefOntoUMLPackage.RELATOR__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__REDEFINED_CLASSIFIER = RefOntoUMLPackage.RELATOR__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__GENERAL = RefOntoUMLPackage.RELATOR__GENERAL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__ATTRIBUTE = RefOntoUMLPackage.RELATOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__NESTED_CLASSIFIER = RefOntoUMLPackage.RELATOR__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__SUPER_CLASS = RefOntoUMLPackage.RELATOR__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__IS_ACTIVE = RefOntoUMLPackage.RELATOR__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__OWNED_ATTRIBUTE = RefOntoUMLPackage.RELATOR__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Mediations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR__MEDIATIONS = RefOntoUMLPackage.RELATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dsl Relator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RELATOR_FEATURE_COUNT = RefOntoUMLPackage.RELATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link OntoDSL.impl.DslModelImpl <em>Dsl Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoDSL.impl.DslModelImpl
	 * @see OntoDSL.impl.OntoDSLPackageImpl#getDslModel()
	 * @generated
	 */
	int DSL_MODEL = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__EANNOTATIONS = RefOntoUMLPackage.MODEL__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__OWNED_ELEMENT = RefOntoUMLPackage.MODEL__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__OWNER = RefOntoUMLPackage.MODEL__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__OWNED_COMMENT = RefOntoUMLPackage.MODEL__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__NAME = RefOntoUMLPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__VISIBILITY = RefOntoUMLPackage.MODEL__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__QUALIFIED_NAME = RefOntoUMLPackage.MODEL__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__CLIENT_DEPENDENCY = RefOntoUMLPackage.MODEL__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__NAMESPACE = RefOntoUMLPackage.MODEL__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__NAME_EXPRESSION = RefOntoUMLPackage.MODEL__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__ELEMENT_IMPORT = RefOntoUMLPackage.MODEL__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__PACKAGE_IMPORT = RefOntoUMLPackage.MODEL__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__OWNED_RULE = RefOntoUMLPackage.MODEL__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__MEMBER = RefOntoUMLPackage.MODEL__MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__IMPORTED_MEMBER = RefOntoUMLPackage.MODEL__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__OWNED_MEMBER = RefOntoUMLPackage.MODEL__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__OWNED_TYPE = RefOntoUMLPackage.MODEL__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Package Merge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__PACKAGE_MERGE = RefOntoUMLPackage.MODEL__PACKAGE_MERGE;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__PACKAGED_ELEMENT = RefOntoUMLPackage.MODEL__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__NESTED_PACKAGE = RefOntoUMLPackage.MODEL__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__NESTING_PACKAGE = RefOntoUMLPackage.MODEL__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__VIEWPOINT = RefOntoUMLPackage.MODEL__VIEWPOINT;

	/**
	 * The number of structural features of the '<em>Dsl Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL_FEATURE_COUNT = RefOntoUMLPackage.MODEL_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link OntoDSL.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoDSL.impl.CardinalityImpl
	 * @see OntoDSL.impl.OntoDSLPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 3;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__LOWER = 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__UPPER = 1;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link OntoDSL.impl.LiteralCardinalityImpl <em>Literal Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoDSL.impl.LiteralCardinalityImpl
	 * @see OntoDSL.impl.OntoDSLPackageImpl#getLiteralCardinality()
	 * @generated
	 */
	int LITERAL_CARDINALITY = 7;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CARDINALITY__LOWER = CARDINALITY__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CARDINALITY__UPPER = CARDINALITY__UPPER;

	/**
	 * The number of structural features of the '<em>Literal Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CARDINALITY_FEATURE_COUNT = CARDINALITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link OntoDSL.impl.LiteralOptionalCardinalityImpl <em>Literal Optional Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoDSL.impl.LiteralOptionalCardinalityImpl
	 * @see OntoDSL.impl.OntoDSLPackageImpl#getLiteralOptionalCardinality()
	 * @generated
	 */
	int LITERAL_OPTIONAL_CARDINALITY = 4;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPTIONAL_CARDINALITY__LOWER = LITERAL_CARDINALITY__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPTIONAL_CARDINALITY__UPPER = LITERAL_CARDINALITY__UPPER;

	/**
	 * The number of structural features of the '<em>Literal Optional Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPTIONAL_CARDINALITY_FEATURE_COUNT = LITERAL_CARDINALITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link OntoDSL.impl.LiteralAtLeastOneCardinalityImpl <em>Literal At Least One Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoDSL.impl.LiteralAtLeastOneCardinalityImpl
	 * @see OntoDSL.impl.OntoDSLPackageImpl#getLiteralAtLeastOneCardinality()
	 * @generated
	 */
	int LITERAL_AT_LEAST_ONE_CARDINALITY = 5;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_AT_LEAST_ONE_CARDINALITY__LOWER = LITERAL_CARDINALITY__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_AT_LEAST_ONE_CARDINALITY__UPPER = LITERAL_CARDINALITY__UPPER;

	/**
	 * The number of structural features of the '<em>Literal At Least One Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_AT_LEAST_ONE_CARDINALITY_FEATURE_COUNT = LITERAL_CARDINALITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link OntoDSL.impl.LiteralAnyCardinalityImpl <em>Literal Any Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OntoDSL.impl.LiteralAnyCardinalityImpl
	 * @see OntoDSL.impl.OntoDSLPackageImpl#getLiteralAnyCardinality()
	 * @generated
	 */
	int LITERAL_ANY_CARDINALITY = 6;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ANY_CARDINALITY__LOWER = LITERAL_CARDINALITY__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ANY_CARDINALITY__UPPER = LITERAL_CARDINALITY__UPPER;

	/**
	 * The number of structural features of the '<em>Literal Any Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ANY_CARDINALITY_FEATURE_COUNT = LITERAL_CARDINALITY_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link OntoDSL.DslMediation <em>Dsl Mediation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Mediation</em>'.
	 * @see OntoDSL.DslMediation
	 * @generated
	 */
	EClass getDslMediation();

	/**
	 * Returns the meta object for the container reference '{@link OntoDSL.DslMediation#getRelator <em>Relator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Relator</em>'.
	 * @see OntoDSL.DslMediation#getRelator()
	 * @see #getDslMediation()
	 * @generated
	 */
	EReference getDslMediation_Relator();

	/**
	 * Returns the meta object for the containment reference '{@link OntoDSL.DslMediation#getMediated <em>Mediated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mediated</em>'.
	 * @see OntoDSL.DslMediation#getMediated()
	 * @see #getDslMediation()
	 * @generated
	 */
	EReference getDslMediation_Mediated();

	/**
	 * Returns the meta object for the containment reference '{@link OntoDSL.DslMediation#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see OntoDSL.DslMediation#getCardinality()
	 * @see #getDslMediation()
	 * @generated
	 */
	EReference getDslMediation_Cardinality();

	/**
	 * Returns the meta object for class '{@link OntoDSL.DslRelator <em>Dsl Relator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Relator</em>'.
	 * @see OntoDSL.DslRelator
	 * @generated
	 */
	EClass getDslRelator();

	/**
	 * Returns the meta object for the containment reference list '{@link OntoDSL.DslRelator#getMediations <em>Mediations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mediations</em>'.
	 * @see OntoDSL.DslRelator#getMediations()
	 * @see #getDslRelator()
	 * @generated
	 */
	EReference getDslRelator_Mediations();

	/**
	 * Returns the meta object for class '{@link OntoDSL.DslModel <em>Dsl Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Model</em>'.
	 * @see OntoDSL.DslModel
	 * @generated
	 */
	EClass getDslModel();

	/**
	 * Returns the meta object for class '{@link OntoDSL.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see OntoDSL.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the attribute '{@link OntoDSL.Cardinality#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see OntoDSL.Cardinality#getLower()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_Lower();

	/**
	 * Returns the meta object for the attribute '{@link OntoDSL.Cardinality#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see OntoDSL.Cardinality#getUpper()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_Upper();

	/**
	 * Returns the meta object for class '{@link OntoDSL.LiteralOptionalCardinality <em>Literal Optional Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Optional Cardinality</em>'.
	 * @see OntoDSL.LiteralOptionalCardinality
	 * @generated
	 */
	EClass getLiteralOptionalCardinality();

	/**
	 * Returns the meta object for class '{@link OntoDSL.LiteralAtLeastOneCardinality <em>Literal At Least One Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal At Least One Cardinality</em>'.
	 * @see OntoDSL.LiteralAtLeastOneCardinality
	 * @generated
	 */
	EClass getLiteralAtLeastOneCardinality();

	/**
	 * Returns the meta object for class '{@link OntoDSL.LiteralAnyCardinality <em>Literal Any Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Any Cardinality</em>'.
	 * @see OntoDSL.LiteralAnyCardinality
	 * @generated
	 */
	EClass getLiteralAnyCardinality();

	/**
	 * Returns the meta object for class '{@link OntoDSL.LiteralCardinality <em>Literal Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Cardinality</em>'.
	 * @see OntoDSL.LiteralCardinality
	 * @generated
	 */
	EClass getLiteralCardinality();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OntoDSLFactory getOntoDSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link OntoDSL.impl.DslMediationImpl <em>Dsl Mediation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoDSL.impl.DslMediationImpl
		 * @see OntoDSL.impl.OntoDSLPackageImpl#getDslMediation()
		 * @generated
		 */
		EClass DSL_MEDIATION = eINSTANCE.getDslMediation();

		/**
		 * The meta object literal for the '<em><b>Relator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_MEDIATION__RELATOR = eINSTANCE.getDslMediation_Relator();

		/**
		 * The meta object literal for the '<em><b>Mediated</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_MEDIATION__MEDIATED = eINSTANCE.getDslMediation_Mediated();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_MEDIATION__CARDINALITY = eINSTANCE.getDslMediation_Cardinality();

		/**
		 * The meta object literal for the '{@link OntoDSL.impl.DslRelatorImpl <em>Dsl Relator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoDSL.impl.DslRelatorImpl
		 * @see OntoDSL.impl.OntoDSLPackageImpl#getDslRelator()
		 * @generated
		 */
		EClass DSL_RELATOR = eINSTANCE.getDslRelator();

		/**
		 * The meta object literal for the '<em><b>Mediations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_RELATOR__MEDIATIONS = eINSTANCE.getDslRelator_Mediations();

		/**
		 * The meta object literal for the '{@link OntoDSL.impl.DslModelImpl <em>Dsl Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoDSL.impl.DslModelImpl
		 * @see OntoDSL.impl.OntoDSLPackageImpl#getDslModel()
		 * @generated
		 */
		EClass DSL_MODEL = eINSTANCE.getDslModel();

		/**
		 * The meta object literal for the '{@link OntoDSL.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoDSL.impl.CardinalityImpl
		 * @see OntoDSL.impl.OntoDSLPackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__LOWER = eINSTANCE.getCardinality_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__UPPER = eINSTANCE.getCardinality_Upper();

		/**
		 * The meta object literal for the '{@link OntoDSL.impl.LiteralOptionalCardinalityImpl <em>Literal Optional Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoDSL.impl.LiteralOptionalCardinalityImpl
		 * @see OntoDSL.impl.OntoDSLPackageImpl#getLiteralOptionalCardinality()
		 * @generated
		 */
		EClass LITERAL_OPTIONAL_CARDINALITY = eINSTANCE.getLiteralOptionalCardinality();

		/**
		 * The meta object literal for the '{@link OntoDSL.impl.LiteralAtLeastOneCardinalityImpl <em>Literal At Least One Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoDSL.impl.LiteralAtLeastOneCardinalityImpl
		 * @see OntoDSL.impl.OntoDSLPackageImpl#getLiteralAtLeastOneCardinality()
		 * @generated
		 */
		EClass LITERAL_AT_LEAST_ONE_CARDINALITY = eINSTANCE.getLiteralAtLeastOneCardinality();

		/**
		 * The meta object literal for the '{@link OntoDSL.impl.LiteralAnyCardinalityImpl <em>Literal Any Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoDSL.impl.LiteralAnyCardinalityImpl
		 * @see OntoDSL.impl.OntoDSLPackageImpl#getLiteralAnyCardinality()
		 * @generated
		 */
		EClass LITERAL_ANY_CARDINALITY = eINSTANCE.getLiteralAnyCardinality();

		/**
		 * The meta object literal for the '{@link OntoDSL.impl.LiteralCardinalityImpl <em>Literal Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OntoDSL.impl.LiteralCardinalityImpl
		 * @see OntoDSL.impl.OntoDSLPackageImpl#getLiteralCardinality()
		 * @generated
		 */
		EClass LITERAL_CARDINALITY = eINSTANCE.getLiteralCardinality();

	}

} //OntoDSLPackage
