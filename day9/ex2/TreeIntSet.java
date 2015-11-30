public class TreeIntSet implements IntSet {
	
	int value;
	TreeIntSet left;
	TreeIntSet right;

	public TreeIntSet(int aValue) {
		this.value = aValue;
		left = null;
		right = null;
	}

	public void add(int newNumber) {
		if (newNumber != this.value) {
			

			if (newNumber >= this.value) {
				if (right == null) {
					right = new TreeIntSet(newNumber);

				} else { 
					right.add(newNumber);
				}
			}	else {
				if (left == null) {
					left = new TreeIntSet(newNumber);
				} else { 
				//System.out.println("stuck here");
					left.add(newNumber);
				} 


			}
		}
	}


	public boolean contains(int n) { 
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n); 
			}



		}
	}


	public boolean containsVerbose(int n) {
		System.out.println("Checking " + n);

		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n); 
			}



		}
	}

	public String toString() {
		String returnString = "" + this.value + ",";
		if(left != null) {
			returnString += " " + left.toString() + ",";
		}
		//else {returnString += " L" + "[]";}
		if(right != null) {
			returnString += " " + right.toString() + ",";
		}
		//else {returnString += " R[]";}
		returnString += "";
		return returnString;
	}
}