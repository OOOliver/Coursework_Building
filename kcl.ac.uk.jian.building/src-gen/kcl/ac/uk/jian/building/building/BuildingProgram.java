/**
 * generated by Xtext 2.20.0
 */
package kcl.ac.uk.jian.building.building;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kcl.ac.uk.jian.building.building.BuildingProgram#getProcesses <em>Processes</em>}</li>
 * </ul>
 *
 * @see kcl.ac.uk.jian.building.building.BuildingPackage#getBuildingProgram()
 * @model
 * @generated
 */
public interface BuildingProgram extends EObject
{
  /**
   * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
   * The list contents are of type {@link kcl.ac.uk.jian.building.building.Process}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processes</em>' containment reference list.
   * @see kcl.ac.uk.jian.building.building.BuildingPackage#getBuildingProgram_Processes()
   * @model containment="true"
   * @generated
   */
  EList<kcl.ac.uk.jian.building.building.Process> getProcesses();

} // BuildingProgram
