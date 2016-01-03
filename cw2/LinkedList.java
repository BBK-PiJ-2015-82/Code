public class LinkedList implements List {
	
	private LinkedListObj head;

	public LinkedList() {
		head = null;
	}

	public LinkedList(LinkedListObj headIn) {
		head = headIn;
	}

	public LinkedListObj getHead() {
		return head;
	}

	public void setHead(LinkedListObj newHead) {
		this.head = newHead;
	}

	@Override
	public boolean isEmpty() {
		if (head == null ) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int size() {
		if (head == null) {
			return 0;
		} else {
			LinkedListObj current = head;
			int counter = 1;
			while(current.getNext() != null) {
				counter++;

				current = current.getNext();
			}
			return counter;
		}
	}

	@Override
	public ReturnObjectImpl add(Object item) {
		ReturnObjectImpl returnObj = null;
		if (item == null) {
			returnObj = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			LinkedListObj newObj = new LinkedListObj(item);
			if (this.head == null) {
				head = newObj;
			} else {
				LinkedListObj current = head;
				while (current.getNext() != null) {
					current = current.getNext();
				}
				current.setNext(item);
				current.getNext().setPrev(current);
			}
		}
		return returnObj;
	} 

	@Override
	public ReturnObject get(int index) {
		ReturnObjectImpl returnObj = null;
		if ((index < 0 || index > (size() - 1)) && !isEmpty()) {
			returnObj = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (isEmpty()) {
			returnObj = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			LinkedListObj current = head;
			int counter = 0;
			while (counter != index) {
				current = current.getNext();
				counter++;
			}
			returnObj = new ReturnObjectImpl(current.getObj());
		}
		return returnObj;
	}

	@Override
	public ReturnObject remove(int index) {
		ReturnObjectImpl returnObj = null;
		LinkedListObj removeObj = null;
		if ((index < 0 || index > (size() - 1)) && !isEmpty()) {
			returnObj = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (isEmpty()) {
			returnObj = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index == 0) {

			//check if index is head
			
			// if there is only a head in the data structure
			if (head.getNext() == null) {
				returnObj = new ReturnObjectImpl(head.getObj());
				head = null;
			} else {
				// if there is more than head

				removeObj = head;
				head = removeObj.getNext();
				returnObj = new ReturnObjectImpl(removeObj.getObj());
			} 

			//if index is last object in list
		} else {

			//for data structure of greater than 2 objects
			LinkedListObj current = head;
			int counter = 0;

			while (counter != index) {
				current = current.getNext();
				counter++;
			}
			returnObj = new ReturnObjectImpl(current.getObj());
			if (index != size() - 1) {
				current.getPrev().setNext(current.getNext());
				current.getNext().setPrev(current.getPrev());
			} else {
				current.getPrev().killNext();
			}
		}
		return returnObj;
	}

	public ReturnObject add(int index, Object item) {
		ReturnObjectImpl returnObj = null;
		
		//error validation

		if (item == null) {
			returnObj = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			if ((index < 0 || index > (size() - 1)) && !isEmpty()) {
				returnObj = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			} else if (isEmpty()) {
				returnObj = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			} else {

		// function

				LinkedListObj newObj = new LinkedListObj(item);

				if (index == 0 && isEmpty()) {
					head = newObj;
				} else if (index == 0 && !isEmpty()) {
					LinkedListObj oldHead = head;
					head = newObj;
					head.setNext(oldHead);
					oldHead.setPrev(head);
				}	else {
					LinkedListObj current = head;
					int counter = 0;
					while (counter != index) {
						current = current.getNext();
						counter++;
					}

					//current is now the index

					newObj.setNext(current);
					current.getPrev().setNext(newObj);
					newObj.setPrev(current.getPrev());
					current.setPrev(newObj);
				}
			}
		}
		return returnObj;
	}

	// ADDITIONAL METHOD

	public LinkedListObj returnListWithoutHead() {
		if (isEmpty() || size() == 1) {
			return null;
		} else {
			LinkedList copy = this;
			copy.remove(0);
			return copy.head;
		}
	}

	// HERE FOR TESTING
	public void toStringFull() {
		for (int i = 0; i < size(); i++) {
			System.out.println(this.get(i).getReturnValue().toString());
		}
	}
}