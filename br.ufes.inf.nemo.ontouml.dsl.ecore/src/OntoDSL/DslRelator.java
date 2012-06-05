/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoDSL;

import RefOntoUML.Relator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Relator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OntoDSL.DslRelator#getMediations <em>Mediations</em>}</li>
 * </ul>
 * </p>
 *
 * @see OntoDSL.OntoDSLPackage#getDslRelator()
 * @model
 * @generated
 */
public interface DslRelator extends Relator {
	/**
	 * Returns the value of the '<em><b>Mediations</b></em>' containment reference list.
	 * The list contents are of type {@link OntoDSL.DslMediation}.
	 * It is bidirectional and its opposite is '{@link OntoDSL.DslMediation#getRelator <em>Relator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediations</em>' containment reference list.
	 * @see OntoDSL.OntoDSLPackage#getDslRelator_Mediations()
	 * @see OntoDSL.DslMediation#getRelator
	 * @model opposite="relator" containment="true" required="true"
	 * @generated
	 */
	EList<DslMediation> getMediations();

} // DslRelator
