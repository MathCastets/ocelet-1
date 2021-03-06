/**
 * generated by Xtext 2.9.1
 */
package fr.ocelet.lang.ocelet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ocelet.lang.ocelet.Entity#getName <em>Name</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.Entity#getEntelns <em>Entelns</em>}</li>
 * </ul>
 *
 * @see fr.ocelet.lang.ocelet.OceletPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends ModEln, Matchtype
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.ocelet.lang.ocelet.OceletPackage#getEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.ocelet.lang.ocelet.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Entelns</b></em>' containment reference list.
   * The list contents are of type {@link fr.ocelet.lang.ocelet.EntityElements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entelns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entelns</em>' containment reference list.
   * @see fr.ocelet.lang.ocelet.OceletPackage#getEntity_Entelns()
   * @model containment="true"
   * @generated
   */
  EList<EntityElements> getEntelns();

} // Entity
