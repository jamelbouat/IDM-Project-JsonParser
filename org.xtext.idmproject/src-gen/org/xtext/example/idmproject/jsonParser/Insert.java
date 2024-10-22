/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.idmproject.jsonParser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.idmproject.jsonParser.Insert#getKey <em>Key</em>}</li>
 *   <li>{@link org.xtext.example.idmproject.jsonParser.Insert#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.idmproject.jsonParser.JsonParserPackage#getInsert()
 * @model
 * @generated
 */
public interface Insert extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see org.xtext.example.idmproject.jsonParser.JsonParserPackage#getInsert_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link org.xtext.example.idmproject.jsonParser.Insert#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Value)
   * @see org.xtext.example.idmproject.jsonParser.JsonParserPackage#getInsert_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.idmproject.jsonParser.Insert#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

} // Insert
