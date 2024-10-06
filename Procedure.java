/*
 * Class: CMSC203 22502
 * Instructor: Dr. Kuijt
 * Description: Information for medical procedure on patient
 * Due: 10/06/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alex Kim
*/

public class Procedure {
	private String procedureName,
					procedureDate,
					procedurePractitioner;
	
	private double procedureCharges;
	
	//Constructors 
	Procedure () {
		procedureName = "";
		procedureDate = "";
		procedurePractitioner = "";
		procedureCharges = 0.0;
	}
	
	Procedure (String pName, String pDate) {
		procedureName = pName;
		procedureDate = pDate;
		procedurePractitioner = "";
		procedureCharges = 0.0;
	}
	
	Procedure (String pName, String pDate, String pPractitioner, double pCharges) {
		procedureName = pName;
		procedureDate = pDate;
		procedurePractitioner = pPractitioner;
		procedureCharges = pCharges;
	}
	
	//Setters
	public void setProcedureName (String pName) {
		procedureName = pName;
	}
	
	public void setProcedureDate (String pDate) {
		procedureDate = pDate;
	}
	
	public void setProcedurePractitioner (String pPractitioner) {
		procedurePractitioner = pPractitioner;
	}
	
	public void setProcedureCharges (double pCharges) {
		procedureCharges = pCharges;
	}
	
	//Getters
	public String getProcedureName () {
		return procedureName;
	}
	
	public String getProcedureDate () {
		return procedureDate;
	}
	
	public String getProcedurePractitioner () {
		return procedurePractitioner;
	}
	
	public double getProcedureCharges () {
		return procedureCharges;
	}
	
	//Methods
	@Override
	public String toString () {
		return "\tProcedure: " + getProcedureName() + "\n" +
				"\tProcedure Date: " + getProcedureDate() + "\n" +
				"\tPractitioner: " + getProcedurePractitioner() + "\n" +
				"\tCharges: " + String.format("%.2f", getProcedureCharges()) + "\n";
	}
}
