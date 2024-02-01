/**
 */
package org.nasdanika.models.party.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.nasdanika.common.Adaptable;
import org.nasdanika.models.party.*;
import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.DocumentedNamedElement;
import org.nasdanika.ncore.DocumentedNamedStringIdentity;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NamedElement;
import org.nasdanika.ncore.StringIdentity;
import org.nasdanika.persistence.Marked;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.party.PartyPackage
 * @generated
 */
public class PartySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PartyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartySwitch() {
		if (modelPackage == null) {
			modelPackage = PartyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PartyPackage.PARTY: {
				Party party = (Party)theEObject;
				T result = caseParty(party);
				if (result == null) result = caseDocumentedNamedStringIdentity(party);
				if (result == null) result = caseDocumentedNamedElement(party);
				if (result == null) result = caseStringIdentity(party);
				if (result == null) result = caseNamedElement(party);
				if (result == null) result = caseDocumented(party);
				if (result == null) result = caseModelElement(party);
				if (result == null) result = caseMarked(party);
				if (result == null) result = caseAdaptable(party);
				if (result == null) result = caseIMarked(party);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartyPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseDocumentedNamedStringIdentity(role);
				if (result == null) result = caseDocumentedNamedElement(role);
				if (result == null) result = caseStringIdentity(role);
				if (result == null) result = caseNamedElement(role);
				if (result == null) result = caseDocumented(role);
				if (result == null) result = caseModelElement(role);
				if (result == null) result = caseMarked(role);
				if (result == null) result = caseAdaptable(role);
				if (result == null) result = caseIMarked(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartyPackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseParty(organization);
				if (result == null) result = caseDocumentedNamedStringIdentity(organization);
				if (result == null) result = caseDocumentedNamedElement(organization);
				if (result == null) result = caseStringIdentity(organization);
				if (result == null) result = caseNamedElement(organization);
				if (result == null) result = caseDocumented(organization);
				if (result == null) result = caseModelElement(organization);
				if (result == null) result = caseMarked(organization);
				if (result == null) result = caseAdaptable(organization);
				if (result == null) result = caseIMarked(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartyPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseParty(person);
				if (result == null) result = caseDocumentedNamedStringIdentity(person);
				if (result == null) result = caseDocumentedNamedElement(person);
				if (result == null) result = caseStringIdentity(person);
				if (result == null) result = caseNamedElement(person);
				if (result == null) result = caseDocumented(person);
				if (result == null) result = caseModelElement(person);
				if (result == null) result = caseMarked(person);
				if (result == null) result = caseAdaptable(person);
				if (result == null) result = caseIMarked(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartyPackage.CONTACT_METHOD: {
				ContactMethod contactMethod = (ContactMethod)theEObject;
				T result = caseContactMethod(contactMethod);
				if (result == null) result = caseDocumentedNamedStringIdentity(contactMethod);
				if (result == null) result = caseDocumentedNamedElement(contactMethod);
				if (result == null) result = caseStringIdentity(contactMethod);
				if (result == null) result = caseNamedElement(contactMethod);
				if (result == null) result = caseDocumented(contactMethod);
				if (result == null) result = caseModelElement(contactMethod);
				if (result == null) result = caseMarked(contactMethod);
				if (result == null) result = caseAdaptable(contactMethod);
				if (result == null) result = caseIMarked(contactMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartyPackage.EMAIL: {
				EMail eMail = (EMail)theEObject;
				T result = caseEMail(eMail);
				if (result == null) result = caseContactMethod(eMail);
				if (result == null) result = caseDocumentedNamedStringIdentity(eMail);
				if (result == null) result = caseDocumentedNamedElement(eMail);
				if (result == null) result = caseStringIdentity(eMail);
				if (result == null) result = caseNamedElement(eMail);
				if (result == null) result = caseDocumented(eMail);
				if (result == null) result = caseModelElement(eMail);
				if (result == null) result = caseMarked(eMail);
				if (result == null) result = caseAdaptable(eMail);
				if (result == null) result = caseIMarked(eMail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartyPackage.PHONE: {
				Phone phone = (Phone)theEObject;
				T result = casePhone(phone);
				if (result == null) result = caseContactMethod(phone);
				if (result == null) result = caseDocumentedNamedStringIdentity(phone);
				if (result == null) result = caseDocumentedNamedElement(phone);
				if (result == null) result = caseStringIdentity(phone);
				if (result == null) result = caseNamedElement(phone);
				if (result == null) result = caseDocumented(phone);
				if (result == null) result = caseModelElement(phone);
				if (result == null) result = caseMarked(phone);
				if (result == null) result = caseAdaptable(phone);
				if (result == null) result = caseIMarked(phone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartyPackage.POSTAL_ADDRESS: {
				PostalAddress postalAddress = (PostalAddress)theEObject;
				T result = casePostalAddress(postalAddress);
				if (result == null) result = caseContactMethod(postalAddress);
				if (result == null) result = caseDocumentedNamedStringIdentity(postalAddress);
				if (result == null) result = caseDocumentedNamedElement(postalAddress);
				if (result == null) result = caseStringIdentity(postalAddress);
				if (result == null) result = caseNamedElement(postalAddress);
				if (result == null) result = caseDocumented(postalAddress);
				if (result == null) result = caseModelElement(postalAddress);
				if (result == null) result = caseMarked(postalAddress);
				if (result == null) result = caseAdaptable(postalAddress);
				if (result == null) result = caseIMarked(postalAddress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartyPackage.WEB_ADDRESS: {
				WebAddress webAddress = (WebAddress)theEObject;
				T result = caseWebAddress(webAddress);
				if (result == null) result = caseContactMethod(webAddress);
				if (result == null) result = caseDocumentedNamedStringIdentity(webAddress);
				if (result == null) result = caseDocumentedNamedElement(webAddress);
				if (result == null) result = caseStringIdentity(webAddress);
				if (result == null) result = caseNamedElement(webAddress);
				if (result == null) result = caseDocumented(webAddress);
				if (result == null) result = caseModelElement(webAddress);
				if (result == null) result = caseMarked(webAddress);
				if (result == null) result = caseAdaptable(webAddress);
				if (result == null) result = caseIMarked(webAddress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParty(Party object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactMethod(ContactMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMail(EMail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhone(Phone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postal Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postal Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostalAddress(PostalAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebAddress(WebAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(org.nasdanika.ncore.Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptable(Adaptable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedNamedElement(DocumentedNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedNamedStringIdentity(DocumentedNamedStringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PartySwitch
