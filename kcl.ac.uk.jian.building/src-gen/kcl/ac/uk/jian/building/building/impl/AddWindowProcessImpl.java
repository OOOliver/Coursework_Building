/**
 * generated by Xtext 2.20.0
 */
package kcl.ac.uk.jian.building.building.impl;

import kcl.ac.uk.jian.building.building.AddWindowProcess;
import kcl.ac.uk.jian.building.building.BuildingPackage;
import kcl.ac.uk.jian.building.building.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Window Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kcl.ac.uk.jian.building.building.impl.AddWindowProcessImpl#getNum <em>Num</em>}</li>
 *   <li>{@link kcl.ac.uk.jian.building.building.impl.AddWindowProcessImpl#getLevels <em>Levels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddWindowProcessImpl extends ProcessImpl implements AddWindowProcess
{
  /**
   * The cached value of the '{@link #getNum() <em>Num</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected Expression num;

  /**
   * The cached value of the '{@link #getLevels() <em>Levels</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevels()
   * @generated
   * @ordered
   */
  protected Expression levels;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddWindowProcessImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BuildingPackage.Literals.ADD_WINDOW_PROCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getNum()
  {
    return num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNum(Expression newNum, NotificationChain msgs)
  {
    Expression oldNum = num;
    num = newNum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ADD_WINDOW_PROCESS__NUM, oldNum, newNum);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNum(Expression newNum)
  {
    if (newNum != num)
    {
      NotificationChain msgs = null;
      if (num != null)
        msgs = ((InternalEObject)num).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ADD_WINDOW_PROCESS__NUM, null, msgs);
      if (newNum != null)
        msgs = ((InternalEObject)newNum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ADD_WINDOW_PROCESS__NUM, null, msgs);
      msgs = basicSetNum(newNum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ADD_WINDOW_PROCESS__NUM, newNum, newNum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getLevels()
  {
    return levels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLevels(Expression newLevels, NotificationChain msgs)
  {
    Expression oldLevels = levels;
    levels = newLevels;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ADD_WINDOW_PROCESS__LEVELS, oldLevels, newLevels);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLevels(Expression newLevels)
  {
    if (newLevels != levels)
    {
      NotificationChain msgs = null;
      if (levels != null)
        msgs = ((InternalEObject)levels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ADD_WINDOW_PROCESS__LEVELS, null, msgs);
      if (newLevels != null)
        msgs = ((InternalEObject)newLevels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ADD_WINDOW_PROCESS__LEVELS, null, msgs);
      msgs = basicSetLevels(newLevels, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ADD_WINDOW_PROCESS__LEVELS, newLevels, newLevels));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BuildingPackage.ADD_WINDOW_PROCESS__NUM:
        return basicSetNum(null, msgs);
      case BuildingPackage.ADD_WINDOW_PROCESS__LEVELS:
        return basicSetLevels(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BuildingPackage.ADD_WINDOW_PROCESS__NUM:
        return getNum();
      case BuildingPackage.ADD_WINDOW_PROCESS__LEVELS:
        return getLevels();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BuildingPackage.ADD_WINDOW_PROCESS__NUM:
        setNum((Expression)newValue);
        return;
      case BuildingPackage.ADD_WINDOW_PROCESS__LEVELS:
        setLevels((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BuildingPackage.ADD_WINDOW_PROCESS__NUM:
        setNum((Expression)null);
        return;
      case BuildingPackage.ADD_WINDOW_PROCESS__LEVELS:
        setLevels((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BuildingPackage.ADD_WINDOW_PROCESS__NUM:
        return num != null;
      case BuildingPackage.ADD_WINDOW_PROCESS__LEVELS:
        return levels != null;
    }
    return super.eIsSet(featureID);
  }

} //AddWindowProcessImpl
