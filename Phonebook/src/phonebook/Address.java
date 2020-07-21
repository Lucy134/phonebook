package phonebook;

public class Address {
	// String streetNumber;
	// String aptNumber;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String country;

	public Address() {
	};

	public Address(String streetAddress, String city, String state, String zipCode) {

		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return (streetAddress + ", " + city + ", " + state + ", " + zipCode);
	}
	// getters

	public String getStreetAddress() {
		return this.streetAddress;
	}

	public String getCity() {
		return this.city;
	}

	public String getState() {
		return this.state;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public String getCountry() {
		return this.country;
	}
	// setters

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
