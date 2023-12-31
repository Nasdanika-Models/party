/**
 */
package org.nasdanika.models.party;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * E-mail address.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.party.EMail#getEMailAddress <em>EMail Address</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.party.PartyPackage#getEMail()
 * @model
 * @generated
 */
public interface EMail extends ContactMethod {
	/**
	 * Returns the value of the '<em><b>EMail Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * E-Mail address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EMail Address</em>' attribute.
	 * @see #setEMailAddress(String)
	 * @see org.nasdanika.models.party.PartyPackage#getEMail_EMailAddress()
	 * @model annotation="urn:org.nasdanika default-feature='true'"
	 * @generated
	 */
	String getEMailAddress();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.party.EMail#getEMailAddress <em>EMail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMail Address</em>' attribute.
	 * @see #getEMailAddress()
	 * @generated
	 */
	void setEMailAddress(String value);

} // EMail
