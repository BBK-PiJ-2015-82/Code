public class IntegerTreeNode {

	int value; 
	IntegerTreeNode left;
	IntegerTreeNode right;

	//constructor

	public IntegerTreeNode(int aValue) {
		this.value = aValue;
		left = null;
		right = null;
	}

	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);

			} else { 
				right.add(newNumber);
			}
		}	else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else { 
				left.add(newNumber);
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

	public int getMax() {
		IntegerTreeNode current = this;
		IntegerTreeNode highest = this;

		do {
			System.out.println("in loop");
			System.out.println(highest.value);
			if (current.value > highest.value) {
				highest = current;
			}
			if (current.right == null) {
				break;
			}
			current = current.right;
		}	while (right != null);
		return highest.value;
	}

	public int getMin() {
		IntegerTreeNode current = this;
		IntegerTreeNode lowest = this;

		do {
			System.out.println("in loop");
			System.out.println(lowest.value);
			if (current.value < lowest.value) {
				lowest = current;
			}
			if (current.left == null) {
				break;
			}
			current = current.left;
		}	while (left != null);
		return lowest.value;
	}

	public String toString() {
		String returnString = "";
		IntegerTreeNode current = this;
		returnString.concat("[" + current.value);

		while (current.left != null && current.right != null) {
			current = current.left;
			returnString.concat("L [" + current.value);

		}
	}
//starting this recursively
	if (this.left == null && this.right == null) {
		return (this.value + "]");
	} else if (this.left == null) {
		return (this.value.concat(right.toString()));
	} else {
		return this.concat(left.toString)
	}


	returnString.concat(left.toString());
/*

ABANDONED RECURSION METHOD, CAN'T WORK OUT HOW TO COMPARE VALUES BEING RETURN 
	public int getMax() {
		//see if right is empty, if not getmax again
		if (right != null) {
			System.out.println("right not null");
			right.getMax();
		//if right is empty
		} else if (left != null) {
			System.out.println("left not null");
			return left.getMax();
		} else {
			return this.value;
			}
	}
	**/
	public void launch() {
		add(99);
		add(99);
		add(3);
		add(4);
		add(12);
		add(6);
		add(7);
		add(55);
		add(9);
		add(10);
		add(11);
		add(13);
		//System.out.println(this.right.right.value);
		System.out.println(this.getMax());
		System.out.println(this.getMin());


		//System.out.println(this.right.right.right.value);

	}


	public static void main (String[] args) {
		IntegerTreeNode integerTreeNode = new IntegerTreeNode(5);
		integerTreeNode.launch();
	}

}
