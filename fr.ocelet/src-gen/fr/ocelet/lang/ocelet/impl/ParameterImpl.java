/**
 */
package fr.ocelet.lang.ocelet.impl;

import fr.ocelet.lang.ocelet.OceletPackage;
import fr.ocelet.lang.ocelet.Parameter;
import fr.ocelet.lang.ocelet.Parampart;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ocelet.lang.ocelet.impl.ParameterImpl#getPtype <em>Ptype</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.impl.ParameterImpl#getParamparts <em>Paramparts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter
{
  /**
   * The cached value of the '{@link #getPtype() <em>Ptype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPtype()
   * @generated
   * @ordered
   */
  protected JvmTypeReference ptype;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParamparts() <em>Paramparts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamparts()
   * @generated
   * @ordered
   */
  protected EList<Parampart> paramparts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterImpl()
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
    return OceletPackage.Literals.PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getPtype()
  {
    return ptype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPtype(JvmTypeReference newPtype, NotificationChain msgs)
  {
    JvmTypeReference oldPtype = ptype;
    ptype = newPtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OceletPackage.PARAMETER__PTYPE, oldPtype, newPtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPtype(JvmTypeReference newPtype)
  {
    if (newPtype != ptype)
    {
      NotificationChain msgs = null;
      if (ptype != null)
        msgs = ((InternalEObject)ptype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OceletPackage.PARAMETER__PTYPE, null, msgs);
      if (newPtype != null)
        msgs = ((InternalEObject)newPtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OceletPackage.PARAMETER__PTYPE, null, msgs);
      msgs = basicSetPtype(newPtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OceletPackage.PARAMETER__PTYPE, newPtype, newPtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OceletPackage.PARAMETER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parampart> getParamparts()
  {
    if (paramparts == null)
    {
      paramparts = new EObjectContainmentEList<Parampart>(Parampart.class, this, OceletPackage.PARAMETER__PARAMPARTS);
    }
    return paramparts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OceletPackage.PARAMETER__PTYPE:
        return basicSetPtype(null, msgs);
      case OceletPackage.PARAMETER__PARAMPARTS:
        return ((InternalEList<?>)getParamparts()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case OceletPackage.PARAMETER__PTYPE:
        return getPtype();
      case OceletPackage.PARAMETER__NAME:
        return getName();
      case OceletPackage.PARAMETER__PARAMPARTS:
        return getParamparts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OceletPackage.PARAMETER__PTYPE:
        setPtype((JvmTypeReference)newValue);
        return;
      case OceletPackage.PARAMETER__NAME:
        setName((String)newValue);
        return;
      case OceletPackage.PARAMETER__PARAMPARTS:
        getParamparts().clear();
        getParamparts().addAll((Collection<? extends Parampart>)newValue);
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
      case OceletPackage.PARAMETER__PTYPE:
        setPtype((JvmTypeReference)null);
        return;
      case OceletPackage.PARAMETER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OceletPackage.PARAMETER__PARAMPARTS:
        getParamparts().clear();
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
      case OceletPackage.PARAMETER__PTYPE:
        return ptype != null;
      case OceletPackage.PARAMETER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OceletPackage.PARAMETER__PARAMPARTS:
        return paramparts != null && !paramparts.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ParameterImpl
