public class Request {
	
	private int id;
	private Request nextId;

	public Request(int insertId) {
		this.id = insertId;

	}

	public int getId() {
		return this.id;
	}

	public Request getNext() {
		return this.nextId;
	}

	public void setNext(Request thisId) {
		this.nextId = thisId;

	}

	










}