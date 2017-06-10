/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTForall;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMT Forall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SMTForallImpl extends SMTQuantifiedExpressionImpl implements SMTForall
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTForallImpl()
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
    return SmtLanguagePackage.Literals.SMT_FORALL;
  }

} //SMTForallImpl
