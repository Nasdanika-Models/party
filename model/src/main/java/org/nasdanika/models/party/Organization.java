/**
 */
package org.nasdanika.models.party;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A grop of parties in roles collaborating to achieve some goal or perform some function 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.party.Organization#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.party.PartyPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends Party {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.party.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization members.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.nasdanika.models.party.PartyPackage#getOrganization_Roles()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Role> getRoles();

} // Organization
