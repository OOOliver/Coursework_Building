/**
 * generated by Xtext 2.20.0
 */
package kcl.ac.uk.jian.building.building;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paint Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kcl.ac.uk.jian.building.building.PaintProcess#getLevels <em>Levels</em>}</li>
 *   <li>{@link kcl.ac.uk.jian.building.building.PaintProcess#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see kcl.ac.uk.jian.building.building.BuildingPackage#getPaintProcess()
 * @model
 * @generated
 */
public interface PaintProcess extends kcl.ac.uk.jian.building.building.Process
{
  /**
   * Returns the value of the '<em><b>Levels</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Levels</em>' containment reference.
   * @see #setLevels(Expression)
   * @see kcl.ac.uk.jian.building.building.BuildingPackage#getPaintProcess_Levels()
   * @model containment="true"
   * @generated
   */
  Expression getLevels();

  /**
   * Sets the value of the '{@link kcl.ac.uk.jian.building.building.PaintProcess#getLevels <em>Levels</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Levels</em>' containment reference.
   * @see #getLevels()
   * @generated
   */
  void setLevels(Expression value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see #setColor(String)
   * @see kcl.ac.uk.jian.building.building.BuildingPackage#getPaintProcess_Color()
   * @model
   * @generated
   */
  String getColor();

  /**
   * Sets the value of the '{@link kcl.ac.uk.jian.building.building.PaintProcess#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see #getColor()
   * @generated
   */
  void setColor(String value);

} // PaintProcess