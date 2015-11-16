public class Hospital {
	
	private Patient head = null;

	public Hospital() {
		this.head = null;
	}

	public void addPatient(Patient newPatient) {
		if (head == null) {
			head = newPatient;
		} else {
			Patient current = head;
			if (current.getNext() == null) {
				current.setNext(newPatient);
				newPatient.setNext(head);
			} else {
				while (!current.getNext().getName().equals(head.getName())) {
					current = current.getNext();
				}
				current.setNext(newPatient);
				newPatient.setNext(head);
				}
			}
	}

	public void removePatients(String name) {
		//nothing here
		if (head == null) {
			return;

		//first name in list
		} else if (head.getName().equals(name)) {

			head = head.getNext();
		} else {
			Patient current = head;

			while (!current.getNext().getName().equals(name) && current.getNext() != null) {
				System.out.println("yes");
				current = current.getNext();
			}

			if (current.getNext().getNext().getName().equals(head.getName())) {
				
				current.setNext(current.getNext().getNext());
				//current.getNext().setNext(null);

			}

			current.setNext(current.getNext().getNext());

			
			//	if (current.getNext() == null) {
			//		current.setNext(current.getNext().getNext());
			//	}
			
		}



	}


	// a method to calculate list length

	public void listLengthIteration() {

		int counter = 0;

		if (this.head != null) {

			Patient current = this.head;
			counter = 1;
			
			do {

				counter++;
				current = current.getNext();

			} while (current.getNext() != null);

		}

		System.out.println(counter);

	}
/*
	public void listLengthRecursionInit() {
		System.out.println(this.listLengthRecursionAction(1, this.head));

	}

	public Patient listLengthRecursionAction(int counter, Patient current) {
		if (current.getNext() == null) {
			return 0;
		}
		//counter++;
		return current.listLengthRecursionAction(1, current.getNext());

		//HERE


	}
	*/

	public void launch() {
		Patient john = new Patient("John", 22, "Flu");

		Patient patient1 = new Patient("Paul", 1, "Cancer");
		Patient patient2 = new Patient("Solomon", 2, "Bad leg");
		Patient patient3 = new Patient("Lulu", 3, "Cold");
		Patient patient4 = new Patient("Danny", 4, "Bad back");
		Patient patient5 = new Patient("Jane", 5, "Cancer");
		Patient patient6 = new Patient("Joseph", 6, "Flu");
		Patient patient7 = new Patient("Saul", 7, "Flu");
		Patient patient8 = new Patient("Sarah", 8, "Gout");
		Patient patient9 = new Patient("Norma", 9, "Dementia");
		Patient patient10 = new Patient("Peter", 10, "Colic");

		this.addPatient(john);
		this.addPatient(patient1);
		this.addPatient(patient2);
		this.addPatient(patient7);
		this.addPatient(patient3);
		this.addPatient(patient4);
		this.addPatient(patient8);

		this.removePatients("Danny");

		head.printPatientsIterative();
		//this.removePatients("Solomon");

		//this.removePatients("John");
		//System.out.println(this.head.getName());		
		//this.listLengthIteration();
		//this.listLengthRecursionInit();




	}

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.launch();


	}





}