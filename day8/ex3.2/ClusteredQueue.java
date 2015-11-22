public class ClusteredQueue implements PersonQueue {
	
	private SupermarketQueue queue65;
	private SupermarketQueue queue18;
	private SupermarketQueue queue0;
	//private int counter;

	public ClusteredQueue() {
		queue65 = new SupermarketQueue();
		queue18 = new SupermarketQueue();
		queue0 = new SupermarketQueue();
	}

	public void insert(Person person) {
		
		if (person.getAge() >= 65) {
			queue65.insert(person);
		} else if (person.getAge() > 18) {
			queue18.insert(person);
		} else {
			queue0.insert(person);
		}
	}

/*
		if (person.getAge() >= 65) {
			insertAgeLogic(person, queue65);
		} else if (person.getAge() > 18) {
			insertAgeLogic(person, queue18);
		} else {
			insertAgeLogic(person, queue0);
		}

	}

	public void insertAgeLogic(Person person, SupermarketQueue thisQueue) {
		if (thisQueue.getHead() == null) {
			thisQueue.setHead(person);
		} else if (thisQueue.getHead().getNext() == null) {
			thisQueue.getHead().setNext(person);
			thisQueue.getHead().getNext().setPrev(thisQueue.getHead());
		} else {
			Person current = thisQueue.getHead();
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(person);
			person.setPrev(current);
		}
		thisQueue.setCounter();
	}
**/
	public Person retrieve() {

		if (this.queue65.getHead() != null) {
			return queue65.retrieve();
		} else if (this.queue18.getHead() != null) {
			return queue18.retrieve();
		} else {
			return queue0.retrieve();
		}
	}

/*	
		if (this.queue65.getHead() != null) {
			return retrieveAgeLogic(queue65);
		} else if (this.queue18.getHead() != null) {
			return retrieveAgeLogic(queue18);
		} else {
			return retrieveAgeLogic(queue0);
		}
	}

	public Person retrieveAgeLogic(SupermarketQueue thisQueue) {

		if (thisQueue.getHead() == null) {
			return null;
		} else if (thisQueue.getHead().getNext() == null) {
			Person current = thisQueue.getHead();
			thisQueue.setHead(null);
			thisQueue.countDown();
			return current;
			//modified to find eldest in queue
		} else {
			// System.out.println("herere");

			 //find the eldest in the queue
			 Person current = thisQueue.getHead();
			 Person eldestSoFar = thisQueue.getHead();
			 while (current.getNext() != null) {
			 	if (current.getAge() > eldestSoFar.getAge()) {
			 		eldestSoFar = current;
			 	}
		 		current = current.getNext();

			 }


			 
			 //reset the pointers in the list
			 // NB - THERE IS GOING TO BE AN ISSUE HERE TO RESET ELDEST AT THE
			 //START OR END OF THE LIST, IGNORING FOR BREVITY
		 	if (eldestSoFar.getPrev() != null) {
		 		eldestSoFar.getPrev().setNext(eldestSoFar.getNext());
		 	}
		 	if (eldestSoFar.getNext() != null) {
		 	eldestSoFar.getNext().setPrev(eldestSoFar.getPrev());
		 	}

		 	return eldestSoFar;
		}



	}


**/



}