public class UnfairQueue implements PersonQueue {
	
	private Person head;
	private int counter;

	public UnfairQueue() {
		head = null;
		counter = 0;
	}

	public void insert(Person person) {
		if (head == null) {
			head = person;
		} else if (head.getNext() == null) {
			head.setNext(person);
			head.getNext().setPrev(head);
		} else {
			Person current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(person);
			person.setPrev(current);
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
			//modified to find eldest in queue
		} else {
			 System.out.println("herere");

			 //find the eldest in the queue
			 Person current = head;
			 Person eldestSoFar = head;
			 while (current.getNext() != null) {
			 	if (current.getAge() > eldestSoFar.getAge()) {
			 		eldestSoFar = current;
			 	}
		 		current = current.getNext();

			 }


			 
			 //reset the pointers in the list
			 // NB - THERE IS GOING TO BE AN ISSUE HERE TO RESET ELDEST AT THE
			 //START OR END OF THE LIST, IGNORING FOR BREVITY
			 	eldestSoFar.getPrev().setNext(eldestSoFar.getNext());
			 	eldestSoFar.getNext().setPrev(eldestSoFar.getPrev());


			 	return eldestSoFar;
		}



	}

	public int getCounter() {
		return counter;
	}

	public Person getHead() {
		return this.head;
	}



}