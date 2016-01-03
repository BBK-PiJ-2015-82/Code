public class LinkedListObj extends Object {
	
	private Object thisObj;
	private LinkedListObj nextObj;
	private LinkedListObj prevObj;

	public LinkedListObj(Object obj) {
		this.thisObj = obj;
	}

	public LinkedListObj getNext() {
		return nextObj;
	}

	public LinkedListObj getPrev() {
		return prevObj;
	}

	public void setNext(LinkedListObj node) {
		nextObj = node;
	}

	public void setNext(Object obj) {
		nextObj = new LinkedListObj(obj);
	}

	public void killNext() {
		nextObj = null;
	}

	public void setPrev(LinkedListObj obj) {
		prevObj = obj;
	}

	public Object getObj() {
		return thisObj;
	}

	public LinkedListObj getLinkedListObj() {
		return this;
	}
}