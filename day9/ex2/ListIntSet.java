public class ListIntSet implements IntSet {
	
	int value;
	ListIntSet next;

	public ListIntSet(int aValue) {
		this.value = aValue;
		next = null;
	}

	public void add(int newNumber) {
		if (newNumber != this.value) {
			if (this.next != null) {
				next.add(newNumber);
			} else {
				ListIntSet theNext = new ListIntSet(newNumber);
			}

		}
	}


	public boolean contains(int n) { 
		boolean doesContain = false;
		if (n == this.value) {
			doesContain = true;
		} else {
			doesContain = next.contains(n);
		}

		return doesContain;


	}



	public boolean containsVerbose(int n) {
		System.out.println("Checking " + n);

		boolean doesContain = false;
		if (n == this.value) {
			doesContain = true;
		} else {
			doesContain = next.containsVerbose(n);
		}

		return doesContain;
	}

	public String toString() {
		String returnString = "" + this.value + ",";
		if (next != null) {
			returnString += " " + next.toString() + ",";
		}
		
		return returnString;
	}

}