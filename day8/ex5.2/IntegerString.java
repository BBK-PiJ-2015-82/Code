public class IntegerString implements SimpleMap {

	private String[][] value;

	public IntegerString(int sizeX, int sizeY) {
		this.value = new String[sizeX][sizeY];
	}

	public void put(int key, String name) {
		if (this.value[key][0] == null) {
			this.value[key][0] = name;
		}
		else {
			return;
		}

	}

	public String get(int key) {
		String returnValue = value[key][0];
		return returnValue;
	}

	public void remove(int key) {
		value[key][0] = null;
	}

	public boolean isEmpty() {
		for (int i = 0; i<=value.length - 1 ; i++) {
			if (this.value[i][0] != null) {
				return false;
			}
		}
		return true;
	}

	public void launch() {
		this.put(555, "tttt");
		this.put(565, "sdfsdfsdfsfd");
		this.put(565, "sdfwerewwerwr");

		System.out.println(get(565));
		System.out.println(isEmpty());


	}

	public static void main (String[] args) {
		IntegerString integerString = new IntegerString(1000, 1);
		integerString.launch();
	}
}