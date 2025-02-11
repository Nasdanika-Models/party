/**
 */
package org.nasdanika.models.party;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.DocumentedNamedStringIdentity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A role played by a party in an organization. Subclasses may reference a shared role definition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.party.Role#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.party.PartyPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends DocumentedNamedStringIdentity {
	/**
	 * Returns the value of the '<em><b>Actors</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.party.Party}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parties playing this role
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actors</em>' reference list.
	 * @see org.nasdanika.models.party.PartyPackage#getRole_Actors()
	 * @model
	 * @generated
	 */
	EList<Party> getActors();

} // Role
