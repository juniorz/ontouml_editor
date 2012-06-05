
package br.ufes.inf.nemo.ontouml.dsl.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class OntoDSLStandaloneSetup extends OntoDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new OntoDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

