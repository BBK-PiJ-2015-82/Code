public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private int numberPatients;


	// CONSTRUCTOR - (no void!)
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		numberPatients++;

	}

	public void addPatient(Patient newPatient) {

		if (this.nextPatient == null) {
		// this means this is the last patient in the list
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}

	public String toString() {
		String returnValue = "";
		returnValue = "" + this.name + ", " + this.age + ", " + this.illness;
		return returnValue;
	} 


	public String printPatients() {

		if (this == null) {
			System.out.println("There is nothing to print");
		} 
		else
		{
			if (this.nextPatient == null) {
				System.out.println(this.toString());
			} else {
				System.out.println(this.toString());
				this.nextPatient.printPatients();	
			}	

		}

	} 	

	/*public String printPatients() {
		String returnValue;
		if (this.nextPatient == null) {
			return this.name;
		} else {
			returnValue = returnValue.concat(", " + printPatients().nextPatient.name);	
		}	
	} */
	// other methods come here...

 	public static void main (String[] args) {
		Patient patient1 = new Patient("Paul", 34, "Cancer");
		Patient patient2 = new Patient("Solomon", 24, "Bad leg");
		Patient patient3 = new Patient("John", 11, "Cold");
		Patient patient4 = new Patient("Danny", 33, "Bad back");
		Patient patient5 = new Patient("Jane", 22, "Cancer");
		Patient patient6 = new Patient("Joseph", 66, "Flu");
		Patient patient7 = new Patient("Saul", 34, "Flu");
		Patient patient8 = new Patient("Sarah", 25, "Gout");
		Patient patient9 = new Patient("Norma", 85, "Dementia");
		Patient patient10 = new Patient("Peter", 1, "Colic");

		Patient patientListStart = null;

		patientListStart = patient1;
		patientListStart.addPatient(patient2);
		patientListStart.addPatient(patient3);
		patientListStart.addPatient(patient4);
		patientListStart.addPatient(patient5);
		patientListStart.addPatient(patient6);
		patientListStart.addPatient(patient7);
		patientListStart.addPatient(patient8);
		patientListStart.addPatient(patient9);
		patientListStart.addPatient(patient10);

		

			//System.out.println(patient1.nextPatient.name);
		System.out.println(printPatients());
		




	}
}