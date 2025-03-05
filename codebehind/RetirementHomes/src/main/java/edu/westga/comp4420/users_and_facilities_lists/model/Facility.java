package edu.westga.comp4420.users_and_facilities.model;

/**
 * Stores the usable facilities that are made.
 *
 * @author	Comp 4420
 * @version Spring 2025
 */
public final class OwnedFacility {   

	private final String homeName;
	private final String address;
	private final int zipCode;
	
	/**
	 * Create and initialize a new facility with the provided information.
	 * 
	 * @precondition homeName != null &&
	 *				 !firstName.isEmpty() &&
	 * 				 !address.isEmpty() &&
	 * 				 zipCode > 0
	 * @postcondition getHomeName() == homeName &&
	 * 				  getAddress() == lastName &&
	 * 				  getEmail() == email
	 * 
	 * @param homeName the name of the facility
	 * @param address the address of the facility
	 * @param zipCode the zip code of the facility
	 */
	public Facility(String homeName, String address, int zipCode) {
		if (homeName == null) {
			throw new IllegalArgumentException("Must provide a name, but first name was null.");
		}
		if (homeName.isEmpty()) {
			throw new IllegalArgumentException("Must provide a name with at least one character.");
		}
		if (address == null) {
			throw new IllegalArgumentException("Must provide a address, but last name was null.");
		}
		if (address.isEmpty()) {
			throw new IllegalArgumentException("Must provide a address with at least one character");
		}
		if (zipCode == null) {
			throw new IllegalArgumentException("Must provide a zip code, but zip code was null.");
		}
		if (zipCode < 0) {
			throw new IllegalArgumentException("Must provide a valid zip code");
		}
		if (zipCode < 10000 || number > 99999) {
        	throw new IllegalArgumentException("Zip code must be 5 digits long.");
    	}
		this.homeName = homeName;
		this.address = address;
		this.zipCode = zipCode;
	}
	
	/**
	 * Return the name of the facility.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the first name for the new user
	 */
	public String getHomeName() {
		return this.homeName;
	}
	
	/**
	 * Return the address of the facility
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the last name of the user
	 */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * Return the zipcode of the facility
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the amount currently in the cart for the new grocery item
	 */
	public int getZipCode() {
		return this.zipCode;
	}
	
	@Override
	public String toString() {
		return this.homeName + this.address + "/" + this.zipCode;
	}
}