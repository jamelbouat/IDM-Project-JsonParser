/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.idmproject.jsonParser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.idmproject.jsonParser.Compute#getExpression1 <em>Expression1</em>}</li>
 *   <li>{@link org.xtext.example.idmproject.jsonParser.Compute#getExpression2 <em>Expression2</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.idmproject.jsonParser.JsonParserPackage#getCompute()
 * @model
 * @generated
 */
public interface Compute extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression1</em>' containment reference.
   * @see #setExpression1(Expression)
   * @see org.xtext.example.idmproject.jsonParser.JsonParserPackage#getCompute_Expression1()
   * @model containment="true"
   * @generated
   */
  Expression getExpression1();

  /**
   * Sets the value of the '{@link org.xtext.example.idmproject.jsonParser.Compute#getExpression1 <em>Expression1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression1</em>' containment reference.
   * @see #getExpression1()
   * @generated
   */
  void setExpression1(Expression value);

  /**
   * Returns the value of the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression2</em>' containment reference.
   * @see #setExpression2(Expression)
   * @see org.xtext.example.idmproject.jsonParser.JsonParserPackage#getCompute_Expression2()
   * @model containment="true"
   * @generated
   */
  Expression getExpression2();

  /**
   * Sets the value of the '{@link org.xtext.example.idmproject.jsonParser.Compute#getExpression2 <em>Expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression2</em>' containment reference.
   * @see #getExpression2()
   * @generated
   */
  void setExpression2(Expression value);

} // Compute