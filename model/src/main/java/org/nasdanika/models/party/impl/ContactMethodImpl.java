/**
 */
package org.nasdanika.models.party.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.party.ContactMethod;
import org.nasdanika.models.party.PartyPackage;
import org.nasdanika.ncore.impl.DocumentedNamedStringIdentityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ContactMethodImpl extends DocumentedNamedStringIdentityImpl implements ContactMethod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.CONTACT_METHOD;
	}

} //ContactMethodImpl
