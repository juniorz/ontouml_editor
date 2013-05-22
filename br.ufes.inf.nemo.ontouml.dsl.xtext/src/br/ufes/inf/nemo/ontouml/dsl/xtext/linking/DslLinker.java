package br.ufes.inf.nemo.ontouml.dsl.xtext.linking;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.lazy.LazyLinker;

import OntoDSL.util.OntoDSLSwitch;
import RefOntoUML.util.RefOntoUMLSwitch;
import br.ufes.inf.nemo.ontouml.dsl.xtext.processing.OntoDSL;
import br.ufes.inf.nemo.ontouml.dsl.xtext.processing.RefOntoUML;

public class DslLinker extends LazyLinker {
	private final RefOntoUMLSwitch<EObject> refOntoUmlSwitch;
	private final OntoDSLSwitch<EObject> ontoDslSwitch;

	public DslLinker() {
		super();

		ontoDslSwitch = OntoDSL.createSwitch();
		refOntoUmlSwitch = RefOntoUML.createSwitch();
	}

	@Override
	protected void afterModelLinked(EObject model, IDiagnosticConsumer diagnosticsConsumer) {
		traverseAsRefOntoUmlModel(model);
		traverseAsOntoDslModel(model);
	}

	private void traverseAsOntoDslModel(EObject model){
		TreeIterator<EObject> allContents = EcoreUtil.getAllContents(model, true); // MAYBE this last arg should be true?

		while(allContents.hasNext()){
			EObject eObject = allContents.next();		
			ontoDslSwitch.doSwitch(eObject);
		}
	}

	private void traverseAsRefOntoUmlModel(EObject model){
		TreeIterator<EObject> allContents = EcoreUtil.getAllContents(model, true); // MAYBE this last arg should be true?

		while(allContents.hasNext()){
			EObject eObject = allContents.next();		
			refOntoUmlSwitch.doSwitch(eObject);
		}
	}

}
