/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoDSL.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>OntoDSL</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class OntoDSLTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new OntoDSLTests("OntoDSL Tests");
		suite.addTestSuite(DslMediationTest.class);
		suite.addTestSuite(DslRelatorTest.class);
		suite.addTestSuite(DslModelTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoDSLTests(String name) {
		super(name);
	}

} //OntoDSLTests
