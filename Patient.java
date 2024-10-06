/*
 * Class: CMSC203 22502
 * Instructor: Dr. Kuijt
 * Description: Information about the patient.
 * Due: 10/06/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alex Kim
*/

public class Patient {
	private String firstName,
					middleName,
					lastName,
					streetAddress,
					city,
					state,
					zipCode,
					phoneNumber,
					emergencyName,
					emergencyPhone;
	
	//Constructors
	Patient() {
		firstName = "";
		middleName = "";
		lastName = "";
		streetAddress = "";
		city = "";
		state = "";
		zipCode = "";
		phoneNumber = "";
		emergencyName = "";
		emergencyPhone = "";
	}
	
	Patient(String fName, String mName, String lName) {
		firstName = fName;
		middleName = mName;
		lastName = lName;
		streetAddress = "";
		city = "";
		state = "";
		zipCode = "";
		phoneNumber = "";
		emergencyName = "";
		emergencyPhone = "";
	}
	
	Patient(String fName, String mName, String lName,
			String sAddress, String cityName, String stateName, 
			String zipName, String phoneName, String emName, String emPhone) {
		firstName = fName;
		middleName = mName;
		lastName = lName;
		streetAddress = sAddress;
		city = cityName;
		state = stateName;
		zipCode = zipName;
		phoneNumber = phoneName;
		emergencyName = emName;
		emergencyPhone = emPhone;
	}
	
	//Setters
	public void setFirstName (String fName) {
		firstName = fName;
	}
	
	public void setMiddleName (String mName) {
		middleName = mName;
	}
	
	public void setLastName (String lName) {
		lastName = lName;
	}
	
	public void setStreetAddress (String sAddress) {
		streetAddress = sAddress;
	}
	
	public void setCity (String cityName) {
		city = cityName;
	}
	
	public void setState (String stateName) {
		state = stateName;
	}
	
	public void setZipCode (String zipName) {
		zipCode = zipName;
	}
	
	public void setPhoneNumber (String phoneName) {
		phoneNumber = phoneName;
	}
	
	public void setEmergencyName (String emName) {
		emergencyName = emName;
	}
	
	public void setEmergencyPhone (String emPhone) {
		emergencyPhone = emPhone;
	}
	
	//Getters
	public String getFirstName () {
		return firstName;
	}
	
	public String getMiddleName () {
		return middleName;
	}
	
	public String getLastName () {
		return lastName;
	}
	
	public String getStreetAddress () {
		return streetAddress;
	}
	
	public String getCity () {
		return city;
	}
	
	public String getState () {
		return state;
	}
	
	public String getZipCode () {
		return zipCode;
	}
	
	public String getPhoneNumber () {
		return phoneNumber;
	}
	
	public String getEmergencyName () {
		return emergencyName;
	}
	
	public String getEmergencyPhone () {
		return emergencyPhone;
	}
	
	//Methods
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	
	public String buildAddress() {
		return streetAddress + " " + city + " " + state + " " + zipCode;
	}
	
	public String buildEmergencyContact() {
		return emergencyName + " " + emergencyPhone;
	}
	
	@Override
	public String toString() {
		 return "Patient Information:\n" +
		         "  Name: " + buildFullName() + "\n" +
				 "  Address: " + buildAddress() + "\n" +
		         "  Emergency Contact: " + buildEmergencyContact() + "\n";
	}
}
