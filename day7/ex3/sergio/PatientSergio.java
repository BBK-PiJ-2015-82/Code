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