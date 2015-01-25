/**
 */
package fr.ocelet.lang.ocelet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmFormalParameter;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struc Func Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ocelet.lang.ocelet.StrucFuncDef#getParams <em>Params</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.StrucFuncDef#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ocelet.lang.ocelet.OceletPackage#getStrucFuncDef()
 * @model
 * @generated
 */
public interface StrucFuncDef extends StrucEln
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.common.types.JvmFormalParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see fr.ocelet.lang.ocelet.OceletPackage#getStrucFuncDef_Params()
   * @model containment="true"
   * @generated
   */
  EList<JvmFormalParameter> getParams();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(XExpression)
   * @see fr.ocelet.lang.ocelet.OceletPackage#getStrucFuncDef_Body()
   * @model containment="true"
   * @generated
   */
  XExpression getBody();

  /**
   * Sets the value of the '{@link fr.ocelet.lang.ocelet.StrucFuncDef#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(XExpression value);

} // StrucFuncDef
