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

		/*
		return left.getMin()
		*/
	}
/*
	public String toString() {
		String returnString = "";
		IntegerTreeNode current = this;
		returnString.concat("[" + current.value);

		while (current.left != null && current.right != null) {
			current = current.left;
			returnString.concat("L [" + current.value);

		}
	}

	**/
//starting this recursively

	public String toString() {
		//start string
		String returnString = "[" + this.value;
		if(left != null) {returnString += " L" + left.toString() + "]" + " R[ ";}
		else {returnString += "R ";}
		if(right != null) {returnString += right.toString();}
		else {returnString += "]";}
		returnString += " ]";
		return returnString;
	}

	public int depth() {
		int leftVal = 0;
		int rightVal = 0;
		if (left == null && right == null) {
			return 1;
		}
		if (left != null) {
			//rightVal++;
			leftVal = 1 + le0ft.depth();
		}
		if (right != null) {
			rightVal = 1 + right.depth();
			//leftVal++;
		}
		if (rightVal > leftVal) {
			return rightVal;
		} else {
			return leftVal;
		}
	}

	public int depthSergio() {
		int leftDepth = 0;
		if (left != null) {
			leftDepth = left.depthSergio();
		}
		int rightDepth = 0;
		if (right != null) {
			rightDepth = right.depthSergio();
		}
		if (leftDepth > rightDepth) {
			return 1 + leftDepth;
		} else {
			return 1 + rightDepth;
		}
	}
/*
	public String toStringLogic() {
		String returnString = "";
		//returnString = returnString.concat(toString());
		//return value for the end of the recursion when no left or right
		returnString = returnString.concat("" + this.value + " L[");
		/*if (left == null && right == null) {
			returnString = returnString.concat("[" + this.value + "L" "]");
		} else { 
		if (left == null) {
			returnString = returnString.concat("] R[");
		} else {
			returnString += left.toString();
		}
		if (right == null) {
			returnString += "]";
		} else {
			returnString += right.toString();
		}


		return returnString;
	}
	
*/
			/*
			returnString = returnString.concat("[" + this.value);
			if (this.left != null) {
				returnString = returnString.concat(left.toString() + "] ");
			} else {
				returnString = returnString.concat("]");
			}
			if (this.right != null) {
				returnString = returnString.concat(right.toString() + "] ");
			} else {
				returnString = returnString.concat("]");
			}
			//returnString = returnString.concat("]");

		}
		/*if (this.left != null) {
			returnString = returnString.concat("L[" + left.toString());
		} else if (this.right != null) {
			returnString = returnString.concat("R[" + right.toString());
		}	/*else if (this.left == null && this.right == null) {
			returnString = returnString.concat("[" + this.value + "]");
		} **/



		
	
		/*
		//if left add that
		if (this.left == null && this.right == null) {
			return (this.value + left.toString() + "]");
		} else if (this.left == null) {
			return (this.value.concat(right.toString()));
		} else {
			return this.concat(left.toString);
		}


		returnString.concat(left.toString());

	}
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
		
		
		add(2);
		add(4);
		add(6);
		
		add(7);
				add(9);
								add(10);
								add(8);

								add(877);



		//System.out.println(this.left.right.value);
		System.out.println(this.getMax());
		System.out.println(this.getMin());
		System.out.println(this.toString());
				System.out.println(this.depth());
								System.out.println(depthSergio());




		//System.out.println(this.right.right.right.value);

	}


	public static void main (String[] args) {
		IntegerTreeNode integerTreeNode = new IntegerTreeNode(5);
		integerTreeNode.launch();
	}

}
