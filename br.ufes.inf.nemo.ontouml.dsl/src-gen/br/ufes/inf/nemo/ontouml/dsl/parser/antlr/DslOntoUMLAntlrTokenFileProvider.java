/*
* generated by Xtext
*/
package br.ufes.inf.nemo.ontouml.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DslOntoUMLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("br/ufes/inf/nemo/ontouml/dsl/parser/antlr/internal/InternalDslOntoUML.tokens");
	}
}