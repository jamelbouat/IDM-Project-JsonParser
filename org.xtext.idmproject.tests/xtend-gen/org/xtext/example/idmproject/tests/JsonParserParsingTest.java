/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.idmproject.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.example.idmproject.jsonParser.JsonModel;
import org.xtext.example.idmproject.tests.JsonParserInjectorProvider;
import org.xtext.example.idmproject.tests.PythonCompiler;

@ExtendWith(InjectionExtension.class)
@InjectWith(JsonParserInjectorProvider.class)
@SuppressWarnings("all")
public class JsonParserParsingTest {
  @Inject
  private ParseHelper<JsonModel> parseHelper;
  
  @Test
  @Order(1)
  public void loadBaseFile() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(".load(\"file.json\")");
      _builder.newLine();
      final JsonModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      final PythonCompiler cmpPython = new PythonCompiler(result);
      cmpPython.compileAndRun();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  @Order(2)
  public void storeData() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(".load(\"file.json\")");
      _builder.newLine();
      _builder.append(".store(\"newFile.json\")");
      _builder.newLine();
      final JsonModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      final PythonCompiler cmpPython = new PythonCompiler(result);
      cmpPython.compileAndRun();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  @Order(3)
  public void insertData() {
    try {
      final String value = (("newKey" + " : ") + "newValue");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(".load(\"file.json\")");
      _builder.newLine();
      _builder.append(".insert(\"prevKey\",\"\"\"newKey\" : \"newValue\")");
      _builder.newLine();
      final JsonModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      final PythonCompiler cmpPython = new PythonCompiler(result);
      cmpPython.compileAndRun();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
