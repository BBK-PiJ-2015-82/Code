public class Stack {
	private Element head;

	public void push(Element newElement) {
		if (head == null) {
			head = newElement;
		} else if (head.getNext() == null) {
			Element oldHead = head;
			head = newElement;
			head.setNext(oldHead);
		} else {
			Element current = head;
			head = newElement;
			head.setNext(current);
			while (current.getNext() != null) {
				current.setNext(current.getNext());
				current = current.getNext();
			}
		}
	}

	public void pop() {
		if (head == null) {
			return;
		} else if (head.getNext() == null) {
			head = null;
		} else {
			Element current = head.getNext();
			head = current;
			while (current.getNext() != null) {
				current.setNext(current.getNext());
				current = current.getNext();

			}
		}
	}

	public boolean empty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	public void launch() {
		Element id1 = new Element(1);
		Element id2 = new Element(2);
		Element id3 = new Element(3);
		Element id4 = new Element(4);
		Element id5 = new Element(5);
		Element id6 = new Element(6);
		Element id7 = new Element(7);
		Element id8 = new Element(8);
		Element id9 = new Element(9);

		push(id1);
		push(id2);
		push(id3);
		push(id4);
		push(id5);
		push(id6);
		push(id7);
		push(id8);
		push(id9);		

		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
				pop();


		System.out.println(empty());

	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.launch();
	}



}