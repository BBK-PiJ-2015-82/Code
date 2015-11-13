public class Hospital {
	
	private Patient head = null;

	public Hospital() {
		this.head = null;
	}

	public void addPatient(Patient newPatient) {
		if (head == null) {
			this.head = newPatient
		} else {
			Patient current = head;
			while (current.getNext != null) {
				current = current.getNext;
			}
			current.setNext(newPatient);
		}

	}

	public void removePatients(String name) {
		//nothing here
		if (head == null) {
			return;

		//first name in list
		} else if (head.getName().equals(name)) {

			start = start.getNext();
		} else {
			Patient current = head;
			while (!current.getNext().getName().equals(name) && current.getNext() != null) {
				current = current.getNext();
			}
			if (current.getNext() == null) {
				current.setNext(current.getNext().getNext());
			}
		}



	}

	public void launch() {
		Patient john = new Patient("John", 22, "Flu");
		this.addPatient(john);
	}

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.launch();


	}





}