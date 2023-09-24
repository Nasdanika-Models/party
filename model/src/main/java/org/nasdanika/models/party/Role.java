/**
 */
package org.nasdanika.models.party;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link org.nasdanika.models.party.Role#getPlayers <em>Players</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.party.PartyPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Players</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.party.Party}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parties playing this role
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Players</em>' reference list.
	 * @see org.nasdanika.models.party.PartyPackage#getRole_Players()
	 * @model
	 * @generated
	 */
	EList<Party> getPlayers();

} // Role
