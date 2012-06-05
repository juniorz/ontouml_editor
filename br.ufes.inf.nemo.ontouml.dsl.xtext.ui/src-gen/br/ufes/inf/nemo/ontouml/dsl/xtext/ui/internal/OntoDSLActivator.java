
/*
 * generated by Xtext
 */
package br.ufes.inf.nemo.ontouml.dsl.xtext.ui.internal;

import org.apache.log4j.Logger;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;

import java.util.Map;
import java.util.HashMap;

/**
 * Generated
 */
public class OntoDSLActivator extends AbstractUIPlugin {

	private Map<String,Injector> injectors = new HashMap<String,Injector>();
	private static OntoDSLActivator INSTANCE;

	public Injector getInjector(String languageName) {
		return injectors.get(languageName);
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		try {
			
			injectors.put("br.ufes.inf.nemo.ontouml.dsl.xtext.OntoDSL", Guice.createInjector(
				Modules.override(Modules.override(getRuntimeModule("br.ufes.inf.nemo.ontouml.dsl.xtext.OntoDSL")).with(getUiModule("br.ufes.inf.nemo.ontouml.dsl.xtext.OntoDSL"))).with(getSharedStateModule())
			));
			
		} catch (Exception e) {
			Logger.getLogger(getClass()).error(e.getMessage(), e);
			throw e;
		}
	}
	
	public static OntoDSLActivator getInstance() {
		return INSTANCE;
	}
	
	protected Module getRuntimeModule(String grammar) {
		
		if ("br.ufes.inf.nemo.ontouml.dsl.xtext.OntoDSL".equals(grammar)) {
		  return new br.ufes.inf.nemo.ontouml.dsl.xtext.OntoDSLRuntimeModule();
		}
		
		throw new IllegalArgumentException(grammar);
	}
	protected Module getUiModule(String grammar) {
		
		if ("br.ufes.inf.nemo.ontouml.dsl.xtext.OntoDSL".equals(grammar)) {
		  return new br.ufes.inf.nemo.ontouml.dsl.xtext.ui.OntoDSLUiModule(this);
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new org.eclipse.xtext.ui.shared.SharedStateModule();
	}
	
}
