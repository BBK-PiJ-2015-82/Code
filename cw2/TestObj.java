public class TestObj extends Object {
	private int anInt;
	private String aString;

	public TestObj(String constString) {
		this.aString = constString;
		this.anInt = 0;
	}

	public TestObj(int constInt) {
		this.anInt = constInt;
		this.aString = null;
	}

	@Override
	public String toString() {
		if (anInt != 0) {
			return ("" + anInt);
		} else {
			return aString;
		}

	}

}