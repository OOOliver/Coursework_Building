package kcl.ac.uk.jian.building.validation

import kcl.ac.uk.jian.building.building.VariableDeclaration
import org.eclipse.xtext.validation.Check
import kcl.ac.uk.jian.building.typing.validation.BuildingTypeSystemValidator
import kcl.ac.uk.jian.building.building.PaintProcess
import java.util.regex.Pattern
import java.util.regex.Matcher
import kcl.ac.uk.jian.building.building.BuildingPackage
import kcl.ac.uk.jian.building.building.AddFloorProcess
import kcl.ac.uk.jian.building.building.AddWindowProcess
import kcl.ac.uk.jian.building.building.Expression
import kcl.ac.uk.jian.building.building.IntLiteral
import kcl.ac.uk.jian.building.building.RealLiteral
import sun.swing.plaf.synth.Paint9Painter.PaintType

class BuildingValidator extends BuildingTypeSystemValidator{
	public static val INVALID_NUMBER = 'kcl.ac.uk.jian.building.INVALID_NUMBER'
	public static val INVALID_COLOR = 'kcl.ac.uk.jian.building.INVALID_COLOR'
	public Pattern p
	public Matcher m
	
//	@Check
//	def checkFloorIsINT(AddFloorProcess proce){
//		p = Pattern.compile("[0-9]*");
//		m = p.matcher(proce.levels.toString());
//		if(!m.matches()){
//			warning('Level should be Integer', proce, BuildingPackage.Literals.ADD_FLOOR_PROCESS__LEVELS, INVALID_NUMBER)
//		}
//	}
//	
//	@Check
//	def checkFloorIsINTInPaint(PaintProcess proce){
//		p = Pattern.compile("[0-9]*");
//		m = p.matcher(proce.levels.toString());
//		if(!m.matches()){
//			warning('Level should be Integer', proce, BuildingPackage.Literals.PAINT_PROCESS__LEVELS, INVALID_NUMBER)
//		}
//	}
//	
//	@Check
//	def checkFloorIsINTInAddWindow(AddWindowProcess proce){
//		p = Pattern.compile("[0-9]*");
//		m = p.matcher(proce.levels.toString());
//		if(!m.matches()){
//			warning('Level should be Integer', proce, BuildingPackage.Literals.ADD_WINDOW_PROCESS__LEVELS, INVALID_NUMBER)
//		}
//	}
	
	@Check
	def checkExtraWindow(AddWindowProcess proce){
		if(Integer.parseInt(proce.num.generateJavaExpression) > 2){
			warning('The maximum of extra windows is 2', proce, 
				BuildingPackage.Literals.ADD_WINDOW_PROCESS__NUM, INVALID_NUMBER
			)
		}
	}
	
	@Check
	def checkColorIsLowerCase(PaintProcess proce){
		p = Pattern.compile("[A-Z]+");
		m = p.matcher(proce.color);
		if (m.find(0)){
			warning('Color should be typed in lower case', proce, BuildingPackage.Literals.PAINT_PROCESS__COLOR, INVALID_COLOR)
		}
	}
	
	dispatch def String generateJavaExpression(Expression exp) {}

	dispatch def String generateJavaExpression(IntLiteral exp) '''«exp.^val»'''

	dispatch def String generateJavaExpression(RealLiteral exp) '''«exp.^val»f'''
}