/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.idmproject.jsonParser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.idmproject.jsonParser.Export#getCsvFileName <em>Csv File Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.idmproject.jsonParser.JsonParserPackage#getExport()
 * @model
 * @generated
 */
public interface Export extends EObject
{
  /**
   * Returns the value of the '<em><b>Csv File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Csv File Name</em>' attribute.
   * @see #setCsvFileName(String)
   * @see org.xtext.example.idmproject.jsonParser.JsonParserPackage#getExport_CsvFileName()
   * @model
   * @generated
   */
  String getCsvFileName();

  /**
   * Sets the value of the '{@link org.xtext.example.idmproject.jsonParser.Export#getCsvFileName <em>Csv File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Csv File Name</em>' attribute.
   * @see #getCsvFileName()
   * @generated
   */
  void setCsvFileName(String value);

} // Export
