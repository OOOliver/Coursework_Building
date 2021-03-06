/**
 * generated by Xtext 2.20.0
 */
package kcl.ac.uk.jian.building.building;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kcl.ac.uk.jian.building.building.Loop#getCount <em>Count</em>}</li>
 *   <li>{@link kcl.ac.uk.jian.building.building.Loop#getProcesses <em>Processes</em>}</li>
 * </ul>
 *
 * @see kcl.ac.uk.jian.building.building.BuildingPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends kcl.ac.uk.jian.building.building.Process
{
  /**
   * Returns the value of the '<em><b>Count</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Count</em>' containment reference.
   * @see #setCount(Expression)
   * @see kcl.ac.uk.jian.building.building.BuildingPackage#getLoop_Count()
   * @model containment="true"
   * @generated
   */
  Expression getCount();

  /**
   * Sets the value of the '{@link kcl.ac.uk.jian.building.building.Loop#getCount <em>Count</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' containment reference.
   * @see #getCount()
   * @generated
   */
  void setCount(Expression value);

  /**
   * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
   * The list contents are of type {@link kcl.ac.uk.jian.building.building.Process}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processes</em>' containment reference list.
   * @see kcl.ac.uk.jian.building.building.BuildingPackage#getLoop_Processes()
   * @model containment="true"
   * @generated
   */
  EList<kcl.ac.uk.jian.building.building.Process> getProcesses();

} // Loop
