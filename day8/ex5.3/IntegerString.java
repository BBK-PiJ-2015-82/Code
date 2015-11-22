public class IntegerString implements SimpleMap {

	private String[][] value;
	private int lengthY;

	public IntegerString(int sizeX, int sizeY) {
		this.value = new String[sizeX][sizeY];
		this.lengthY = sizeY;
	}

	public void put(int key, String name) {
		if (this.value[key][0] == null) {
			this.value[key][0] = name;
		}
		else {			
			int i = 0;
			do {
				i++;
			} while (value[key][i] != null);
			value[key][i] = name;
			
		}

	}
	
	//modify to return array
	public String[] get(int key) {
		if (value[key][0] == null) {
			return null;
		} else {
			String[] returnValue = new String[lengthY];
			for (int i = 0; i < lengthY; i++ ) {
				returnValue[i] = value[key][i];
			}

			return returnValue;

			
		}

	}

	public void remove(int key, String stringname) {
		for (int i = 0; i < lengthY ; i++ ) {
			if (value[key][i].equals(stringname)) {
				value[key][i] = null;
				for (int j = i; j < lengthY - 1; j++) {
					value[key][j] = value[key][j + 1];
				}
				break;
			}
		}

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

		String[] printArray = get(565);
		System.out.println(printArray[0]);
		System.out.println(isEmpty());


	}

	public static void main (String[] args) {
		IntegerString integerString = new IntegerString(1000, 10);
		integerString.launch();
	}
}