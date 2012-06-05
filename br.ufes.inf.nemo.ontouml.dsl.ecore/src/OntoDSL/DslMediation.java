/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoDSL;

import RefOntoUML.Mediation;
import RefOntoUML.Property;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Mediation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OntoDSL.DslMediation#getRelator <em>Relator</em>}</li>
 * </ul>
 * </p>
 *
 * @see OntoDSL.OntoDSLPackage#getDslMediation()
 * @model
 * @generated
 */
public interface DslMediation extends Mediation, OwnedAndNavigableAssociation {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Property getOwnedMediatedEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setOwnedMediatedEnd(Property mediated);

} // DslMediation
