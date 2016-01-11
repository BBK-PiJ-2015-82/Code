public class Supermarket {

	private SupermarketQueue queue;
	private ExpressQueue fastqueue;

	public Supermarket() {
		queue = new SupermarketQueue();
		fastqueue = new ExpressQueue();
	}


	public void addPerson(Person thisPerson) {
		queue.insert(thisPerson);
		fastqueue.insert(thisPerson);
	}


	public void serveperson() {
		Person personToBeServed = queue.retrieve();
		//do something here
	}

	public void launch() {
		System.out.println("hhh");

		Person p1 = new Person(22, "John");
		Person p2 = new Person(24, "Simon");
		Person p3 = new Person(26, "Peter");
		Person p4 = new Person(22, "John");
		

		this.addPerson(p1);
		this.addPerson(p2);
		this.addPerson(p3);
		this.addPerson(p4);
		System.out.println(queue.getCounter());


		serveperson();
		serveperson();		

		System.out.println(queue.getCounter());

		Person p5 = new Person(24, "Simon");
		Person p6 = new Person(26, "Peter");
		this.addPerson(p5);
		this.addPerson(p6);


		System.out.println(queue.getCounter());

		serveperson();
		serveperson();
		System.out.println(queue.getCounter());


	}

	public static void main(String[] args) {
			//System.out.println("hhh");

			Supermarket supermarket = new Supermarket();
			//System.out.println("hhh");

			supermarket.launch();


	}

}