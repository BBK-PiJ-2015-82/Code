public class Person<T> {
	
	private int age;
	private String name;
	private T nextInQueue;
	private T prevInQueue;

	public Person(int thisage, String thisname) {
		this.age = thisage;
		this.name = thisname;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int thisAge) {
		this.age = thisAge;
	}

	public Person getNext() {
		return this.nextInQueue;
	}

	public Person getPrev() {
		return this.prevInQueue;
	}

	public void setPrev(Person thisPerson) {
		this.prevInQueue = thisPerson;
	}

	public void setNext(Person person) {
		this.nextInQueue = person;

	}

	

}