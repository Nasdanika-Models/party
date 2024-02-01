/**
 */
package org.nasdanika.models.party.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.party.ContactMethod;
import org.nasdanika.models.party.EMail;
import org.nasdanika.models.party.Organization;
import org.nasdanika.models.party.Party;
import org.nasdanika.models.party.PartyFactory;
import org.nasdanika.models.party.PartyPackage;
import org.nasdanika.models.party.Person;
import org.nasdanika.models.party.Phone;
import org.nasdanika.models.party.PostalAddress;
import org.nasdanika.models.party.Role;
import org.nasdanika.models.party.WebAddress;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartyPackageImpl extends EPackageImpl implements PartyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eMailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webAddressEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.party.PartyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PartyPackageImpl() {
		super(eNS_URI, PartyFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PartyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PartyPackage init() {
		if (isInited) return (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPartyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PartyPackageImpl thePartyPackage = registeredPartyPackage instanceof PartyPackageImpl ? (PartyPackageImpl)registeredPartyPackage : new PartyPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePartyPackage.createPackageContents();

		// Initialize created meta-data
		thePartyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePartyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PartyPackage.eNS_URI, thePartyPackage);
		return thePartyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParty() {
		return partyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_ContactMethods() {
		return (EReference)partyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Players() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganization_Roles() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactMethod() {
		return contactMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEMail() {
		return eMailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEMail_EMailAddress() {
		return (EAttribute)eMailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhone() {
		return phoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhone_CountryCode() {
		return (EAttribute)phoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhone_AreaCode() {
		return (EAttribute)phoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhone_PhoneNumber() {
		return (EAttribute)phoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhone_Extension() {
		return (EAttribute)phoneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostalAddress() {
		return postalAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddress_Country() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddress_StateProvince() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddress_City() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddress_PostalCode() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddress_Line1() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddress_Line2() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebAddress() {
		return webAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebAddress_Url() {
		return (EAttribute)webAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyFactory getPartyFactory() {
		return (PartyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		partyEClass = createEClass(PARTY);
		createEReference(partyEClass, PARTY__CONTACT_METHODS);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__PLAYERS);

		organizationEClass = createEClass(ORGANIZATION);
		createEReference(organizationEClass, ORGANIZATION__ROLES);

		personEClass = createEClass(PERSON);

		contactMethodEClass = createEClass(CONTACT_METHOD);

		eMailEClass = createEClass(EMAIL);
		createEAttribute(eMailEClass, EMAIL__EMAIL_ADDRESS);

		phoneEClass = createEClass(PHONE);
		createEAttribute(phoneEClass, PHONE__COUNTRY_CODE);
		createEAttribute(phoneEClass, PHONE__AREA_CODE);
		createEAttribute(phoneEClass, PHONE__PHONE_NUMBER);
		createEAttribute(phoneEClass, PHONE__EXTENSION);

		postalAddressEClass = createEClass(POSTAL_ADDRESS);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__COUNTRY);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__STATE_PROVINCE);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__CITY);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__POSTAL_CODE);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__LINE1);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__LINE2);

		webAddressEClass = createEClass(WEB_ADDRESS);
		createEAttribute(webAddressEClass, WEB_ADDRESS__URL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		partyEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedStringIdentity());
		roleEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedStringIdentity());
		organizationEClass.getESuperTypes().add(this.getParty());
		personEClass.getESuperTypes().add(this.getParty());
		contactMethodEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedStringIdentity());
		eMailEClass.getESuperTypes().add(this.getContactMethod());
		phoneEClass.getESuperTypes().add(this.getContactMethod());
		postalAddressEClass.getESuperTypes().add(this.getContactMethod());
		webAddressEClass.getESuperTypes().add(this.getContactMethod());

		// Initialize classes, features, and operations; add parameters
		initEClass(partyEClass, Party.class, "Party", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParty_ContactMethods(), this.getContactMethod(), null, "contactMethods", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Players(), this.getParty(), null, "players", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganization_Roles(), this.getRole(), null, "roles", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrganization_Roles().getEKeys().add(theNcorePackage.getStringIdentity_Id());

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contactMethodEClass, ContactMethod.class, "ContactMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eMailEClass, EMail.class, "EMail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMail_EMailAddress(), ecorePackage.getEString(), "eMailAddress", null, 0, 1, EMail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phoneEClass, Phone.class, "Phone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhone_CountryCode(), ecorePackage.getEInt(), "countryCode", null, 0, 1, Phone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhone_AreaCode(), ecorePackage.getEInt(), "areaCode", null, 0, 1, Phone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhone_PhoneNumber(), ecorePackage.getEInt(), "phoneNumber", null, 0, 1, Phone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhone_Extension(), ecorePackage.getEInt(), "extension", null, 0, 1, Phone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postalAddressEClass, PostalAddress.class, "PostalAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostalAddress_Country(), ecorePackage.getEString(), "country", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddress_StateProvince(), ecorePackage.getEString(), "stateProvince", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddress_City(), ecorePackage.getEString(), "city", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddress_PostalCode(), ecorePackage.getEString(), "postalCode", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddress_Line1(), ecorePackage.getEString(), "line1", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddress_Line2(), ecorePackage.getEString(), "line2", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webAddressEClass, WebAddress.class, "WebAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebAddress_Url(), ecorePackage.getEString(), "url", null, 0, 1, WebAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// urn:org.nasdanika
		createUrnorgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (partyEClass,
		   source,
		   new String[] {
			   "documentation", "Something that can particpate/play role in something - a person, organization, system"
		   });
		addAnnotation
		  (getParty_ContactMethods(),
		   source,
		   new String[] {
			   "documentation", "Party can have zero or more contact methods."
		   });
		addAnnotation
		  (roleEClass,
		   source,
		   new String[] {
			   "documentation", "A role played by a party in an organization. Subclasses may reference a shared role definition"
		   });
		addAnnotation
		  (getRole_Players(),
		   source,
		   new String[] {
			   "documentation", "Parties playing this role"
		   });
		addAnnotation
		  (organizationEClass,
		   source,
		   new String[] {
			   "documentation", "A grop of parties in roles collaborating to achieve some goal or perform some function "
		   });
		addAnnotation
		  (getOrganization_Roles(),
		   source,
		   new String[] {
			   "documentation", "Organization members."
		   });
		addAnnotation
		  (personEClass,
		   source,
		   new String[] {
			   "documentation", "A human party."
		   });
		addAnnotation
		  (contactMethodEClass,
		   source,
		   new String[] {
			   "documentation", "Generic contact method."
		   });
		addAnnotation
		  (eMailEClass,
		   source,
		   new String[] {
			   "documentation", "E-mail address."
		   });
		addAnnotation
		  (getEMail_EMailAddress(),
		   source,
		   new String[] {
			   "documentation", "E-Mail address."
		   });
		addAnnotation
		  (phoneEClass,
		   source,
		   new String[] {
			   "documentation", "Phone."
		   });
		addAnnotation
		  (getPhone_CountryCode(),
		   source,
		   new String[] {
			   "documentation", "Country code."
		   });
		addAnnotation
		  (getPhone_AreaCode(),
		   source,
		   new String[] {
			   "documentation", "Area code."
		   });
		addAnnotation
		  (getPhone_PhoneNumber(),
		   source,
		   new String[] {
			   "documentation", "Phone number."
		   });
		addAnnotation
		  (getPhone_Extension(),
		   source,
		   new String[] {
			   "documentation", "Optional extension."
		   });
		addAnnotation
		  (postalAddressEClass,
		   source,
		   new String[] {
			   "documentation", "Postal Address."
		   });
		addAnnotation
		  (getPostalAddress_Country(),
		   source,
		   new String[] {
			   "documentation", "Country."
		   });
		addAnnotation
		  (getPostalAddress_StateProvince(),
		   source,
		   new String[] {
			   "documentation", "State or province or region"
		   });
		addAnnotation
		  (getPostalAddress_City(),
		   source,
		   new String[] {
			   "documentation", "City/town"
		   });
		addAnnotation
		  (getPostalAddress_PostalCode(),
		   source,
		   new String[] {
			   "documentation", "Postal/zip code."
		   });
		addAnnotation
		  (getPostalAddress_Line1(),
		   source,
		   new String[] {
			   "documentation", "Address line 1."
		   });
		addAnnotation
		  (getPostalAddress_Line2(),
		   source,
		   new String[] {
			   "documentation", "Address line 2."
		   });
		addAnnotation
		  (webAddressEClass,
		   source,
		   new String[] {
			   "documentation", "URL."
		   });
		addAnnotation
		  (getWebAddress_Url(),
		   source,
		   new String[] {
			   "documentation", "URL."
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika";
		addAnnotation
		  (getEMail_EMailAddress(),
		   source,
		   new String[] {
			   "default-feature", "true"
		   });
		addAnnotation
		  (getWebAddress_Url(),
		   source,
		   new String[] {
			   "default-feature", "true"
		   });
	}

} //PartyPackageImpl
