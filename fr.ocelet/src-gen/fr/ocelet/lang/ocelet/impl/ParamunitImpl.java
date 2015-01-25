/**
 */
package fr.ocelet.lang.ocelet.impl;

import fr.ocelet.lang.ocelet.OceletPackage;
import fr.ocelet.lang.ocelet.Paramunit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paramunit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ocelet.lang.ocelet.impl.ParamunitImpl#getParunit <em>Parunit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamunitImpl extends ParampartImpl implements Paramunit
{
  /**
   * The default value of the '{@link #getParunit() <em>Parunit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParunit()
   * @generated
   * @ordered
   */
  protected static final String PARUNIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParunit() <em>Parunit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParunit()
   * @generated
   * @ordered
   */
  protected String parunit = PARUNIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParamunitImpl()
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
    return OceletPackage.Literals.PARAMUNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParunit()
  {
    return parunit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParunit(String newParunit)
  {
    String oldParunit = parunit;
    parunit = newParunit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OceletPackage.PARAMUNIT__PARUNIT, oldParunit, parunit));
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
      case OceletPackage.PARAMUNIT__PARUNIT:
        return getParunit();
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
      case OceletPackage.PARAMUNIT__PARUNIT:
        setParunit((String)newValue);
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
      case OceletPackage.PARAMUNIT__PARUNIT:
        setParunit(PARUNIT_EDEFAULT);
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
      case OceletPackage.PARAMUNIT__PARUNIT:
        return PARUNIT_EDEFAULT == null ? parunit != null : !PARUNIT_EDEFAULT.equals(parunit);
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
    result.append(" (parunit: ");
    result.append(parunit);
    result.append(')');
    return result.toString();
  }

} //ParamunitImpl
