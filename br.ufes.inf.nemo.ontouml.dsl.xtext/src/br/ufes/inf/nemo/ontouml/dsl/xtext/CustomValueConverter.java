package br.ufes.inf.nemo.ontouml.dsl.xtext;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parsetree.AbstractNode;

import OntoDSL.Cardinality;
import OntoDSL.OntoDSLFactory;

//import com.google.inject.Inject;
//import br.ufes.inf.nemo.ontouml.refontouml.

public class CustomValueConverter extends DefaultTerminalConverters {

	@ValueConverter(rule = "UnlimitedNaturalValue")
	public IValueConverter<Integer> UnlimitedNaturalValue() {
	    return new IValueConverter<Integer>() {
	        public Integer toValue(String string, AbstractNode node) {
	        	return -1;
	        }

	        public String toString(Integer value) {
	        	return "*";
	        }
	    };
	}
	

	@ValueConverter(rule = "CardinalityLiteral")
	public IValueConverter<Cardinality> CardinalityLiteral(){
		return new IValueConverter<Cardinality>(){

			public Cardinality toValue(String string, AbstractNode node)
					throws ValueConverterException {

				Cardinality card = OntoDSLFactory.eINSTANCE.createCardinality();
				if(string == "*"){
					card.setLower(0);
					card.setUpper(-1);
				}else if(string == "+"){
					card.setLower(1);
					card.setUpper(-1);					
				}else if (string == "?"){
					card.setLower(0);
					card.setUpper(1);
				}
				else {
					throw new ValueConverterException("Couldn't convert '" + string + "' to Cardinality", node, null);
				}

				return card;
			}

			public String toString(Cardinality value)
					throws ValueConverterException {

				String token;
				int lower = value.getLower();
				int upper = value.getUpper();

				if(lower == 0 && upper == 1){
					token = "?";
				} else if(lower == 0 && upper == -1){
					token = "*";
				} else if(lower == 1 && upper == -1 ){
					token = "+";
				}else {
					throw new ValueConverterException("Couldn't convert to CardinalityLiteral", null, null);
				}

				return token;
			}
			
		};
	}

	
/*
	@ValueConverter(rule = "PropertyBound")
	public IValueConverter<Integer> PropertyBound() {
	    return new IValueConverter<Integer>() {
	        public Integer toValue(String string, AbstractNode node) {
	            if (Strings.isEmpty(string))
	                throw new ValueConverterException("Couldn't convert empty string to int", node, null);
	            else if ("*".equals(string.trim()))
	                return -1;
	            try {
	                return Integer.parseInt(string);
	            } catch (NumberFormatException e) {
	                throw new ValueConverterException("Couldn't convert '"+string+"' to int", node, e);
	            }
	        }
	
	        public String toString(Integer value) {
	            return ((value == -1) ? "*" : Integer.toString(value));
	        }
	    };
	}
*/
	
}
