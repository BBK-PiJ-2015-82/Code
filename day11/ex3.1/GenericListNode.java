public class GenericListNode extends Object {
	
	private Object listNode;
	private GenericListNode nextInQueue;
	private GenericListNode prevInQueue;

	public GenericListNode (Object nodeIn) {
		this.listNode = nodeIn;
	}

	public GenericListNode getNext() {
		return this.nextInQueue;
	}

	public GenericListNode getPrev() {
		return this.prevInQueue;
	}

	public void setPrev(GenericListNode prevInQueue) {
		this.prevInQueue = prevInQueue;
	}

	public void setNext(GenericListNode theNextInQueue) {
		this.nextInQueue = theNextInQueue;

	}

	public Object getValue() {
		return this.listNode;
	}
}