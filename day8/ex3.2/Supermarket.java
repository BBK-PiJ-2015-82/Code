public class Supermarket {

	private ClusteredQueue queue;

	public Supermarket() {
		queue = new ClusteredQueue();
	}


	public void addPerson(Person thisPerson) {
		queue.insert(thisPerson);
	}


	public void serveperson() {
		Person personToBeServed = queue.retrieve();
		System.out.println(personToBeServed.getName());


		//do something here
	}

	public void launch() {
		System.out.println("hhh");

		Person p1 = new Person(45, "John");
		Person p2 = new Person(24, "Paul");
		Person p3 = new Person(42, "Peter");
		Person p4 = new Person(22, "Norman");
		

		this.addPerson(p1);
		this.addPerson(p2);
		this.addPerson(p3);
		this.addPerson(p4);
		//System.out.println(queue.getHead().getNext().getName());
		//System.out.println(queue.getCounter());


		//serveperson();
		//serveperson();		

		//System.out.println(queue.getCounter());

		Person p5 = new Person(98, "Simon");
		Person p6 = new Person(99, "Roger");
		this.addPerson(p5);
		this.addPerson(p6);


		//System.out.println(queue.getCounter());
		serveperson();
				serveperson();
		serveperson();
				serveperson();


		//System.out.println(queue.getCounter());

		//System.out.println(queue.getCounter());


	}

	public static void main(String[] args) {
			//System.out.println("hhh");

			Supermarket supermarket = new Supermarket();
			//System.out.println("hhh");

			supermarket.launch();


	}

}