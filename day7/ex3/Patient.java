public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private static int numberPatients;


	// CONSTRUCTOR - (no void!)
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		numberPatients++;

	}

	
	public String toString() {
		String returnValue = "";
		returnValue = "" + this.name + ", " + this.age + ", " + this.illness;
		return returnValue;
	} 

	public void init() {

	



		//patientListStart.printPatient();

	}

	public void addPatient(Patient newPatient) {

		if (newPatient.nextPatient == null) {
		// this means this is the last patient in the list
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}

}
	public Patient setCurrentPatient(Patient newPatient) {
		Patient current = newPatient;

		if (current.nextPatient == null) {

			return current; 
		} else {

			return 
		}



	}

	public Patient getNextPatient() {

		if (this.nextPatient == null) {
		// this means this is the last patient in the list
			return this.Patient;
		} else {
			return this.nextPatient.getNextPatient();
		}
	}

/**

	public void printPatient() {

		if (this.nextPatient == null) {
		// this means this is the last patient in the list
			System.out.println(this.name);
		} else {
			System.out.println(this.getNextPatient().name);
		}
	}

	public String printPatients() {
		while (nextPatient != null) {
			System.out.println(this.patient.name);

			} 

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

	public String printPatients() {
		String returnValue;
		if (this.nextPatient == null) {
			return this.name;
		} else {
			returnValue = returnValue.concat(", " + printPatients().nextPatient.name);	
		}	
	}
	// other methods come here...
**/