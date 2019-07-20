package com.designpattern.immutablewithbuilder;
/**Here I have used Builder pattern for Address but generally it is used for immutable classes.
 * Here Address is not immutable.
 * 
 * @author manoj
 *
 */
public class Address {

	private String street;
	private String landMark;
	
	public Address() {
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public static class AddressBuilder {

		private String street;
		private String landMark;


		public AddressBuilder street(String street) {

			this.street = street;

			return this;
		}

		public AddressBuilder landmark(String landmark) {
			this.landMark = landmark;
			return this;
		}

		public Address build() {
			Address u = new Address();
			u.setStreet(this.street);
			u.setLandMark(this.landMark);
			return u;
		}

	}

}
