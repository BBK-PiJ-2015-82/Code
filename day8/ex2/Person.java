public class Person {
	
	private int age;
	private String name;
	private Person nextInQueue;

	public Person(int thisage, String thisname) {
		this.age = thisage;
		this.name = thisname;
	}

	public String getName() {
		return this.name;
	}

	public Person getNext() {
		return this.nextInQueue;
	}

	public void setNext(Person person) {
		this.nextInQueue = person;

	}

	

}