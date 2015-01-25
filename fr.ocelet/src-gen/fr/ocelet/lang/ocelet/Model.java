/**
 */
package fr.ocelet.lang.ocelet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ocelet.lang.ocelet.Model#getName <em>Name</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.Model#getModelns <em>Modelns</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ocelet.lang.ocelet.OceletPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
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
   * @see fr.ocelet.lang.ocelet.OceletPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.ocelet.lang.ocelet.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Modelns</b></em>' containment reference list.
   * The list contents are of type {@link fr.ocelet.lang.ocelet.ModEln}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modelns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modelns</em>' containment reference list.
   * @see fr.ocelet.lang.ocelet.OceletPackage#getModel_Modelns()
   * @model containment="true"
   * @generated
   */
  EList<ModEln> getModelns();

} // Model
