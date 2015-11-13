public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;

	public Patient(String name, int age, String illness){

		this.name = name;
		this.age = age;
		this.illness = illness;
	}

	public Patient getNext() {
		return nextPatient;
	}

	public void setNext(Patient next) {
		this.nextPatient = next;


	}

	public String getName() {
		return name;
	}

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
	
	public String toString() {
		String returnValue = "";
		returnValue = "" + this.name + ", " + this.age + ", " + this.illness;
		return returnValue;
	} 
}