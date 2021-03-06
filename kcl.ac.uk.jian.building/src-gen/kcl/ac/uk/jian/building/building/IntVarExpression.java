/**
 * generated by Xtext 2.20.0
 */
package kcl.ac.uk.jian.building.building;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Var Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kcl.ac.uk.jian.building.building.IntVarExpression#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see kcl.ac.uk.jian.building.building.BuildingPackage#getIntVarExpression()
 * @model
 * @generated
 */
public interface IntVarExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(VariableDeclaration)
   * @see kcl.ac.uk.jian.building.building.BuildingPackage#getIntVarExpression_Var()
   * @model
   * @generated
   */
  VariableDeclaration getVar();

  /**
   * Sets the value of the '{@link kcl.ac.uk.jian.building.building.IntVarExpression#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(VariableDeclaration value);

} // IntVarExpression
