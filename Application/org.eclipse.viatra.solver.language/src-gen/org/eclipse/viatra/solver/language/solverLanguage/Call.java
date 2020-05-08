/**
 * generated by Xtext 2.21.0
 */
package org.eclipse.viatra.solver.language.solverLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Call#getFunctor <em>Functor</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Call#getArgumentList <em>Argument List</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Call#isTransitiveClosure <em>Transitive Closure</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Call#isReflexiveTransitiveClosure <em>Reflexive Transitive Closure</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Expression
{
  /**
   * Returns the value of the '<em><b>Functor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functor</em>' containment reference.
   * @see #setFunctor(Reference)
   * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getCall_Functor()
   * @model containment="true"
   * @generated
   */
  Reference getFunctor();

  /**
   * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Call#getFunctor <em>Functor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functor</em>' containment reference.
   * @see #getFunctor()
   * @generated
   */
  void setFunctor(Reference value);

  /**
   * Returns the value of the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument List</em>' containment reference.
   * @see #setArgumentList(ArgumentList)
   * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getCall_ArgumentList()
   * @model containment="true"
   * @generated
   */
  ArgumentList getArgumentList();

  /**
   * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Call#getArgumentList <em>Argument List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument List</em>' containment reference.
   * @see #getArgumentList()
   * @generated
   */
  void setArgumentList(ArgumentList value);

  /**
   * Returns the value of the '<em><b>Transitive Closure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitive Closure</em>' attribute.
   * @see #setTransitiveClosure(boolean)
   * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getCall_TransitiveClosure()
   * @model
   * @generated
   */
  boolean isTransitiveClosure();

  /**
   * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Call#isTransitiveClosure <em>Transitive Closure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transitive Closure</em>' attribute.
   * @see #isTransitiveClosure()
   * @generated
   */
  void setTransitiveClosure(boolean value);

  /**
   * Returns the value of the '<em><b>Reflexive Transitive Closure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reflexive Transitive Closure</em>' attribute.
   * @see #setReflexiveTransitiveClosure(boolean)
   * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getCall_ReflexiveTransitiveClosure()
   * @model
   * @generated
   */
  boolean isReflexiveTransitiveClosure();

  /**
   * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Call#isReflexiveTransitiveClosure <em>Reflexive Transitive Closure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reflexive Transitive Closure</em>' attribute.
   * @see #isReflexiveTransitiveClosure()
   * @generated
   */
  void setReflexiveTransitiveClosure(boolean value);

} // Call
