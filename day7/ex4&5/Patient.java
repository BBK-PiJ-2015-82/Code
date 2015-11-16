public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient prevPatient;

	public Patient(String name, int age, String illness){

		this.name = name;
		this.age = age;
		this.illness = illness;
	}

	public Patient getNext() {
		return this.nextPatient;
	}

	public void setNext(Patient next) {
		this.nextPatient = next;

	}

	public Patient getPrev() {
		return this.prevPatient;

	}

	public void setPrev(Patient prev) {
		this.prevPatient = prev;

	}

	public String getName() {
		return name;
	}

	public void printPatients() {
		Patient current = this;
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

	public void printPatientsIterative() {
		Patient current = this;
		
		// set to print upward
		while(current.nextPatient != null) {

			System.out.println(current.toString());
			current = current.nextPatient;
		}
		//set to print downward
		do {
			System.out.println(current.toString());
			current = current.prevPatient;
		} while(current.prevPatient != null);
		if (current.prevPatient == null) {
			System.out.println(current.toString());
		}


	}

		
	
	
	public String toString() {
		String returnValue = "";
		returnValue = "" + this.name + ", " + this.age + ", " + this.illness;
		return returnValue;
	} 
}