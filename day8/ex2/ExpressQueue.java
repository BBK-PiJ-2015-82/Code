public class ExpressQueue implements PersonQueue {
	
	private Person head;
	private int counter;

	public ExpressQueue() {
		head = null;
		counter = null;
	}

	public Person retrieve() {
		return ;

	}

	public void insert() {
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


}