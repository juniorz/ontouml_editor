package OntoDSL.adapter;

import RefOntoUML.util.RefOntoUMLAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

public class DslAdapterFactory extends RefOntoUMLAdapterFactory
{
	protected Adapter adapter;

	public Adapter createAssociationAdapter() {
		if (adapter == null) {
			adapter = new OwnedMemberObserver();
		}

		return adapter;
	}

}
