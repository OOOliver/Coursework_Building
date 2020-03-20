package kcl.ac.uk.jian.building.validation;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kcl.ac.uk.jian.building.building.AddWindowProcess;
import kcl.ac.uk.jian.building.building.BuildingPackage;
import kcl.ac.uk.jian.building.building.Expression;
import kcl.ac.uk.jian.building.building.IntLiteral;
import kcl.ac.uk.jian.building.building.PaintProcess;
import kcl.ac.uk.jian.building.building.RealLiteral;
import kcl.ac.uk.jian.building.typing.validation.BuildingTypeSystemValidator;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.validation.Check;

@SuppressWarnings("all")
public class BuildingValidator extends BuildingTypeSystemValidator {
  public static final String INVALID_NUMBER = "kcl.ac.uk.jian.building.INVALID_NUMBER";
  
  public static final String INVALID_COLOR = "kcl.ac.uk.jian.building.INVALID_COLOR";
  
  public Pattern p;
  
  public Matcher m;
  
  @Check
  public void checkExtraWindow(final AddWindowProcess proce) {
    int _parseInt = Integer.parseInt(this.generateJavaExpression(proce.getNum()));
    boolean _greaterThan = (_parseInt > 2);
    if (_greaterThan) {
      this.warning("The maximum of extra windows is 2", proce, 
        BuildingPackage.Literals.ADD_WINDOW_PROCESS__NUM, BuildingValidator.INVALID_NUMBER);
    }
  }
  
  @Check
  public void checkColorIsLowerCase(final PaintProcess proce) {
    this.p = Pattern.compile("[A-Z]+");
    this.m = this.p.matcher(proce.getColor());
    boolean _find = this.m.find(0);
    if (_find) {
      this.warning("Color should be typed in lower case", proce, BuildingPackage.Literals.PAINT_PROCESS__COLOR, BuildingValidator.INVALID_COLOR);
    }
  }
  
  protected String _generateJavaExpression(final Expression exp) {
    return null;
  }
  
  protected String _generateJavaExpression(final IntLiteral exp) {
    StringConcatenation _builder = new StringConcatenation();
    int _val = exp.getVal();
    _builder.append(_val);
    return _builder.toString();
  }
  
  protected String _generateJavaExpression(final RealLiteral exp) {
    StringConcatenation _builder = new StringConcatenation();
    float _val = exp.getVal();
    _builder.append(_val);
    _builder.append("f");
    return _builder.toString();
  }
  
  public String generateJavaExpression(final Expression exp) {
    if (exp instanceof IntLiteral) {
      return _generateJavaExpression((IntLiteral)exp);
    } else if (exp instanceof RealLiteral) {
      return _generateJavaExpression((RealLiteral)exp);
    } else if (exp != null) {
      return _generateJavaExpression(exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
}
