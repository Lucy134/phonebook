package phonebook;

public class PhonebookMain {
	public static void main(String[] args) {
		Menu menu = new Menu();
		Repository.addNewRecord("John Michael West Doe, 1574 Pole ave, St. Peters, MO, 63333, 5628592375");
		Repository.addNewRecord("John Doe,114 Market St,St Louis, MO, 63403, 6366435698");
		Repository.addNewRecord("John E Doe,324 Main St,St Charles, MO, 63303, 8475390126");
		

		menu.mainMenu();

	}

}
