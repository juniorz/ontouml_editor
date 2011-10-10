package br.ufes.inf.nemo.ontouml.dsl;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parsetree.AbstractNode;

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
