package phonebook;

import java.util.Scanner;

public class Menu {
	static Scanner input = new Scanner(System.in);

	public void mainMenu() {
		//Repository repository = new Repository();
		//Address address = new Address();
		boolean menuRun = true;
		System.out.println("            Welcome to the Phonebook");
		System.out.println("\t______________________________");

		do {

			System.out.println("Please select from the list of options:");
			System.out.println("1) Add a new entry"); // 1
			System.out.println("2) Update an existing entry"); // 2
			System.out.println("3) Remove an entry"); // 3
			System.out.println("4) Search records");// 4
			System.out.println("5) Display Records");// 5
			System.out.println("6) Exit"); //6

			int menu = input.nextInt();
			String clear = input.nextLine();
			Records record = new Records();
			switch (menu) {
			case 1: // addNew works
				System.out.println("Please enter the following information in order:");
				System.out.println("Name, address, and phone number");
				String entry = input.nextLine();
				Repository.addNewRecord(entry);
				System.out.println("Successfully added!");
				break;

			case 2: { // Update works
				System.out.println("Please enter the phone number of the record you would like to update");
				String updateSearch = input.nextLine();
				Repository.updateFinder(updateSearch);
				// searchRecords();
				System.out.println("Which field would you like to update?");
				System.out.println("Press 1 for name, Press 2 for address, Press 3 for phone number");
				int menu2 = input.nextInt();
				clear = input.nextLine();
				switch (menu2) {
				case 1: { // praise zeus it works
					System.out.println("Please enter the new name");
					String newName = input.nextLine();
					Records record2 = Repository.updateFinder(updateSearch);
					if (record2 == null) {
						System.out.println("File not found");
					} else {
						record2.setFullName(newName);
					}
					String[] name = newName.split(" ");
					String firstName = name[0];
					String lastName = name[name.length - 1].strip();
					record2.setFirstName(firstName);
					record2.setLastName(lastName);
					System.out.println("Your record has been updated as shown:");
					System.out.println(record2);

					break;
				}

				case 2: {
					System.out.println("Please enter the new address");
					String updateAddress = input.nextLine();
					Records record2 = Repository.updateFinder(updateSearch);
					if (record2 == null) {
						System.out.println("File not found, please try again");

					} else {
						

						String[] tempAddress = updateAddress.split(",");
						String streetAddress = tempAddress[0];
						String city = tempAddress[1].strip();
						String state = tempAddress[2].strip();
						String zipCode = tempAddress[3].strip();
						record2.getAddress().setStreetAddress(streetAddress);
						record2.getAddress().setCity(city);
						record2.getAddress().setState(state);
						record2.getAddress().setZipCode(zipCode);
						System.out.println("Your record has been updated as shown:");
						System.out.println(record2);
						break;
					}
				}

				case 3: // works
					System.out.println("Please enter the new phone number: ");
					String newPhone = input.nextLine();
					Records record2 = Repository.updateFinder(updateSearch);
					if (record2 == null) {
						System.out.println("Failed to update the record");
					} else {
						record2.setPhoneNum(newPhone);
					}
					System.out.println("Your record has been updated as shown:");
					System.out.println(record2);
					break;
				default:
					System.out.println("Invalid Selection Please Try Again");
				}
				break;

			}

			case 3: {//death star is fully operational
				System.out.println("Please enter the phone number of the record you would like to delete: ");
				String search = input.nextLine();
				Repository.deleteRecord(search);
				break;
			}

			case 4: //searches, all systems go
				System.out.println("What field would you like to search by?");
				System.out.println("First Name(1) Last Name(2), Full Name(3) PhoneNumber(4), City(5), State(6)");
				int menu3 = input.nextInt();
				clear = input.nextLine();
				switch (menu3) {
				case 1: {
					System.out.println("Please enter the first name you're looking for:");
					String search = input.nextLine();
					Repository.searchByFirstName(search);

					break;
				}
				case 2: {
					System.out.println("Please enter the last name you'd like to find: ");
					String search = input.nextLine();
					Repository.searchByLastName(search);
					break;
				}
				case 3: {
					System.out.println("Please enter the full name you'd like to find");
					String search = input.nextLine();
					Repository.searchByFullName(search);
					break;
				}
				case 4: {
					System.out.println("Please enter the phone number to be searched");
					String search = input.nextLine();
					Repository.searchByPhoneNum(search);
					break;
				}
				case 5: { 
					System.out.println("Please enter the city to be searched");
					String search = input.nextLine();
					Repository.searchByCity(search);
					break;
				}
				case 6: {
					System.out.println("Please enter the state you would like to search for");
					String search = input.nextLine();
					Repository.searchByState(search);
					break;
				}
				default:
					System.out.println("Invalid Selection Please Try Again");
				}
				break;

			case 5: {
				Repository.recordSort(Repository.phonebook);
			}
				break;
			case 6:{ 
				System.out.println("Have a great day");
				menuRun = false;
				break;
			}
			default:
				System.out.println("Invalid selection please try again");
			}

		} while (menuRun == true);

	}

}
