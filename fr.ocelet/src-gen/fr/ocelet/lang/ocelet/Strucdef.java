/**
 */
package fr.ocelet.lang.ocelet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strucdef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ocelet.lang.ocelet.Strucdef#getName <em>Name</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.Strucdef#getTypeArgument <em>Type Argument</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.Strucdef#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.Strucdef#getStrucelns <em>Strucelns</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ocelet.lang.ocelet.OceletPackage#getStrucdef()
 * @model
 * @generated
 */
public interface Strucdef extends ModEln, Matchtype
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
   * @see fr.ocelet.lang.ocelet.OceletPackage#getStrucdef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.ocelet.lang.ocelet.Strucdef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type Argument</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Argument</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Argument</em>' attribute.
   * @see #setTypeArgument(String)
   * @see fr.ocelet.lang.ocelet.OceletPackage#getStrucdef_TypeArgument()
   * @model
   * @generated
   */
  String getTypeArgument();

  /**
   * Sets the value of the '{@link fr.ocelet.lang.ocelet.Strucdef#getTypeArgument <em>Type Argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Argument</em>' attribute.
   * @see #getTypeArgument()
   * @generated
   */
  void setTypeArgument(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' attribute.
   * @see #setSuperType(String)
   * @see fr.ocelet.lang.ocelet.OceletPackage#getStrucdef_SuperType()
   * @model
   * @generated
   */
  String getSuperType();

  /**
   * Sets the value of the '{@link fr.ocelet.lang.ocelet.Strucdef#getSuperType <em>Super Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' attribute.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(String value);

  /**
   * Returns the value of the '<em><b>Strucelns</b></em>' containment reference list.
   * The list contents are of type {@link fr.ocelet.lang.ocelet.StrucEln}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strucelns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strucelns</em>' containment reference list.
   * @see fr.ocelet.lang.ocelet.OceletPackage#getStrucdef_Strucelns()
   * @model containment="true"
   * @generated
   */
  EList<StrucEln> getStrucelns();

} // Strucdef
