
/*
 * generated by Xtext
 */
 
package br.ufes.inf.nemo.ontouml.dsl.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class OntoDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return br.ufes.inf.nemo.ontouml.dsl.xtext.ui.internal.OntoDSLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return br.ufes.inf.nemo.ontouml.dsl.xtext.ui.internal.OntoDSLActivator.getInstance().getInjector("br.ufes.inf.nemo.ontouml.dsl.xtext.OntoDSL");
	}
	
}