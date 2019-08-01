/**
 * generated by Xtext 2.17.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl;

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.IntervallNumber;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intervall Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl.IntervallNumberImpl#getMin <em>Min</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl.IntervallNumberImpl#getMaxNumber <em>Max Number</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl.IntervallNumberImpl#isMaxUnlimited <em>Max Unlimited</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervallNumberImpl extends NumberSpecificationImpl implements IntervallNumber
{
  /**
   * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected static final int MIN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected int min = MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxNumber() <em>Max Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxNumber()
   * @generated
   * @ordered
   */
  protected static final int MAX_NUMBER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxNumber() <em>Max Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxNumber()
   * @generated
   * @ordered
   */
  protected int maxNumber = MAX_NUMBER_EDEFAULT;

  /**
   * The default value of the '{@link #isMaxUnlimited() <em>Max Unlimited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMaxUnlimited()
   * @generated
   * @ordered
   */
  protected static final boolean MAX_UNLIMITED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMaxUnlimited() <em>Max Unlimited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMaxUnlimited()
   * @generated
   * @ordered
   */
  protected boolean maxUnlimited = MAX_UNLIMITED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntervallNumberImpl()
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
    return ApplicationConfigurationPackage.Literals.INTERVALL_NUMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMin(int newMin)
  {
    int oldMin = min;
    min = newMin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationConfigurationPackage.INTERVALL_NUMBER__MIN, oldMin, min));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMaxNumber()
  {
    return maxNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMaxNumber(int newMaxNumber)
  {
    int oldMaxNumber = maxNumber;
    maxNumber = newMaxNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationConfigurationPackage.INTERVALL_NUMBER__MAX_NUMBER, oldMaxNumber, maxNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isMaxUnlimited()
  {
    return maxUnlimited;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMaxUnlimited(boolean newMaxUnlimited)
  {
    boolean oldMaxUnlimited = maxUnlimited;
    maxUnlimited = newMaxUnlimited;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationConfigurationPackage.INTERVALL_NUMBER__MAX_UNLIMITED, oldMaxUnlimited, maxUnlimited));
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
      case ApplicationConfigurationPackage.INTERVALL_NUMBER__MIN:
        return getMin();
      case ApplicationConfigurationPackage.INTERVALL_NUMBER__MAX_NUMBER:
        return getMaxNumber();
      case ApplicationConfigurationPackage.INTERVALL_NUMBER__MAX_UNLIMITED:
        return isMaxUnlimited();
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
      case ApplicationConfigurationPackage.INTERVALL_NUMBER__MIN:
        setMin((Integer)newValue);
        return;
      case ApplicationConfigurationPackage.INTERVALL_NUMBER__MAX_NUMBER:
        setMaxNumber((Integer)newValue);
        return;
      case ApplicationConfigurationPackage.INTERVALL_NUMBER__MAX_UNLIMITED:
        setMaxUnlimited((Boolean)newValue);
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
      case ApplicationConfigurationPackage.INTERVALL_NUMBER__MIN:
        setMin(MIN_EDEFAULT);
        return;
      case ApplicationConfigurationPackage.INTERVALL_NUMBER__MAX_NUMBER:
        setMaxNumber(MAX_NUMBER_EDEFAULT);
        return;
      case ApplicationConfigurationPackage.INTERVALL_NUMBER__MAX_UNLIMITED:
        setMaxUnlimited(MAX_UNLIMITED_EDEFAULT);
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
      case ApplicationConfigurationPackage.INTERVALL_NUMBER__MIN:
        return min != MIN_EDEFAULT;
      case ApplicationConfigurationPackage.INTERVALL_NUMBER__MAX_NUMBER:
        return maxNumber != MAX_NUMBER_EDEFAULT;
      case ApplicationConfigurationPackage.INTERVALL_NUMBER__MAX_UNLIMITED:
        return maxUnlimited != MAX_UNLIMITED_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (min: ");
    result.append(min);
    result.append(", maxNumber: ");
    result.append(maxNumber);
    result.append(", maxUnlimited: ");
    result.append(maxUnlimited);
    result.append(')');
    return result.toString();
  }

} //IntervallNumberImpl
