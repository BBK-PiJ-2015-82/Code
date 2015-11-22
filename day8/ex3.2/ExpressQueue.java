public class ExpressQueue implements PersonQueue {
	
	private Person headdd;
	private int counter;

	public ExpressQueue() {
		headdd = null;
		counter = 0;
	}

	public void insert(Person person) {
		if (headdd == null) {
			headdd = person;
		} else if (headdd.getNext() == null) {
			headdd.setNext(person);
		} else {
			Person current = headdd;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(person);
		}
		counter++;

	}

	public Person retrieve() {

		if (headdd == null) {
			return null;
		} else if (headdd.getNext() == null) {
			Person current = headdd;
			headdd = null;
			counter--;
			return current;
			
		} else {
			 Person current = headdd;
			 headdd = headdd.getNext();
			counter--;
			 return current;
		}



	}

	public int getCounter() {
		return counter;
	}



}