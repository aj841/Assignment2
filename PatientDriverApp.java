/*
 * Class: CMSC203 22502
 * Instructor: Dr. Kuijt
 * Description: Driver class manages patient and procedure objects
 * Due: 10/06/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alex Kim
*/

public class PatientDriverApp {

	public static void main(String[] args) {
		Patient myPatient = new Patient("Thomas", "J.", "Aquinas");
		myPatient.setStreetAddress("123 Happy Street");
		myPatient.setCity("HappyLand");
		myPatient.setState("MD");
		myPatient.setZipCode("12345");
		myPatient.setPhoneNumber("240-123-1234");
		myPatient.setEmergencyName("Eric Nguyen");
		myPatient.setEmergencyPhone("240-321-4321");
		
		Procedure myProc1 = new Procedure();
		myProc1.setProcedureName("Lobotomy");
		myProc1.setProcedureDate("7/20/19");
		myProc1.setProcedurePractitioner("Dr. Skibidi");
		myProc1.setProcedureCharges(3245.13);
		
		Procedure myProc2 = new Procedure("X-Ray", "7/20/19");
		myProc2.setProcedurePractitioner("Dr. Jamison");
		myProc2.setProcedureCharges(5500.32);
		
		Procedure myProc3 = new Procedure("Physical Exam", "7/20/19", "Dr. Irvine", 3250.0);
		
		displayPatient(myPatient);
		displayProcedure(myProc1);
		displayProcedure(myProc2);
		displayProcedure(myProc3);
		
		System.out.println("Total Charges: " + calculateTotalCharges(myProc1, myProc2, myProc3) + "\n");
		
		System.out.println("Student Name: Alex J. Kim \n" +
							"MC#: M21143718\n" +
							"Due Date: 10/6/2024");
	}
	
	public static void displayPatient(Patient newPatient) {
		System.out.println(newPatient.toString());
	}
	
	public static void displayProcedure(Procedure newProcedure) {
		System.out.println(newProcedure.toString());
	}
	
	public static double calculateTotalCharges(Procedure newProc1, Procedure newProc2, Procedure newProc3) {
		return newProc1.getProcedureCharges() + newProc2.getProcedureCharges() + newProc3.getProcedureCharges();
	}
}
