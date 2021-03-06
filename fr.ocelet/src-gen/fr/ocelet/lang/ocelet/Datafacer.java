/**
 * generated by Xtext 2.9.1
 */
package fr.ocelet.lang.ocelet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datafacer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ocelet.lang.ocelet.Datafacer#getName <em>Name</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.Datafacer#getStoretype <em>Storetype</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.Datafacer#getArguments <em>Arguments</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.Datafacer#getMatchbox <em>Matchbox</em>}</li>
 * </ul>
 *
 * @see fr.ocelet.lang.ocelet.OceletPackage#getDatafacer()
 * @model
 * @generated
 */
public interface Datafacer extends ModEln
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
   * @see fr.ocelet.lang.ocelet.OceletPackage#getDatafacer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.ocelet.lang.ocelet.Datafacer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Storetype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Storetype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Storetype</em>' attribute.
   * @see #setStoretype(String)
   * @see fr.ocelet.lang.ocelet.OceletPackage#getDatafacer_Storetype()
   * @model
   * @generated
   */
  String getStoretype();

  /**
   * Sets the value of the '{@link fr.ocelet.lang.ocelet.Datafacer#getStoretype <em>Storetype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Storetype</em>' attribute.
   * @see #getStoretype()
   * @generated
   */
  void setStoretype(String value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see fr.ocelet.lang.ocelet.OceletPackage#getDatafacer_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getArguments();

  /**
   * Returns the value of the '<em><b>Matchbox</b></em>' containment reference list.
   * The list contents are of type {@link fr.ocelet.lang.ocelet.Match}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Matchbox</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Matchbox</em>' containment reference list.
   * @see fr.ocelet.lang.ocelet.OceletPackage#getDatafacer_Matchbox()
   * @model containment="true"
   * @generated
   */
  EList<Match> getMatchbox();

} // Datafacer
