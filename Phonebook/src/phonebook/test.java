package phonebook;

import java.util.Scanner;

public class test {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		addNewRecord("Lucy Catherine Johnson");

	}
	public static void addNewRecord(String entry) {
				String[] newEntry = entry.split(",");
		String fullName = newEntry[0];
		String[] name = fullName.split(" ");
		String firstName = name[0];
		String lastName = name[name.length-1];
		System.out.println(firstName+ " "+lastName);
	}

}
