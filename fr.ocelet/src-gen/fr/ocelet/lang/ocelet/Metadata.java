/**
 */
package fr.ocelet.lang.ocelet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ocelet.lang.ocelet.Metadata#getDesc <em>Desc</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.Metadata#getWebp <em>Webp</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.Metadata#getParamdefs <em>Paramdefs</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ocelet.lang.ocelet.OceletPackage#getMetadata()
 * @model
 * @generated
 */
public interface Metadata extends ModEln
{
  /**
   * Returns the value of the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Desc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Desc</em>' attribute.
   * @see #setDesc(String)
   * @see fr.ocelet.lang.ocelet.OceletPackage#getMetadata_Desc()
   * @model
   * @generated
   */
  String getDesc();

  /**
   * Sets the value of the '{@link fr.ocelet.lang.ocelet.Metadata#getDesc <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desc</em>' attribute.
   * @see #getDesc()
   * @generated
   */
  void setDesc(String value);

  /**
   * Returns the value of the '<em><b>Webp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Webp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Webp</em>' attribute.
   * @see #setWebp(String)
   * @see fr.ocelet.lang.ocelet.OceletPackage#getMetadata_Webp()
   * @model
   * @generated
   */
  String getWebp();

  /**
   * Sets the value of the '{@link fr.ocelet.lang.ocelet.Metadata#getWebp <em>Webp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Webp</em>' attribute.
   * @see #getWebp()
   * @generated
   */
  void setWebp(String value);

  /**
   * Returns the value of the '<em><b>Paramdefs</b></em>' containment reference list.
   * The list contents are of type {@link fr.ocelet.lang.ocelet.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paramdefs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paramdefs</em>' containment reference list.
   * @see fr.ocelet.lang.ocelet.OceletPackage#getMetadata_Paramdefs()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParamdefs();

} // Metadata
