/*
* generated by Xtext
*/
package br.ufes.inf.nemo.ontouml.dsl.xtext.parser.antlr;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

import com.google.inject.Inject;

import br.ufes.inf.nemo.ontouml.dsl.xtext.services.OntoDSLGrammarAccess;

public class OntoDSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private OntoDSLGrammarAccess grammarAccess;
	
	@Override
	protected IParseResult parse(String ruleName, CharStream in) {
		TokenSource tokenSource = createLexer(in);
		XtextTokenStream tokenStream = createTokenStream(tokenSource);
		tokenStream.setInitialHiddenTokens("RULE_NL", "RULE_RWS", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
		br.ufes.inf.nemo.ontouml.dsl.xtext.parser.antlr.internal.InternalOntoDSLParser parser = createParser(tokenStream);
		parser.setTokenTypeMap(getTokenDefProvider().getTokenDefMap());
		parser.setSyntaxErrorProvider(getSyntaxErrorProvider());
		parser.setUnorderedGroupHelper(getUnorderedGroupHelper().get());
		try {
			if(ruleName != null)
				return parser.parse(ruleName);
			return parser.parse();
		} catch (Exception re) {
			throw new ParseException(re.getMessage(),re);
		}
	}
	
	protected br.ufes.inf.nemo.ontouml.dsl.xtext.parser.antlr.internal.InternalOntoDSLParser createParser(XtextTokenStream stream) {
		return new br.ufes.inf.nemo.ontouml.dsl.xtext.parser.antlr.internal.InternalOntoDSLParser(stream, getElementFactory(), getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public OntoDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(OntoDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
