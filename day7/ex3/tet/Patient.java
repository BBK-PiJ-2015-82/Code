public class Patient {
	
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient patientListStart = null;
	private static int numberPatients;


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

	public void init() {

		Patient patient1 = new Patient("Paul", 1, "Cancer");
		Patient patient2 = new Patient("Solomon", 2, "Bad leg");
		Patient patient3 = new Patient("John", 3, "Cold");
		Patient patient4 = new Patient("Danny", 4, "Bad back");
		Patient patient5 = new Patient("Jane", 5, "Cancer");
		Patient patient6 = new Patient("Joseph", 6, "Flu");
		Patient patient7 = new Patient("Saul", 7, "Flu");
		Patient patient8 = new Patient("Sarah", 8, "Gout");
		Patient patient9 = new Patient("Norma", 9, "Dementia");
		Patient patient10 = new Patient("Peter", 10, "Colic");


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

		patientListStart.printPatients();

		patientListStart.removePatient("Jane");


		patientListStart.printPatients();

	}

	public Patient getNextPatient() {

		if (this.nextPatient == null) {
		// this means this is the last patient in the list
			return nextPatient;
		} else {
			return this.nextPatient.getNextPatient();
		}
	}

	public Patient getNext() {
		return nextPatient;
	}

	public String getName() {
		return name;

	}

	public void removePatient(String name) {

		// nothing here
		//if (this.patientListStart == null) {
		//			System.out.println(name);
//
//			return;

		//if is start of list set new start and delete this one

		if (patientListStart.getName().equals(name)) {
			System.out.println("yes");
			patientListStart = patientListStart.getNext();

		// any other in the list

		} else {
			
			Patient current = patientListStart;




			while (current.getNext() != null) {

				if (name.equals(current.getNext().getName())) {

					current.nextPatient = current.getNext().getNext();
					//patientToRemove = null;

				} else {
				
				current = current.getNext();

				}
			}

		//any other
		


		



		}

		// some sort of 'current' identifier system and loop through them
		//set current based on patientToRemove
	//, check equivalence with patientListStart, if it is this one then set something else as start
	// if another in the list reset the nextpatient value to the next one in list 


		// ID if this is the first

		//if (patientToRemove ==  ) {
			
		
		// ID if this is second
		// ID if it's any other






	}
/*
	public void printPatient() {

		if (this.nextPatient == null) {
		// this means this is the last patient in the list
			System.out.println(this.name);
		} else {
			System.out.println(this.getNextPatient().name);
		}
	}
/*
	public String printPatients() {
		while (nextPatient != null) {
			System.out.println(this.patient.name);
			} 
	}
	*/

	
	public void printPatients() {
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
		
		

			//System.out.println(patient1.nextPatient.name);
		//Patient patient = new Patient();

	Patient patient = new Patient("Paul", 34, "Cancer");
	patient.init();		




	}
}