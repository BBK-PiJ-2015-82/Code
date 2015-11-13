public class Hospital {
	
	private Patient head = null;

	public Hospital() {
		this.head = null;
	}

	public void launch() {

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
		//this.head.addPatient();

	}

	public void addPatient(Patient newPatient) {

		if (newPatient.nextPatient == null) {
		// this means this is the last patient in the list
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}

	public static void main (String[] args){


		Hospital hopital = new Hospital();
		hopital.launch();







	}






}