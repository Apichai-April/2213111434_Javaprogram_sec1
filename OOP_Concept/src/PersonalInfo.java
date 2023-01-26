public class PersonalInfo {
	private person name;
	private date bDay;
	private int personID;

	// Default Constructor
	public PersonalInfo() {
		name = new person(); // object name call Default Constructor from Person()
		bDay = new date();
		personID = 0;
	}

	// Constructor with parameters
	public PersonalInfo(String first, String last, int month, int day, int year, int ID) {
		// initialize the object name
		name = new person(first, last);

		// initialize the object bDay
		bDay = new date(month, day, year);

		personID = ID;
	}

	// Method to set personal information
	public void setPersonalInfo(String first, String last, int month, int day, int year, int ID) {
		name.setName(first, last);
		bDay.setdata(month, day, year);
		personID = ID;
	}

	// Method to return the personal information
	public String toString() {
		return "Name: " + name.toString() + "\n" 
				+ "Date of birth: " + bDay.toString() 
				+ "\n" + "Personal ID: " + personID;
	}
}
