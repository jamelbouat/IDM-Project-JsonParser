/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.idmproject.jsonParser.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.idmproject.jsonParser.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonParserFactoryImpl extends EFactoryImpl implements JsonParserFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JsonParserFactory init()
  {
    try
    {
      JsonParserFactory theJsonParserFactory = (JsonParserFactory)EPackage.Registry.INSTANCE.getEFactory(JsonParserPackage.eNS_URI);
      if (theJsonParserFactory != null)
      {
        return theJsonParserFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JsonParserFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonParserFactoryImpl()
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
      case JsonParserPackage.JSON_MODEL: return createJsonModel();
      case JsonParserPackage.INSTRUCTION: return createInstruction();
      case JsonParserPackage.LOAD: return createLoad();
      case JsonParserPackage.SELECT: return createSelect();
      case JsonParserPackage.STORE: return createStore();
      case JsonParserPackage.PRINT: return createPrint();
      case JsonParserPackage.GET_VALUE: return createGetValue();
      case JsonParserPackage.INSERT_LEFT: return createInsertLeft();
      case JsonParserPackage.INSERT_RIGHT: return createInsertRight();
      case JsonParserPackage.INSERT: return createInsert();
      case JsonParserPackage.MODIFY: return createModify();
      case JsonParserPackage.COMPUTE: return createCompute();
      case JsonParserPackage.SUM: return createSum();
      case JsonParserPackage.PRODUCT: return createProduct();
      case JsonParserPackage.EXPRESSION: return createExpression();
      case JsonParserPackage.VALUE: return createValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JsonModel createJsonModel()
  {
    JsonModelImpl jsonModel = new JsonModelImpl();
    return jsonModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Load createLoad()
  {
    LoadImpl load = new LoadImpl();
    return load;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Select createSelect()
  {
    SelectImpl select = new SelectImpl();
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Store createStore()
  {
    StoreImpl store = new StoreImpl();
    return store;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Print createPrint()
  {
    PrintImpl print = new PrintImpl();
    return print;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GetValue createGetValue()
  {
    GetValueImpl getValue = new GetValueImpl();
    return getValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InsertLeft createInsertLeft()
  {
    InsertLeftImpl insertLeft = new InsertLeftImpl();
    return insertLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InsertRight createInsertRight()
  {
    InsertRightImpl insertRight = new InsertRightImpl();
    return insertRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Insert createInsert()
  {
    InsertImpl insert = new InsertImpl();
    return insert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Modify createModify()
  {
    ModifyImpl modify = new ModifyImpl();
    return modify;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Compute createCompute()
  {
    ComputeImpl compute = new ComputeImpl();
    return compute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sum createSum()
  {
    SumImpl sum = new SumImpl();
    return sum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Product createProduct()
  {
    ProductImpl product = new ProductImpl();
    return product;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JsonParserPackage getJsonParserPackage()
  {
    return (JsonParserPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JsonParserPackage getPackage()
  {
    return JsonParserPackage.eINSTANCE;
  }

} //JsonParserFactoryImpl
