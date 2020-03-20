/**
 * generated by Xtext 2.20.0
 */
package kcl.ac.uk.jian.building.building.impl;

import kcl.ac.uk.jian.building.building.AddFloorProcess;
import kcl.ac.uk.jian.building.building.AddWindowProcess;
import kcl.ac.uk.jian.building.building.Addition;
import kcl.ac.uk.jian.building.building.BuildingFactory;
import kcl.ac.uk.jian.building.building.BuildingPackage;
import kcl.ac.uk.jian.building.building.BuildingProgram;
import kcl.ac.uk.jian.building.building.Expression;
import kcl.ac.uk.jian.building.building.IntLiteral;
import kcl.ac.uk.jian.building.building.IntVarExpression;
import kcl.ac.uk.jian.building.building.Loop;
import kcl.ac.uk.jian.building.building.Multiplication;
import kcl.ac.uk.jian.building.building.PaintProcess;
import kcl.ac.uk.jian.building.building.RealLiteral;
import kcl.ac.uk.jian.building.building.VariableDeclaration;
import kcl.ac.uk.jian.building.building.WholeStructure;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class BuildingFactoryImpl extends EFactoryImpl implements BuildingFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuildingFactory init()
  {
    try
    {
      BuildingFactory theBuildingFactory = (BuildingFactory)EPackage.Registry.INSTANCE.getEFactory(BuildingPackage.eNS_URI);
      if (theBuildingFactory != null)
      {
        return theBuildingFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BuildingFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuildingFactoryImpl()
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
      case BuildingPackage.BUILDING_PROGRAM: return createBuildingProgram();
      case BuildingPackage.PROCESS: return createProcess();
      case BuildingPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case BuildingPackage.ADD_FLOOR_PROCESS: return createAddFloorProcess();
      case BuildingPackage.PAINT_PROCESS: return createPaintProcess();
      case BuildingPackage.ADD_WINDOW_PROCESS: return createAddWindowProcess();
      case BuildingPackage.LOOP: return createLoop();
      case BuildingPackage.EXPRESSION: return createExpression();
      case BuildingPackage.INT_LITERAL: return createIntLiteral();
      case BuildingPackage.REAL_LITERAL: return createRealLiteral();
      case BuildingPackage.INT_VAR_EXPRESSION: return createIntVarExpression();
      case BuildingPackage.ADDITION: return createAddition();
      case BuildingPackage.MULTIPLICATION: return createMultiplication();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BuildingPackage.WHOLE_STRUCTURE:
        return createWholeStructureFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BuildingPackage.WHOLE_STRUCTURE:
        return convertWholeStructureToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BuildingProgram createBuildingProgram()
  {
    BuildingProgramImpl buildingProgram = new BuildingProgramImpl();
    return buildingProgram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public kcl.ac.uk.jian.building.building.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AddFloorProcess createAddFloorProcess()
  {
    AddFloorProcessImpl addFloorProcess = new AddFloorProcessImpl();
    return addFloorProcess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PaintProcess createPaintProcess()
  {
    PaintProcessImpl paintProcess = new PaintProcessImpl();
    return paintProcess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AddWindowProcess createAddWindowProcess()
  {
    AddWindowProcessImpl addWindowProcess = new AddWindowProcessImpl();
    return addWindowProcess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Loop createLoop()
  {
    LoopImpl loop = new LoopImpl();
    return loop;
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
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RealLiteral createRealLiteral()
  {
    RealLiteralImpl realLiteral = new RealLiteralImpl();
    return realLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntVarExpression createIntVarExpression()
  {
    IntVarExpressionImpl intVarExpression = new IntVarExpressionImpl();
    return intVarExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Addition createAddition()
  {
    AdditionImpl addition = new AdditionImpl();
    return addition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WholeStructure createWholeStructureFromString(EDataType eDataType, String initialValue)
  {
    WholeStructure result = WholeStructure.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertWholeStructureToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BuildingPackage getBuildingPackage()
  {
    return (BuildingPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BuildingPackage getPackage()
  {
    return BuildingPackage.eINSTANCE;
  }

} //BuildingFactoryImpl