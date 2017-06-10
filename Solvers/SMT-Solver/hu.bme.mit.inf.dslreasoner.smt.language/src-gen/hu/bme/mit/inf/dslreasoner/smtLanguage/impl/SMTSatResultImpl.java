/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMT Sat Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSatResultImpl#isSat <em>Sat</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSatResultImpl#isUnsat <em>Unsat</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSatResultImpl#isUnknown <em>Unknown</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMTSatResultImpl extends SMTResultImpl implements SMTSatResult
{
  /**
   * The default value of the '{@link #isSat() <em>Sat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSat()
   * @generated
   * @ordered
   */
  protected static final boolean SAT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSat() <em>Sat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSat()
   * @generated
   * @ordered
   */
  protected boolean sat = SAT_EDEFAULT;

  /**
   * The default value of the '{@link #isUnsat() <em>Unsat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnsat()
   * @generated
   * @ordered
   */
  protected static final boolean UNSAT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnsat() <em>Unsat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnsat()
   * @generated
   * @ordered
   */
  protected boolean unsat = UNSAT_EDEFAULT;

  /**
   * The default value of the '{@link #isUnknown() <em>Unknown</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnknown()
   * @generated
   * @ordered
   */
  protected static final boolean UNKNOWN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnknown() <em>Unknown</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnknown()
   * @generated
   * @ordered
   */
  protected boolean unknown = UNKNOWN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTSatResultImpl()
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
    return SmtLanguagePackage.Literals.SMT_SAT_RESULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSat()
  {
    return sat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSat(boolean newSat)
  {
    boolean oldSat = sat;
    sat = newSat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_SAT_RESULT__SAT, oldSat, sat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnsat()
  {
    return unsat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnsat(boolean newUnsat)
  {
    boolean oldUnsat = unsat;
    unsat = newUnsat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_SAT_RESULT__UNSAT, oldUnsat, unsat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnknown()
  {
    return unknown;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnknown(boolean newUnknown)
  {
    boolean oldUnknown = unknown;
    unknown = newUnknown;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_SAT_RESULT__UNKNOWN, oldUnknown, unknown));
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
      case SmtLanguagePackage.SMT_SAT_RESULT__SAT:
        return isSat();
      case SmtLanguagePackage.SMT_SAT_RESULT__UNSAT:
        return isUnsat();
      case SmtLanguagePackage.SMT_SAT_RESULT__UNKNOWN:
        return isUnknown();
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
      case SmtLanguagePackage.SMT_SAT_RESULT__SAT:
        setSat((Boolean)newValue);
        return;
      case SmtLanguagePackage.SMT_SAT_RESULT__UNSAT:
        setUnsat((Boolean)newValue);
        return;
      case SmtLanguagePackage.SMT_SAT_RESULT__UNKNOWN:
        setUnknown((Boolean)newValue);
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
      case SmtLanguagePackage.SMT_SAT_RESULT__SAT:
        setSat(SAT_EDEFAULT);
        return;
      case SmtLanguagePackage.SMT_SAT_RESULT__UNSAT:
        setUnsat(UNSAT_EDEFAULT);
        return;
      case SmtLanguagePackage.SMT_SAT_RESULT__UNKNOWN:
        setUnknown(UNKNOWN_EDEFAULT);
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
      case SmtLanguagePackage.SMT_SAT_RESULT__SAT:
        return sat != SAT_EDEFAULT;
      case SmtLanguagePackage.SMT_SAT_RESULT__UNSAT:
        return unsat != UNSAT_EDEFAULT;
      case SmtLanguagePackage.SMT_SAT_RESULT__UNKNOWN:
        return unknown != UNKNOWN_EDEFAULT;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (sat: ");
    result.append(sat);
    result.append(", unsat: ");
    result.append(unsat);
    result.append(", unknown: ");
    result.append(unknown);
    result.append(')');
    return result.toString();
  }

} //SMTSatResultImpl
