public class GenericList {
	
	private GenericListNode head;
	
	public GenericList() {
		super();
		this.head = null;
	}

	public GenericList(GenericListNode head) {
		this.head = head;
	}


	public <T> void add(T obj) {
		//Object obj2 = (Object) obj;

		if (this.head == null) {
			this.head = new GenericListNode(obj);
		} else {
			GenericListNode current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(new GenericListNode(obj));
		}
	}

	public Object get() {
		return head.getNext().getValue();
	}
}