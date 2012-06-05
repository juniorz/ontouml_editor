/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoDSL.util;

import OntoDSL.OntoDSLPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OntoDSLXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoDSLXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		OntoDSLPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the OntoDSLResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new OntoDSLResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new OntoDSLResourceFactoryImpl());
		}
		return registrations;
	}

} //OntoDSLXMLProcessor
