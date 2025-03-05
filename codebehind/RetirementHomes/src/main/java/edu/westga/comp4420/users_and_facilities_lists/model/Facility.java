package edu.westga.comp4420.users_and_facilities_lists.model;

/**
 * Stores the usable facilities that are made.
 *
 * @author	Comp 4420
 * @version Spring 2025
 */
public final class Facility {   

	private final String homeName;
	private final String address;
	private final String owner;
	
	/**
	 * Create and initialize a new facility with the provided information.
	 * 
	 * @precondition homeName != null &&
	 *				 !homeName.isEmpty() &&
	 * 				 !address.isEmpty() &&
	 * 				 owner > 0
	 * @postcondition getHomeName() == homeName &&
	 * 				  getAddress() == lastName &&
	 * 				  getOwner() == email
	 * 
	 * @param homeName the name of the facility
	 * @param address the address of the facility
	 * @param owner the owner of the facility
	 */
	public Facility(String homeName, String address, String owner) {
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
		if (owner == null) {
			throw new IllegalArgumentException("Must provide a name, but name was null.");
		}
		if (owner.isEmpty()) {
			throw new IllegalArgumentException("Must provide a name for the owner");
		}
		this.homeName = homeName;
		this.address = address;
		this.owner = owner;
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
	public String getOwner() {
		return this.owner;
	}
	
	@Override
	public String toString() {
		return this.homeName + this.address + "/" + this.owner;
	}
}