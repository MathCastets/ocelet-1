/**
 */
package fr.ocelet.lang.ocelet.impl;

import fr.ocelet.lang.ocelet.OceletPackage;
import fr.ocelet.lang.ocelet.StrucEln;
import fr.ocelet.lang.ocelet.Strucdef;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strucdef</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ocelet.lang.ocelet.impl.StrucdefImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.impl.StrucdefImpl#getTypeArgument <em>Type Argument</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.impl.StrucdefImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.impl.StrucdefImpl#getStrucelns <em>Strucelns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrucdefImpl extends ModElnImpl implements Strucdef
{
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
   * The default value of the '{@link #getTypeArgument() <em>Type Argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeArgument()
   * @generated
   * @ordered
   */
  protected static final String TYPE_ARGUMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypeArgument() <em>Type Argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeArgument()
   * @generated
   * @ordered
   */
  protected String typeArgument = TYPE_ARGUMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getSuperType() <em>Super Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected static final String SUPER_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected String superType = SUPER_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getStrucelns() <em>Strucelns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrucelns()
   * @generated
   * @ordered
   */
  protected EList<StrucEln> strucelns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StrucdefImpl()
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
    return OceletPackage.Literals.STRUCDEF;
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
      eNotify(new ENotificationImpl(this, Notification.SET, OceletPackage.STRUCDEF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTypeArgument()
  {
    return typeArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeArgument(String newTypeArgument)
  {
    String oldTypeArgument = typeArgument;
    typeArgument = newTypeArgument;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OceletPackage.STRUCDEF__TYPE_ARGUMENT, oldTypeArgument, typeArgument));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(String newSuperType)
  {
    String oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OceletPackage.STRUCDEF__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StrucEln> getStrucelns()
  {
    if (strucelns == null)
    {
      strucelns = new EObjectContainmentEList<StrucEln>(StrucEln.class, this, OceletPackage.STRUCDEF__STRUCELNS);
    }
    return strucelns;
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
      case OceletPackage.STRUCDEF__STRUCELNS:
        return ((InternalEList<?>)getStrucelns()).basicRemove(otherEnd, msgs);
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
      case OceletPackage.STRUCDEF__NAME:
        return getName();
      case OceletPackage.STRUCDEF__TYPE_ARGUMENT:
        return getTypeArgument();
      case OceletPackage.STRUCDEF__SUPER_TYPE:
        return getSuperType();
      case OceletPackage.STRUCDEF__STRUCELNS:
        return getStrucelns();
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
      case OceletPackage.STRUCDEF__NAME:
        setName((String)newValue);
        return;
      case OceletPackage.STRUCDEF__TYPE_ARGUMENT:
        setTypeArgument((String)newValue);
        return;
      case OceletPackage.STRUCDEF__SUPER_TYPE:
        setSuperType((String)newValue);
        return;
      case OceletPackage.STRUCDEF__STRUCELNS:
        getStrucelns().clear();
        getStrucelns().addAll((Collection<? extends StrucEln>)newValue);
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
      case OceletPackage.STRUCDEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OceletPackage.STRUCDEF__TYPE_ARGUMENT:
        setTypeArgument(TYPE_ARGUMENT_EDEFAULT);
        return;
      case OceletPackage.STRUCDEF__SUPER_TYPE:
        setSuperType(SUPER_TYPE_EDEFAULT);
        return;
      case OceletPackage.STRUCDEF__STRUCELNS:
        getStrucelns().clear();
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
      case OceletPackage.STRUCDEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OceletPackage.STRUCDEF__TYPE_ARGUMENT:
        return TYPE_ARGUMENT_EDEFAULT == null ? typeArgument != null : !TYPE_ARGUMENT_EDEFAULT.equals(typeArgument);
      case OceletPackage.STRUCDEF__SUPER_TYPE:
        return SUPER_TYPE_EDEFAULT == null ? superType != null : !SUPER_TYPE_EDEFAULT.equals(superType);
      case OceletPackage.STRUCDEF__STRUCELNS:
        return strucelns != null && !strucelns.isEmpty();
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
    result.append(", typeArgument: ");
    result.append(typeArgument);
    result.append(", superType: ");
    result.append(superType);
    result.append(')');
    return result.toString();
  }

} //StrucdefImpl
