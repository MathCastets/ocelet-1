/**
 */
package fr.ocelet.lang.ocelet.impl;

import fr.ocelet.lang.ocelet.Match;
import fr.ocelet.lang.ocelet.Matchtype;
import fr.ocelet.lang.ocelet.Mdef;
import fr.ocelet.lang.ocelet.OceletPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ocelet.lang.ocelet.impl.MatchImpl#getMtype <em>Mtype</em>}</li>
 *   <li>{@link fr.ocelet.lang.ocelet.impl.MatchImpl#getMatchprops <em>Matchprops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match
{
  /**
   * The cached value of the '{@link #getMtype() <em>Mtype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMtype()
   * @generated
   * @ordered
   */
  protected Matchtype mtype;

  /**
   * The cached value of the '{@link #getMatchprops() <em>Matchprops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatchprops()
   * @generated
   * @ordered
   */
  protected EList<Mdef> matchprops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MatchImpl()
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
    return OceletPackage.Literals.MATCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matchtype getMtype()
  {
    if (mtype != null && mtype.eIsProxy())
    {
      InternalEObject oldMtype = (InternalEObject)mtype;
      mtype = (Matchtype)eResolveProxy(oldMtype);
      if (mtype != oldMtype)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OceletPackage.MATCH__MTYPE, oldMtype, mtype));
      }
    }
    return mtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matchtype basicGetMtype()
  {
    return mtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMtype(Matchtype newMtype)
  {
    Matchtype oldMtype = mtype;
    mtype = newMtype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OceletPackage.MATCH__MTYPE, oldMtype, mtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mdef> getMatchprops()
  {
    if (matchprops == null)
    {
      matchprops = new EObjectContainmentEList<Mdef>(Mdef.class, this, OceletPackage.MATCH__MATCHPROPS);
    }
    return matchprops;
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
      case OceletPackage.MATCH__MATCHPROPS:
        return ((InternalEList<?>)getMatchprops()).basicRemove(otherEnd, msgs);
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
      case OceletPackage.MATCH__MTYPE:
        if (resolve) return getMtype();
        return basicGetMtype();
      case OceletPackage.MATCH__MATCHPROPS:
        return getMatchprops();
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
      case OceletPackage.MATCH__MTYPE:
        setMtype((Matchtype)newValue);
        return;
      case OceletPackage.MATCH__MATCHPROPS:
        getMatchprops().clear();
        getMatchprops().addAll((Collection<? extends Mdef>)newValue);
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
      case OceletPackage.MATCH__MTYPE:
        setMtype((Matchtype)null);
        return;
      case OceletPackage.MATCH__MATCHPROPS:
        getMatchprops().clear();
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
      case OceletPackage.MATCH__MTYPE:
        return mtype != null;
      case OceletPackage.MATCH__MATCHPROPS:
        return matchprops != null && !matchprops.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MatchImpl
