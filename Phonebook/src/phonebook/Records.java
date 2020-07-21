package phonebook;

import java.util.Date;

public class Records {

	// add in a middle name variable and set and get
	private String fullName;

	private String firstName;
	private String lastName;
	private Address address;
	private String phoneNum;
	private Date birthday;

	public Records() {
	}

	// John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
	public Records(String fullName, String firstName, String lastName, Address address, String phoneNum) {
		this.fullName = fullName;
		this.address = address;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return this.address;
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	private String makePretty(String phoneNum) {
		char[] pretty = phoneNum.toCharArray();
		String prettyNum = "(" + pretty[0] + pretty[1] + pretty[2] + ") " + pretty[3] + pretty[4] + pretty[5] + "-"
				+ pretty[6] + pretty[7] + pretty[8] + pretty[9];
		return prettyNum;
		// I have been informed that substring would have been the way to go here, but
		// this insanity brought so much laughter
		// to the rest of the class I'm leaving it here
	}

	@Override
	public String toString() {

		return fullName + ", " + address + ", " + makePretty(phoneNum);
	}
}
