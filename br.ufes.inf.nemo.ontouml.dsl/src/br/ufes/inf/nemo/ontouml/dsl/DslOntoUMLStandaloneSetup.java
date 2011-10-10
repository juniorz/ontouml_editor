
package br.ufes.inf.nemo.ontouml.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DslOntoUMLStandaloneSetup extends DslOntoUMLStandaloneSetupGenerated{

	public static void doSetup() {
		new DslOntoUMLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

