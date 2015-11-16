public class TheInts {
	
	//private String ref;
	private int anInt;
	private TheInts nextId;	

	public TheInts(int newId) {
		//this.ref = newref;
		this.anInt = newId;
		//this.nextId = theNext;
	}

	public int getId() {
		return this.anInt;
	}

	public TheInts getNext() {
		return this.nextId;
	}

	public void setNext(TheInts thisId) {
		this.nextId = thisId;

	}

}