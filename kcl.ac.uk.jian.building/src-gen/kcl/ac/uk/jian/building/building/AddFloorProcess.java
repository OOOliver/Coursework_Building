/**
 * generated by Xtext 2.20.0
 */
package kcl.ac.uk.jian.building.building;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Floor Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kcl.ac.uk.jian.building.building.AddFloorProcess#getStructure <em>Structure</em>}</li>
 *   <li>{@link kcl.ac.uk.jian.building.building.AddFloorProcess#getLevels <em>Levels</em>}</li>
 * </ul>
 *
 * @see kcl.ac.uk.jian.building.building.BuildingPackage#getAddFloorProcess()
 * @model
 * @generated
 */
public interface AddFloorProcess extends kcl.ac.uk.jian.building.building.Process
{
  /**
   * Returns the value of the '<em><b>Structure</b></em>' attribute.
   * The literals are from the enumeration {@link kcl.ac.uk.jian.building.building.WholeStructure}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structure</em>' attribute.
   * @see kcl.ac.uk.jian.building.building.WholeStructure
   * @see #setStructure(WholeStructure)
   * @see kcl.ac.uk.jian.building.building.BuildingPackage#getAddFloorProcess_Structure()
   * @model
   * @generated
   */
  WholeStructure getStructure();

  /**
   * Sets the value of the '{@link kcl.ac.uk.jian.building.building.AddFloorProcess#getStructure <em>Structure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Structure</em>' attribute.
   * @see kcl.ac.uk.jian.building.building.WholeStructure
   * @see #getStructure()
   * @generated
   */
  void setStructure(WholeStructure value);

  /**
   * Returns the value of the '<em><b>Levels</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Levels</em>' containment reference.
   * @see #setLevels(Expression)
   * @see kcl.ac.uk.jian.building.building.BuildingPackage#getAddFloorProcess_Levels()
   * @model containment="true"
   * @generated
   */
  Expression getLevels();

  /**
   * Sets the value of the '{@link kcl.ac.uk.jian.building.building.AddFloorProcess#getLevels <em>Levels</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Levels</em>' containment reference.
   * @see #getLevels()
   * @generated
   */
  void setLevels(Expression value);

} // AddFloorProcess
