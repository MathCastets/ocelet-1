/**
 */
package fr.ocelet.lang.ocelet.impl;

import fr.ocelet.lang.ocelet.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OceletFactoryImpl extends EFactoryImpl implements OceletFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OceletFactory init()
  {
    try
    {
      OceletFactory theOceletFactory = (OceletFactory)EPackage.Registry.INSTANCE.getEFactory(OceletPackage.eNS_URI);
      if (theOceletFactory != null)
      {
        return theOceletFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OceletFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OceletFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case OceletPackage.MODEL: return createModel();
      case OceletPackage.MOD_ELN: return createModEln();
      case OceletPackage.METADATA: return createMetadata();
      case OceletPackage.PARAMETER: return createParameter();
      case OceletPackage.PARAMPART: return createParampart();
      case OceletPackage.PARAMUNIT: return createParamunit();
      case OceletPackage.PARAMDEFA: return createParamdefa();
      case OceletPackage.PARAMIN: return createParamin();
      case OceletPackage.PARAMAX: return createParamax();
      case OceletPackage.PARADESC: return createParadesc();
      case OceletPackage.PARAOPT: return createParaopt();
      case OceletPackage.ENTITY: return createEntity();
      case OceletPackage.ENTITY_ELEMENTS: return createEntityElements();
      case OceletPackage.PROPERTY_DEF: return createPropertyDef();
      case OceletPackage.SERVICE_DEF: return createServiceDef();
      case OceletPackage.CONSTRUCTOR_DEF: return createConstructorDef();
      case OceletPackage.RELATION: return createRelation();
      case OceletPackage.ROLE: return createRole();
      case OceletPackage.REL_ELEMENTS: return createRelElements();
      case OceletPackage.REL_PROPERTY_DEF: return createRelPropertyDef();
      case OceletPackage.INTERACTION_DEF: return createInteractionDef();
      case OceletPackage.COMITEXPR: return createComitexpr();
      case OceletPackage.FILTERDEF: return createFilterdef();
      case OceletPackage.STRUCDEF: return createStrucdef();
      case OceletPackage.STRUC_ELN: return createStrucEln();
      case OceletPackage.STRUC_VAR_DEF: return createStrucVarDef();
      case OceletPackage.STRUC_FUNC_DEF: return createStrucFuncDef();
      case OceletPackage.DATAFACER: return createDatafacer();
      case OceletPackage.MATCH: return createMatch();
      case OceletPackage.MATCHTYPE: return createMatchtype();
      case OceletPackage.MDEF: return createMdef();
      case OceletPackage.AGREGDEF: return createAgregdef();
      case OceletPackage.SCENARIO: return createScenario();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModEln createModEln()
  {
    ModElnImpl modEln = new ModElnImpl();
    return modEln;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metadata createMetadata()
  {
    MetadataImpl metadata = new MetadataImpl();
    return metadata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parampart createParampart()
  {
    ParampartImpl parampart = new ParampartImpl();
    return parampart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paramunit createParamunit()
  {
    ParamunitImpl paramunit = new ParamunitImpl();
    return paramunit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paramdefa createParamdefa()
  {
    ParamdefaImpl paramdefa = new ParamdefaImpl();
    return paramdefa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paramin createParamin()
  {
    ParaminImpl paramin = new ParaminImpl();
    return paramin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paramax createParamax()
  {
    ParamaxImpl paramax = new ParamaxImpl();
    return paramax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paradesc createParadesc()
  {
    ParadescImpl paradesc = new ParadescImpl();
    return paradesc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paraopt createParaopt()
  {
    ParaoptImpl paraopt = new ParaoptImpl();
    return paraopt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityElements createEntityElements()
  {
    EntityElementsImpl entityElements = new EntityElementsImpl();
    return entityElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDef createPropertyDef()
  {
    PropertyDefImpl propertyDef = new PropertyDefImpl();
    return propertyDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceDef createServiceDef()
  {
    ServiceDefImpl serviceDef = new ServiceDefImpl();
    return serviceDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstructorDef createConstructorDef()
  {
    ConstructorDefImpl constructorDef = new ConstructorDefImpl();
    return constructorDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelElements createRelElements()
  {
    RelElementsImpl relElements = new RelElementsImpl();
    return relElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelPropertyDef createRelPropertyDef()
  {
    RelPropertyDefImpl relPropertyDef = new RelPropertyDefImpl();
    return relPropertyDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionDef createInteractionDef()
  {
    InteractionDefImpl interactionDef = new InteractionDefImpl();
    return interactionDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comitexpr createComitexpr()
  {
    ComitexprImpl comitexpr = new ComitexprImpl();
    return comitexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Filterdef createFilterdef()
  {
    FilterdefImpl filterdef = new FilterdefImpl();
    return filterdef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Strucdef createStrucdef()
  {
    StrucdefImpl strucdef = new StrucdefImpl();
    return strucdef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StrucEln createStrucEln()
  {
    StrucElnImpl strucEln = new StrucElnImpl();
    return strucEln;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StrucVarDef createStrucVarDef()
  {
    StrucVarDefImpl strucVarDef = new StrucVarDefImpl();
    return strucVarDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StrucFuncDef createStrucFuncDef()
  {
    StrucFuncDefImpl strucFuncDef = new StrucFuncDefImpl();
    return strucFuncDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datafacer createDatafacer()
  {
    DatafacerImpl datafacer = new DatafacerImpl();
    return datafacer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Match createMatch()
  {
    MatchImpl match = new MatchImpl();
    return match;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matchtype createMatchtype()
  {
    MatchtypeImpl matchtype = new MatchtypeImpl();
    return matchtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mdef createMdef()
  {
    MdefImpl mdef = new MdefImpl();
    return mdef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agregdef createAgregdef()
  {
    AgregdefImpl agregdef = new AgregdefImpl();
    return agregdef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario createScenario()
  {
    ScenarioImpl scenario = new ScenarioImpl();
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OceletPackage getOceletPackage()
  {
    return (OceletPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OceletPackage getPackage()
  {
    return OceletPackage.eINSTANCE;
  }

} //OceletFactoryImpl
