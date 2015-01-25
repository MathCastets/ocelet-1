/**
 */
package fr.ocelet.lang.ocelet.util;

import fr.ocelet.lang.ocelet.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.ocelet.lang.ocelet.OceletPackage
 * @generated
 */
public class OceletSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OceletPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OceletSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = OceletPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case OceletPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.MOD_ELN:
      {
        ModEln modEln = (ModEln)theEObject;
        T result = caseModEln(modEln);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.METADATA:
      {
        Metadata metadata = (Metadata)theEObject;
        T result = caseMetadata(metadata);
        if (result == null) result = caseModEln(metadata);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.PARAMPART:
      {
        Parampart parampart = (Parampart)theEObject;
        T result = caseParampart(parampart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.PARAMUNIT:
      {
        Paramunit paramunit = (Paramunit)theEObject;
        T result = caseParamunit(paramunit);
        if (result == null) result = caseParampart(paramunit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.PARAMDEFA:
      {
        Paramdefa paramdefa = (Paramdefa)theEObject;
        T result = caseParamdefa(paramdefa);
        if (result == null) result = caseParampart(paramdefa);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.PARAMIN:
      {
        Paramin paramin = (Paramin)theEObject;
        T result = caseParamin(paramin);
        if (result == null) result = caseParampart(paramin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.PARAMAX:
      {
        Paramax paramax = (Paramax)theEObject;
        T result = caseParamax(paramax);
        if (result == null) result = caseParampart(paramax);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.PARADESC:
      {
        Paradesc paradesc = (Paradesc)theEObject;
        T result = caseParadesc(paradesc);
        if (result == null) result = caseParampart(paradesc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.PARAOPT:
      {
        Paraopt paraopt = (Paraopt)theEObject;
        T result = caseParaopt(paraopt);
        if (result == null) result = caseParampart(paraopt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = caseModEln(entity);
        if (result == null) result = caseMatchtype(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.ENTITY_ELEMENTS:
      {
        EntityElements entityElements = (EntityElements)theEObject;
        T result = caseEntityElements(entityElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.PROPERTY_DEF:
      {
        PropertyDef propertyDef = (PropertyDef)theEObject;
        T result = casePropertyDef(propertyDef);
        if (result == null) result = caseEntityElements(propertyDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.SERVICE_DEF:
      {
        ServiceDef serviceDef = (ServiceDef)theEObject;
        T result = caseServiceDef(serviceDef);
        if (result == null) result = caseEntityElements(serviceDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.CONSTRUCTOR_DEF:
      {
        ConstructorDef constructorDef = (ConstructorDef)theEObject;
        T result = caseConstructorDef(constructorDef);
        if (result == null) result = caseEntityElements(constructorDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.RELATION:
      {
        Relation relation = (Relation)theEObject;
        T result = caseRelation(relation);
        if (result == null) result = caseModEln(relation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.ROLE:
      {
        Role role = (Role)theEObject;
        T result = caseRole(role);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.REL_ELEMENTS:
      {
        RelElements relElements = (RelElements)theEObject;
        T result = caseRelElements(relElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.REL_PROPERTY_DEF:
      {
        RelPropertyDef relPropertyDef = (RelPropertyDef)theEObject;
        T result = caseRelPropertyDef(relPropertyDef);
        if (result == null) result = caseRelElements(relPropertyDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.INTERACTION_DEF:
      {
        InteractionDef interactionDef = (InteractionDef)theEObject;
        T result = caseInteractionDef(interactionDef);
        if (result == null) result = caseRelElements(interactionDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.COMITEXPR:
      {
        Comitexpr comitexpr = (Comitexpr)theEObject;
        T result = caseComitexpr(comitexpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.FILTERDEF:
      {
        Filterdef filterdef = (Filterdef)theEObject;
        T result = caseFilterdef(filterdef);
        if (result == null) result = caseRelElements(filterdef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.STRUCDEF:
      {
        Strucdef strucdef = (Strucdef)theEObject;
        T result = caseStrucdef(strucdef);
        if (result == null) result = caseModEln(strucdef);
        if (result == null) result = caseMatchtype(strucdef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.STRUC_ELN:
      {
        StrucEln strucEln = (StrucEln)theEObject;
        T result = caseStrucEln(strucEln);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.STRUC_VAR_DEF:
      {
        StrucVarDef strucVarDef = (StrucVarDef)theEObject;
        T result = caseStrucVarDef(strucVarDef);
        if (result == null) result = caseStrucEln(strucVarDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.STRUC_FUNC_DEF:
      {
        StrucFuncDef strucFuncDef = (StrucFuncDef)theEObject;
        T result = caseStrucFuncDef(strucFuncDef);
        if (result == null) result = caseStrucEln(strucFuncDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.DATAFACER:
      {
        Datafacer datafacer = (Datafacer)theEObject;
        T result = caseDatafacer(datafacer);
        if (result == null) result = caseModEln(datafacer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.MATCH:
      {
        Match match = (Match)theEObject;
        T result = caseMatch(match);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.MATCHTYPE:
      {
        Matchtype matchtype = (Matchtype)theEObject;
        T result = caseMatchtype(matchtype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.MDEF:
      {
        Mdef mdef = (Mdef)theEObject;
        T result = caseMdef(mdef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.AGREGDEF:
      {
        Agregdef agregdef = (Agregdef)theEObject;
        T result = caseAgregdef(agregdef);
        if (result == null) result = caseModEln(agregdef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OceletPackage.SCENARIO:
      {
        Scenario scenario = (Scenario)theEObject;
        T result = caseScenario(scenario);
        if (result == null) result = caseModEln(scenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mod Eln</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mod Eln</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModEln(ModEln object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metadata</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metadata</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetadata(Metadata object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parampart</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parampart</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParampart(Parampart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paramunit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paramunit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParamunit(Paramunit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paramdefa</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paramdefa</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParamdefa(Paramdefa object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paramin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paramin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParamin(Paramin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paramax</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paramax</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParamax(Paramax object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paradesc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paradesc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParadesc(Paradesc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paraopt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paraopt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParaopt(Paraopt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityElements(EntityElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyDef(PropertyDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceDef(ServiceDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constructor Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constructor Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructorDef(ConstructorDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelation(Relation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRole(Role object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rel Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rel Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelElements(RelElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rel Property Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rel Property Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelPropertyDef(RelPropertyDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interaction Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interaction Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractionDef(InteractionDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comitexpr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comitexpr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComitexpr(Comitexpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filterdef</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filterdef</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterdef(Filterdef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Strucdef</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Strucdef</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrucdef(Strucdef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struc Eln</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struc Eln</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrucEln(StrucEln object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struc Var Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struc Var Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrucVarDef(StrucVarDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struc Func Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struc Func Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrucFuncDef(StrucFuncDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datafacer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datafacer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatafacer(Datafacer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Match</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Match</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatch(Match object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Matchtype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Matchtype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatchtype(Matchtype object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mdef</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mdef</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMdef(Mdef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Agregdef</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Agregdef</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAgregdef(Agregdef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenario(Scenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //OceletSwitch
