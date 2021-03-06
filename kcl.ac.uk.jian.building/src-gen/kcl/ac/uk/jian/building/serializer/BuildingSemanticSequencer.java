/*
 * generated by Xtext 2.20.0
 */
package kcl.ac.uk.jian.building.serializer;

import com.google.inject.Inject;
import java.util.Set;
import kcl.ac.uk.jian.building.building.AddFloorProcess;
import kcl.ac.uk.jian.building.building.AddWindowProcess;
import kcl.ac.uk.jian.building.building.Addition;
import kcl.ac.uk.jian.building.building.BuildingPackage;
import kcl.ac.uk.jian.building.building.BuildingProgram;
import kcl.ac.uk.jian.building.building.IntLiteral;
import kcl.ac.uk.jian.building.building.IntVarExpression;
import kcl.ac.uk.jian.building.building.Loop;
import kcl.ac.uk.jian.building.building.Multiplication;
import kcl.ac.uk.jian.building.building.PaintProcess;
import kcl.ac.uk.jian.building.building.RealLiteral;
import kcl.ac.uk.jian.building.building.VariableDeclaration;
import kcl.ac.uk.jian.building.services.BuildingGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BuildingSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BuildingGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BuildingPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BuildingPackage.ADD_FLOOR_PROCESS:
				sequence_AddFloorProcess(context, (AddFloorProcess) semanticObject); 
				return; 
			case BuildingPackage.ADD_WINDOW_PROCESS:
				sequence_AddWindowProcess(context, (AddWindowProcess) semanticObject); 
				return; 
			case BuildingPackage.ADDITION:
				sequence_Addition(context, (Addition) semanticObject); 
				return; 
			case BuildingPackage.BUILDING_PROGRAM:
				sequence_BuildingProgram(context, (BuildingProgram) semanticObject); 
				return; 
			case BuildingPackage.INT_LITERAL:
				sequence_IntLiteral(context, (IntLiteral) semanticObject); 
				return; 
			case BuildingPackage.INT_VAR_EXPRESSION:
				sequence_IntVarExpression(context, (IntVarExpression) semanticObject); 
				return; 
			case BuildingPackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
			case BuildingPackage.MULTIPLICATION:
				sequence_Multiplication(context, (Multiplication) semanticObject); 
				return; 
			case BuildingPackage.PAINT_PROCESS:
				sequence_PaintProcess(context, (PaintProcess) semanticObject); 
				return; 
			case BuildingPackage.REAL_LITERAL:
				sequence_RealLiteral(context, (RealLiteral) semanticObject); 
				return; 
			case BuildingPackage.VARIABLE_DECLARATION:
				sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Process returns AddFloorProcess
	 *     AddFloorProcess returns AddFloorProcess
	 *
	 * Constraint:
	 *     (structure=WholeStructure levels=Addition)
	 */
	protected void sequence_AddFloorProcess(ISerializationContext context, AddFloorProcess semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BuildingPackage.Literals.ADD_FLOOR_PROCESS__STRUCTURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BuildingPackage.Literals.ADD_FLOOR_PROCESS__STRUCTURE));
			if (transientValues.isValueTransient(semanticObject, BuildingPackage.Literals.ADD_FLOOR_PROCESS__LEVELS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BuildingPackage.Literals.ADD_FLOOR_PROCESS__LEVELS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddFloorProcessAccess().getStructureWholeStructureEnumRuleCall_0_0(), semanticObject.getStructure());
		feeder.accept(grammarAccess.getAddFloorProcessAccess().getLevelsAdditionParserRuleCall_2_0(), semanticObject.getLevels());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Process returns AddWindowProcess
	 *     AddWindowProcess returns AddWindowProcess
	 *
	 * Constraint:
	 *     (num=Addition levels=Addition)
	 */
	protected void sequence_AddWindowProcess(ISerializationContext context, AddWindowProcess semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BuildingPackage.Literals.ADD_WINDOW_PROCESS__NUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BuildingPackage.Literals.ADD_WINDOW_PROCESS__NUM));
			if (transientValues.isValueTransient(semanticObject, BuildingPackage.Literals.ADD_WINDOW_PROCESS__LEVELS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BuildingPackage.Literals.ADD_WINDOW_PROCESS__LEVELS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddWindowProcessAccess().getNumAdditionParserRuleCall_1_0(), semanticObject.getNum());
		feeder.accept(grammarAccess.getAddWindowProcessAccess().getLevelsAdditionParserRuleCall_5_0(), semanticObject.getLevels());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Addition returns Addition
	 *     Addition.Addition_1_0 returns Addition
	 *     Multiplication returns Addition
	 *     Multiplication.Multiplication_1_0 returns Addition
	 *     Primary returns Addition
	 *
	 * Constraint:
	 *     (left=Addition_Addition_1_0 (operator+='+' | operator+='-') right+=Multiplication)
	 */
	protected void sequence_Addition(ISerializationContext context, Addition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BuildingProgram returns BuildingProgram
	 *
	 * Constraint:
	 *     processes+=Process+
	 */
	protected void sequence_BuildingProgram(ISerializationContext context, BuildingProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Addition returns IntLiteral
	 *     Addition.Addition_1_0 returns IntLiteral
	 *     Multiplication returns IntLiteral
	 *     Multiplication.Multiplication_1_0 returns IntLiteral
	 *     Primary returns IntLiteral
	 *     IntLiteral returns IntLiteral
	 *
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_IntLiteral(ISerializationContext context, IntLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BuildingPackage.Literals.INT_LITERAL__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BuildingPackage.Literals.INT_LITERAL__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Addition returns IntVarExpression
	 *     Addition.Addition_1_0 returns IntVarExpression
	 *     Multiplication returns IntVarExpression
	 *     Multiplication.Multiplication_1_0 returns IntVarExpression
	 *     Primary returns IntVarExpression
	 *     IntVarExpression returns IntVarExpression
	 *
	 * Constraint:
	 *     var=[VariableDeclaration|ID]
	 */
	protected void sequence_IntVarExpression(ISerializationContext context, IntVarExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BuildingPackage.Literals.INT_VAR_EXPRESSION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BuildingPackage.Literals.INT_VAR_EXPRESSION__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1(), semanticObject.eGet(BuildingPackage.Literals.INT_VAR_EXPRESSION__VAR, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Process returns Loop
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     (count=Addition processes+=Process+)
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Addition returns Multiplication
	 *     Addition.Addition_1_0 returns Multiplication
	 *     Multiplication returns Multiplication
	 *     Multiplication.Multiplication_1_0 returns Multiplication
	 *     Primary returns Multiplication
	 *
	 * Constraint:
	 *     (left=Multiplication_Multiplication_1_0 (operator+='*' | operator+='/') right+=Primary)
	 */
	protected void sequence_Multiplication(ISerializationContext context, Multiplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Process returns PaintProcess
	 *     PaintProcess returns PaintProcess
	 *
	 * Constraint:
	 *     (levels=Addition color=ID)
	 */
	protected void sequence_PaintProcess(ISerializationContext context, PaintProcess semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BuildingPackage.Literals.PAINT_PROCESS__LEVELS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BuildingPackage.Literals.PAINT_PROCESS__LEVELS));
			if (transientValues.isValueTransient(semanticObject, BuildingPackage.Literals.PAINT_PROCESS__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BuildingPackage.Literals.PAINT_PROCESS__COLOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPaintProcessAccess().getLevelsAdditionParserRuleCall_3_0(), semanticObject.getLevels());
		feeder.accept(grammarAccess.getPaintProcessAccess().getColorIDTerminalRuleCall_6_0(), semanticObject.getColor());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Addition returns RealLiteral
	 *     Addition.Addition_1_0 returns RealLiteral
	 *     Multiplication returns RealLiteral
	 *     Multiplication.Multiplication_1_0 returns RealLiteral
	 *     Primary returns RealLiteral
	 *     RealLiteral returns RealLiteral
	 *
	 * Constraint:
	 *     val=REAL
	 */
	protected void sequence_RealLiteral(ISerializationContext context, RealLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BuildingPackage.Literals.REAL_LITERAL__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BuildingPackage.Literals.REAL_LITERAL__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Process returns VariableDeclaration
	 *     VariableDeclaration returns VariableDeclaration
	 *
	 * Constraint:
	 *     (name=ID value=INT)
	 */
	protected void sequence_VariableDeclaration(ISerializationContext context, VariableDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BuildingPackage.Literals.VARIABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BuildingPackage.Literals.VARIABLE_DECLARATION__NAME));
			if (transientValues.isValueTransient(semanticObject, BuildingPackage.Literals.VARIABLE_DECLARATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BuildingPackage.Literals.VARIABLE_DECLARATION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
