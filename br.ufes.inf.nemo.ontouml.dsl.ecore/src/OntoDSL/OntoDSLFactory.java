/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see OntoDSL.OntoDSLPackage
 * @generated
 */
public interface OntoDSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OntoDSLFactory eINSTANCE = OntoDSL.impl.OntoDSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dsl Mediation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Mediation</em>'.
	 * @generated
	 */
	DslMediation createDslMediation();

	/**
	 * Returns a new object of class '<em>Dsl Relator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Relator</em>'.
	 * @generated
	 */
	DslRelator createDslRelator();

	/**
	 * Returns a new object of class '<em>Dsl Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Model</em>'.
	 * @generated
	 */
	DslModel createDslModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OntoDSLPackage getOntoDSLPackage();

} //OntoDSLFactory
