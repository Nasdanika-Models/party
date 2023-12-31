/**
 */
package org.nasdanika.models.party.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.party.PartyPackage;
import org.nasdanika.models.party.Phone;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.party.impl.PhoneImpl#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link org.nasdanika.models.party.impl.PhoneImpl#getAreaCode <em>Area Code</em>}</li>
 *   <li>{@link org.nasdanika.models.party.impl.PhoneImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link org.nasdanika.models.party.impl.PhoneImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhoneImpl extends ContactMethodImpl implements Phone {
	/**
	 * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNTRY_CODE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getAreaCode() <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaCode()
	 * @generated
	 * @ordered
	 */
	protected static final int AREA_CODE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PHONE_NUMBER_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final int EXTENSION_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PHONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCountryCode() {
		return (Integer)eDynamicGet(PartyPackage.PHONE__COUNTRY_CODE, PartyPackage.Literals.PHONE__COUNTRY_CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryCode(int newCountryCode) {
		eDynamicSet(PartyPackage.PHONE__COUNTRY_CODE, PartyPackage.Literals.PHONE__COUNTRY_CODE, newCountryCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAreaCode() {
		return (Integer)eDynamicGet(PartyPackage.PHONE__AREA_CODE, PartyPackage.Literals.PHONE__AREA_CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAreaCode(int newAreaCode) {
		eDynamicSet(PartyPackage.PHONE__AREA_CODE, PartyPackage.Literals.PHONE__AREA_CODE, newAreaCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPhoneNumber() {
		return (Integer)eDynamicGet(PartyPackage.PHONE__PHONE_NUMBER, PartyPackage.Literals.PHONE__PHONE_NUMBER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhoneNumber(int newPhoneNumber) {
		eDynamicSet(PartyPackage.PHONE__PHONE_NUMBER, PartyPackage.Literals.PHONE__PHONE_NUMBER, newPhoneNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getExtension() {
		return (Integer)eDynamicGet(PartyPackage.PHONE__EXTENSION, PartyPackage.Literals.PHONE__EXTENSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtension(int newExtension) {
		eDynamicSet(PartyPackage.PHONE__EXTENSION, PartyPackage.Literals.PHONE__EXTENSION, newExtension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.PHONE__COUNTRY_CODE:
				return getCountryCode();
			case PartyPackage.PHONE__AREA_CODE:
				return getAreaCode();
			case PartyPackage.PHONE__PHONE_NUMBER:
				return getPhoneNumber();
			case PartyPackage.PHONE__EXTENSION:
				return getExtension();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PartyPackage.PHONE__COUNTRY_CODE:
				setCountryCode((Integer)newValue);
				return;
			case PartyPackage.PHONE__AREA_CODE:
				setAreaCode((Integer)newValue);
				return;
			case PartyPackage.PHONE__PHONE_NUMBER:
				setPhoneNumber((Integer)newValue);
				return;
			case PartyPackage.PHONE__EXTENSION:
				setExtension((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PartyPackage.PHONE__COUNTRY_CODE:
				setCountryCode(COUNTRY_CODE_EDEFAULT);
				return;
			case PartyPackage.PHONE__AREA_CODE:
				setAreaCode(AREA_CODE_EDEFAULT);
				return;
			case PartyPackage.PHONE__PHONE_NUMBER:
				setPhoneNumber(PHONE_NUMBER_EDEFAULT);
				return;
			case PartyPackage.PHONE__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PartyPackage.PHONE__COUNTRY_CODE:
				return getCountryCode() != COUNTRY_CODE_EDEFAULT;
			case PartyPackage.PHONE__AREA_CODE:
				return getAreaCode() != AREA_CODE_EDEFAULT;
			case PartyPackage.PHONE__PHONE_NUMBER:
				return getPhoneNumber() != PHONE_NUMBER_EDEFAULT;
			case PartyPackage.PHONE__EXTENSION:
				return getExtension() != EXTENSION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PhoneImpl
