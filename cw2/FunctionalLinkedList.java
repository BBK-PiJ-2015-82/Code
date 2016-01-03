public class FunctionalLinkedList extends LinkedList implements FunctionalList {

	public FunctionalLinkedList() {
		super();
	}

	public FunctionalLinkedList(LinkedListObj a) {
		super(a);
	}

	public FunctionalLinkedList(FunctionalLinkedList copy) {
		if (copy.getHead().getNext() != null || copy.getHead() == null) {
			this.setHead(copy.getHead().getNext());
		} else {
			this.setHead(null);
		}
	}

	@Override
	public ReturnObject head() {
		//remember - validation in the LinkedList class will manage
		//the error message

		return super.get(0);
	}

	@Override
    public FunctionalList rest() {
	 	return new FunctionalLinkedList(this);
    }
}