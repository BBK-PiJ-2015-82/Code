public class Queue {
	
	private Request head;
	private static int numberOfRequests;

	public void insert(Request newRequest) {
		if (head == null) {
			head = newRequest;
		} else if (head.getNext() == null) {
			head.setNext(newRequest);
		} else {
			Request current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newRequest);
		}
		numberOfRequests++;

	}

	public void retrieve() {
		//assuming we aren't calling this method if there are no requests
		Request current = head;
		if (current.getNext() == null) {
			head.setNext(null);
		} else {
			while (current.getNext() == null) {
				current = current.getNext();

			}
			System.out.println("Retrieving request " + current.getNext().getId() + "...");
			current.setNext(null);
		}

		numberOfRequests--;


	}

	public void size() {
		System.out.println("There are " + numberOfRequests + " requests in the queue");
	}

	public void launch() {
		Request req1 = new Request(1);
		Request req2 = new Request(2);
		Request req3 = new Request(3);
		Request req4 = new Request(4);
		Request req5 = new Request(5);
		Request req6 = new Request(6);
		Request req7 = new Request(7);
		Request req8 = new Request(8);
		Request req9 = new Request(9);
		Request req10 = new Request(10);
		Request req11 = new Request(11);

		insert(req1);
		insert(req2);
		insert(req3);
		insert(req4);
		insert(req5);
		insert(req6);
		insert(req7);
		insert(req8);
		insert(req9);
		insert(req10);
		insert(req11);

		retrieve();


			size();


	}

	public static void main (String[] args) {
		Queue queue = new Queue();
		queue.launch();

	}



}