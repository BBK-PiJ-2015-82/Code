public class Element {
	private int id;
	private Element nextId;

	public Element(int newId) {
		this.id = newId;
	}

	public Element getNext() {
		return this.nextId;
	}

	public int getId(Element current) {
		return this.id;

	}

	public void setNext(Element current) {

		this.nextId = current;
	}

	





}