public class FunctionalLinkedList extends LinkedList implements FunctionalList {

	public FunctionalLinkedList() {
		super();
	}

	public FunctionalLinkedList(LinkedListObj a) {
		super(a);
	}

	// a 'Copy' constructor

	public FunctionalLinkedList(FunctionalLinkedList copy) {
		if (copy.getHead().getNext() != null || copy.getHead() == null) {
			this.setHead(copy.getHead().getNext());
		} else {
			this.setHead(null);
		}
	}

	public ReturnObject head() {
		//remember - validation in the LinkedList class will manage
		//the error message

		return super.get(0);
	}


    public FunctionalList rest() {
	 	return new FunctionalLinkedList(this);
    }
    	

}