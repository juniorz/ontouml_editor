
/*
 * generated by Xtext
 */
 
package br.ufes.inf.nemo.ontouml.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class DslOntoUMLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return br.ufes.inf.nemo.ontouml.dsl.ui.internal.DslOntoUMLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return br.ufes.inf.nemo.ontouml.dsl.ui.internal.DslOntoUMLActivator.getInstance().getInjector("br.ufes.inf.nemo.ontouml.dsl.DslOntoUML");
	}
	
}
