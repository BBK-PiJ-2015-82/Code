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
		//see if right is empty, if not getmax again
		if (right != null) {
			System.out.println("right not null");
			return right.getMax();
		//if right is empty
		} else if (left != null) {
			System.out.println("left not null");
			return left.getMax();
		} else {
			return this.value;
			}
	}

	public void launch() {
		add(9);
		add(44);
		add(77);
		add(83);
		add(11);
		add(1);
		add(234);
		add(5);
		add(789);
		add(776);
		add(8);
		add(99);
		System.out.println(getMax());

		//System.out.println(this.right.right.right.value);

	}


	public static void main (String[] args) {
		IntegerTreeNode integerTreeNode = new IntegerTreeNode(99);
		integerTreeNode.launch();
	}

}
