public class SupermarketQueue implements PersonQueue {
	
	private Person head;
	private int counter;

	public SupermarketQueue() {
		head = null;
		counter = 0;
	}

	public void insert(Person person) {
		if (head == null) {
			head = person;
		} else if (head.getNext() == null) {
			head.setNext(person);
		} else {
			Person current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(person);
		}
		counter++;

	}

	public Person retrieve() {

		if (head == null) {
			return null;
		} else if (head.getNext() == null) {
			Person current = head;
			head = null;
			counter--;
			return current;
			
		} else {
			 Person current = head;
			 head = head.getNext();
			counter--;
			 return current;
		}



	}

	public int getCounter() {
		return counter;
	}

	public Person getHead() {
		if (this.head == null) {
			return null;
		} else {
			return this.head;
		}
	}

	public void setHead(Person person) {
		this.head = person;
	}

	public void setCounter() {
		this.counter++;
	}

	public void countDown() {
		this.counter--;
	}

}