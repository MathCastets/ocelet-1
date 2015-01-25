/**
 */
package fr.ocelet.lang.ocelet.impl;

import fr.ocelet.lang.ocelet.OceletPackage;
import fr.ocelet.lang.ocelet.Paramdefa;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paramdefa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ocelet.lang.ocelet.impl.ParamdefaImpl#getPardefa <em>Pardefa</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamdefaImpl extends ParampartImpl implements Paramdefa
{
  /**
   * The default value of the '{@link #getPardefa() <em>Pardefa</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPardefa()
   * @generated
   * @ordered
   */
  protected static final String PARDEFA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPardefa() <em>Pardefa</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPardefa()
   * @generated
   * @ordered
   */
  protected String pardefa = PARDEFA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParamdefaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OceletPackage.Literals.PARAMDEFA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPardefa()
  {
    return pardefa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPardefa(String newPardefa)
  {
    String oldPardefa = pardefa;
    pardefa = newPardefa;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OceletPackage.PARAMDEFA__PARDEFA, oldPardefa, pardefa));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OceletPackage.PARAMDEFA__PARDEFA:
        return getPardefa();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OceletPackage.PARAMDEFA__PARDEFA:
        setPardefa((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OceletPackage.PARAMDEFA__PARDEFA:
        setPardefa(PARDEFA_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OceletPackage.PARAMDEFA__PARDEFA:
        return PARDEFA_EDEFAULT == null ? pardefa != null : !PARDEFA_EDEFAULT.equals(pardefa);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (pardefa: ");
    result.append(pardefa);
    result.append(')');
    return result.toString();
  }

} //ParamdefaImpl
