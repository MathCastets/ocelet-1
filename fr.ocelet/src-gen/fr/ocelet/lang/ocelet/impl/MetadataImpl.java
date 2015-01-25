/**
 */
package fr.ocelet.lang.ocelet.impl;

import fr.ocelet.lang.ocelet.Metadata;
import fr.ocelet.lang.ocelet.OceletPackage;
import fr.ocelet.lang.ocelet.Parameter;

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
 * An implementation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ocelet.lang.ocelet.impl.MetadataImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.impl.MetadataImpl#getWebp <em>Webp</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.impl.MetadataImpl#getParamdefs <em>Paramdefs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetadataImpl extends ModElnImpl implements Metadata
{
  /**
   * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected static final String DESC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected String desc = DESC_EDEFAULT;

  /**
   * The default value of the '{@link #getWebp() <em>Webp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWebp()
   * @generated
   * @ordered
   */
  protected static final String WEBP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWebp() <em>Webp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWebp()
   * @generated
   * @ordered
   */
  protected String webp = WEBP_EDEFAULT;

  /**
   * The cached value of the '{@link #getParamdefs() <em>Paramdefs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamdefs()
   * @generated
   * @ordered
   */
  protected EList<Parameter> paramdefs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetadataImpl()
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
    return OceletPackage.Literals.METADATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDesc()
  {
    return desc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesc(String newDesc)
  {
    String oldDesc = desc;
    desc = newDesc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OceletPackage.METADATA__DESC, oldDesc, desc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWebp()
  {
    return webp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWebp(String newWebp)
  {
    String oldWebp = webp;
    webp = newWebp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OceletPackage.METADATA__WEBP, oldWebp, webp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParamdefs()
  {
    if (paramdefs == null)
    {
      paramdefs = new EObjectContainmentEList<Parameter>(Parameter.class, this, OceletPackage.METADATA__PARAMDEFS);
    }
    return paramdefs;
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
      case OceletPackage.METADATA__PARAMDEFS:
        return ((InternalEList<?>)getParamdefs()).basicRemove(otherEnd, msgs);
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
      case OceletPackage.METADATA__DESC:
        return getDesc();
      case OceletPackage.METADATA__WEBP:
        return getWebp();
      case OceletPackage.METADATA__PARAMDEFS:
        return getParamdefs();
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
      case OceletPackage.METADATA__DESC:
        setDesc((String)newValue);
        return;
      case OceletPackage.METADATA__WEBP:
        setWebp((String)newValue);
        return;
      case OceletPackage.METADATA__PARAMDEFS:
        getParamdefs().clear();
        getParamdefs().addAll((Collection<? extends Parameter>)newValue);
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
      case OceletPackage.METADATA__DESC:
        setDesc(DESC_EDEFAULT);
        return;
      case OceletPackage.METADATA__WEBP:
        setWebp(WEBP_EDEFAULT);
        return;
      case OceletPackage.METADATA__PARAMDEFS:
        getParamdefs().clear();
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
      case OceletPackage.METADATA__DESC:
        return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
      case OceletPackage.METADATA__WEBP:
        return WEBP_EDEFAULT == null ? webp != null : !WEBP_EDEFAULT.equals(webp);
      case OceletPackage.METADATA__PARAMDEFS:
        return paramdefs != null && !paramdefs.isEmpty();
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
    result.append(" (desc: ");
    result.append(desc);
    result.append(", webp: ");
    result.append(webp);
    result.append(')');
    return result.toString();
  }

} //MetadataImpl
