/**
 */
package fr.ocelet.lang.ocelet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ocelet.lang.ocelet.Parameter#getPtype <em>Ptype</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.Parameter#getParamparts <em>Paramparts</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ocelet.lang.ocelet.OceletPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Ptype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ptype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ptype</em>' containment reference.
   * @see #setPtype(JvmTypeReference)
   * @see fr.ocelet.lang.ocelet.OceletPackage#getParameter_Ptype()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getPtype();

  /**
   * Sets the value of the '{@link fr.ocelet.lang.ocelet.Parameter#getPtype <em>Ptype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ptype</em>' containment reference.
   * @see #getPtype()
   * @generated
   */
  void setPtype(JvmTypeReference value);

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
   * @see fr.ocelet.lang.ocelet.OceletPackage#getParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.ocelet.lang.ocelet.Parameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Paramparts</b></em>' containment reference list.
   * The list contents are of type {@link fr.ocelet.lang.ocelet.Parampart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paramparts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paramparts</em>' containment reference list.
   * @see fr.ocelet.lang.ocelet.OceletPackage#getParameter_Paramparts()
   * @model containment="true"
   * @generated
   */
  EList<Parampart> getParamparts();

} // Parameter
