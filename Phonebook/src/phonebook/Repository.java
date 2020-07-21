package phonebook;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Arrays;

public class Repository {
	static Scanner input = new Scanner(System.in);
	static Records[] phonebook = new Records[0];

	public static void addNewRecord(String entry) {
		String[] newEntry = entry.split(",");

		String fullName = newEntry[0];
		String[] name = fullName.split(" ");
		String firstName = name[0];
		String lastName = name[name.length - 1].strip();
		String streetAddress = newEntry[1];
		String city = newEntry[2].strip();
		String state = newEntry[3].strip();
		String zipCode = newEntry[4].strip();
		String phoneNum = newEntry[5].strip();

		// Records newRecord = new Records(fullName, streetAddress, city, state,
		// zipCode, phoneNum);

		Address address = new Address(streetAddress, city, state, zipCode);

		Records newRecord = new Records(fullName, firstName, lastName, address, phoneNum);

		phonebook = expandArray(phonebook, newRecord);

	}

	public static Records[] expandArray(Records[] source, Records newRecord) {
		Records[] temp = new Records[source.length + 1];
		for (int i = 0; i < source.length; i++) {

			temp[i] = source[i];
		}
		temp[temp.length - 1] = newRecord;
		return temp;
	}

	public static Records[] searchByFirstName(String search) {
		Records[] matches = new Records[0];
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i].getFirstName().equals(search)) {
				matches = expandArray(matches, phonebook[i]);
			}
		}
		for (Records record : matches) {
			System.out.println(record);
		}
		return matches;
	}

	public static Records[] searchByLastName(String search) {
		Records[] matches = new Records[0];
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i].getLastName().equals(search)) {
				matches = expandArray(matches, phonebook[i]);
			}
		}
		for (Records record : matches) {
			System.out.println(record);
		}
		return matches;
	}

	public static Records[] searchByFullName(String search) {
		Records[] matches = new Records[0];
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i].getFullName().equals(search)) {
				matches = expandArray(matches, phonebook[i]);
			}
		}
		System.out.println();
		for (Records record : matches) {
			System.out.println(record);
		}
		return matches;
	}

	public static Records[] searchByPhoneNum(String search) {
		Records[] matches = new Records[0];
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i].getPhoneNum().equals(search)) {
				matches = expandArray(matches, phonebook[i]);
			}
		}
		for (Records record : matches) {
			System.out.println(record);
		}
		return matches;
	}

	public static Records[] searchByCity(String search) {
		Records[] matches = new Records[0];
		for (int i = 0; i < phonebook.length; i++) {

			if (phonebook[i].getAddress().getCity().equals(search)) {

				matches = expandArray(matches, phonebook[i]);
			}
		}
		for (Records record : matches) {
			System.out.println(record);
		}
		return matches;
	}

	public static Records[] searchByState(String search) {
		Records[] matches = new Records[0];
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i].getAddress().getState().equals(search)) {
				matches = expandArray(matches, phonebook[i]);
			}
		}
		for (Records record : matches) {
			System.out.println(record);
		}
		return matches;

	}

	public static Records updateFinder(String updateSearch) {

		for (Records record : phonebook) {

			if (record.getPhoneNum().equals(updateSearch)) {
				System.out.println("Record found: " + record);
				return record;
			}
		}
		return null;
	}

	public static void printRecords() {

		for (Records record : phonebook) {
			System.out.println(record);
		}

	}

	public static void upDateArray(String phoneNumber, String newName) {
		for (Records record1 : phonebook) {
			if (record1.getPhoneNum().equals(phoneNumber)) {
				record1.setFullName(newName);
			}
		}
	}

	public static Records[] deleteRecord(String search) {
		Records[] matches = new Records[0];
		for (int i = 0; i < phonebook.length - 1; i++) {
			if (!phonebook[i].getPhoneNum().equals(search)) {
				matches = expandArray(matches, phonebook[i]);
			}
		}
		phonebook = matches;
		for (Records record : phonebook) {
			System.out.println(record);
		}

		return phonebook;
	}

	public static Records[] sortRecords(Records[] toSort) {
		Records[] matches = new Records[0];
		System.out.println("Test");
		for (int i = 0; i < phonebook.length - 1; i++) {
			for (int j = i + 1; j < phonebook.length - 1; j++) {
				if (phonebook[i].getFullName().compareTo(phonebook[j].getFullName()) < 0) {
					matches = expandArray(matches, phonebook[i]);
					System.out.println("test1");
				}
			}
		}
		phonebook = matches;
		for (Records record : phonebook) {
			System.out.println(record);
		}
		return phonebook;
	}

	static void recordSort(Records[] toSort) {
		int n = toSort.length;
		Records temp;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if ((toSort[j - 1].getFullName().compareTo(toSort[j].getFullName()) > 0)) {
					// swap elements
					temp = toSort[j - 1];
					toSort[j - 1] = toSort[j];
					toSort[j] = temp;
				}

			}
		}
		phonebook = toSort;
		for (Records record : phonebook) {
			System.out.println(record);
		}
		
	}
}