/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoDSL;

import RefOntoUML.Mediation;
import RefOntoUML.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Mediation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OntoDSL.DslMediation#getRelator <em>Relator</em>}</li>
 *   <li>{@link OntoDSL.DslMediation#getMediated <em>Mediated</em>}</li>
 *   <li>{@link OntoDSL.DslMediation#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see OntoDSL.OntoDSLPackage#getDslMediation()
 * @model
 * @generated
 */
public interface DslMediation extends Mediation {
	/**
	 * Returns the value of the '<em><b>Relator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link OntoDSL.DslRelator#getMediations <em>Mediations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relator</em>' container reference.
	 * @see #setRelator(DslRelator)
	 * @see OntoDSL.OntoDSLPackage#getDslMediation_Relator()
	 * @see OntoDSL.DslRelator#getMediations
	 * @model opposite="mediations" transient="false"
	 * @generated
	 */
	DslRelator getRelator();

	/**
	 * Sets the value of the '{@link OntoDSL.DslMediation#getRelator <em>Relator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relator</em>' container reference.
	 * @see #getRelator()
	 * @generated
	 */
	void setRelator(DslRelator value);

	/**
	 * Returns the value of the '<em><b>Mediated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediated</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediated</em>' containment reference.
	 * @see #setMediated(Property)
	 * @see OntoDSL.OntoDSLPackage#getDslMediation_Mediated()
	 * @model containment="true"
	 * @generated
	 */
	Property getMediated();

	/**
	 * Sets the value of the '{@link OntoDSL.DslMediation#getMediated <em>Mediated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediated</em>' containment reference.
	 * @see #getMediated()
	 * @generated
	 */
	void setMediated(Property value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see OntoDSL.OntoDSLPackage#getDslMediation_Cardinality()
	 * @model containment="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link OntoDSL.DslMediation#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

} // DslMediation
