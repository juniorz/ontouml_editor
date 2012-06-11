/*
 * generated by Xtext
 */
package br.ufes.inf.nemo.ontouml.dsl.xtext;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.linking.ILinker;

import br.ufes.inf.nemo.ontouml.dsl.xtext.CustomValueConverter;
import br.ufes.inf.nemo.ontouml.dsl.xtext.linking.DslLinker;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class OntoDSLRuntimeModule extends br.ufes.inf.nemo.ontouml.dsl.xtext.AbstractOntoDSLRuntimeModule {

    @Override
    public Class<? extends IValueConverterService> bindIValueConverterService() {
        return CustomValueConverter.class;
    }

	@Override
	public Class<? extends ILinker> bindILinker() {
		return DslLinker.class;
	}
}
