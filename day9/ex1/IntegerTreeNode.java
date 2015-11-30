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
		if (newNumber >= this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);

			} else { 
				right.add(newNumber);
			}
		}	else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else { 
				//System.out.println("stuck here");
				left.add(newNumber);
			} 


		}
	}
// SEARCH method to find the node before the one we're searching for in tree
	public IntegerTreeNode search(int n) {
		
		IntegerTreeNode returnNode = null;
		

		if ((left != null && left.value == n) 
			|| (right != null && right.value == n))  
		{
			returnNode = this;
		} else {
			if (left != null && left.contains(n)) {

				returnNode = left.search(n);
			}  if (right != null && right.contains(n)) {

				returnNode = right.search(n);
			}

		}

		


		return returnNode;
	}

	public IntegerTreeNode searchReturn(int n) {
		
		if (search(n).left.value == n) {
			return search(n).left;
		} else {
			return search(n).right;
		}

	}

	
	//count all elements in tree

	public int count() {
		int counter = 1;
		if (left != null) {
			counter += left.count();
		}
		if (right != null) {
			counter += right.count();
		}
		return counter;
	}

	public int findMedian(IntegerTreeNode root) {
		int[] theArray = new int[this.count() + 1];
		theArray = addToArray(theArray, this);
		//theArray should be an array of integers in order...
		
		System.out.println(" median in method" + theArray[this.count() / 2]);
		return theArray[this.count() / 2];


	}

	public int findMedianInTree(IntegerTreeNode node) {
		if (node.median) {
			
		}
	}


	public int findMedianInTree(IntegerTreeNode node, int count, int countSoFar) {
		int returnInt = 1;
		if (countSoFar == count) {
			returnInt = node.value;
		} else {
			if (node.left == null && node.right == null ) {
				returnInt = countSoFar;
			} else if (node.left == null) {
				returnInt = countSoFar + node.right.findMedianInTree(node.right, count, countSoFar);
			} else {
				returnInt = countSoFar + node.left.findMedianInTree(node.left, count, countSoFar);

			}

		}

		return returnInt;
	}
	

	public int[] addToArray(int[] nodeArray, IntegerTreeNode node) {
		
		//System.out.println(nodeArray[0]);
		if (node.left == null && node.right == null) {
			nodeArray =	node.addToArrayHelper(nodeArray, node.value);
			for (int j = 0; j < nodeArray.length; j++ ) {
				System.out.println(nodeArray[j]);
			}
		} else if (node.left == null) {
			nodeArray =	node.addToArrayHelper(nodeArray, node.value);

			nodeArray =	right.addToArray(nodeArray, right);
		} else if (node.right == null) {
			nodeArray =	node.addToArrayHelper(nodeArray, node.value);

			nodeArray =	left.addToArray(nodeArray, left);
		} else {
			nodeArray =	node.addToArrayHelper(nodeArray, node.value);


			nodeArray =	left.addToArray(nodeArray, left);
			nodeArray =	right.addToArray(nodeArray, right);

		}

		return nodeArray;
	}

	public int[] addToArrayHelper(int[] nodeValueArray, int nodeValue) {
		int valueToMove; 
		System.out.println(nodeValue);

		for (int m = 0; m < nodeValueArray.length; m++ ) {
			System.out.println(nodeValueArray[m]);
		}

		
		for (int i = 0; i < nodeValueArray.length - 1; i++ ) {
			if (nodeValue < nodeValueArray[i]) {
				valueToMove = nodeValueArray[i];
				nodeValueArray[i] = nodeValue;
				nodeValueArray[i + 1] = valueToMove;
				break;
			} 

		}

		return nodeValueArray;
	}

	

	public void remove(int n) {
		//guard condition to not run this method if int doesn't exist

		if (!this.contains(n)) {
			return;
		}
		IntegerTreeNode nodeToKill = searchReturn(n);
		IntegerTreeNode nodeBefore = search(n);

		// if both left and right are null, kill here

		if (nodeToKill.left == null || nodeToKill.right == null) {
			nullnodes(n);
		} else {
			IntegerTreeNode readditions = remover(n);
			//System.out.println(readditions.count());
			System.out.println("vlauuee" + readditions.count());
			readd(readditions);
		}

		
		// now done both null or one null, need to do both now

	}

	public void nullnodes(int n) {

		IntegerTreeNode nodeToKill = searchReturn(n);
		IntegerTreeNode nodeBefore = search(n);


		if (nodeToKill.left == null && nodeToKill.right == null) {
			if (nodeBefore.left.value == n) {
				nodeBefore.left = null; 
				return;

			} else {
				nodeBefore.right = null;
				return;


			} 
		}


		else {


			IntegerTreeNode nodeToKeep = null;

		// if nodeto kill left is null

			if (nodeToKill.left == null) {
				if (nodeBefore.left == nodeToKill) {
					nodeBefore.left = nodeToKill.right;
					return;

				} else {
					nodeBefore.right = nodeToKill.right;
					return;

				}
			} else {

			//if nodetokill right is null
				if (nodeBefore.left == nodeToKill) {
					nodeBefore.left = nodeToKill.left;
					return;

				} else {
					nodeBefore.right = nodeToKill.left;
					return;

				}
			}
		}
	}

	public IntegerTreeNode remover(int n) {

		IntegerTreeNode nodeToKeep = null;

		IntegerTreeNode nodeToKill = searchReturn(n);
		IntegerTreeNode nodeBefore = search(n);
		//if nodetokill left is bigger
		if (nodeToKill.left.count() > nodeToKill.right.count()) {
			nodeToKeep = nodeToKill.left;
			if (nodeBefore.left == nodeToKill) {
				nodeBefore.left = nodeToKill.right;
			} else {
				nodeBefore.right = nodeToKill.right;
			}

		// if node to kill right is bigger
		} else {
			nodeToKeep = nodeToKill.right;
			if (nodeBefore.left == nodeToKill) {
				nodeBefore.left = nodeToKill.left;
			} else {
				nodeBefore.right = nodeToKill.left;
			}
		}


		//HERE - need to re add the nodetokeep values
		return nodeToKeep;

	}

	public void readd(IntegerTreeNode nodeToKeep) {


		if (nodeToKeep.left == null && nodeToKeep.right == null) {
		//	System.out.println("adding both null " + nodeToKeep.toStringNoBrackets());

			this.add(nodeToKeep.value);
		} else if (nodeToKeep.left == null) {
		//	System.out.println("adding left null" + nodeToKeep.toStringNoBrackets());

			this.add(nodeToKeep.value);
			this.readd(nodeToKeep.right);
		} else if (nodeToKeep.right == null) {
		//	System.out.println("adding else" + nodeToKeep.toStringNoBrackets());
			this.add(nodeToKeep.value);
			this.readd(nodeToKeep.left);
		} else {
			this.add(nodeToKeep.value);
			this.readd(nodeToKeep.left);
			this.readd(nodeToKeep.right);

		}
		return;

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
		//	System.out.println("in loop");
		//	System.out.println(highest.value);
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
		//	System.out.println("in loop");
		//	System.out.println(lowest.value);
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
		//start string
		String returnString = "[" + this.value;
		if(left != null) {returnString += " L" + left.toString();}
		else {returnString += " L" + "[]";}
		if(right != null) {returnString += " R" + right.toString();}
		else {returnString += " R[]";}
		returnString += "]";
		return returnString;
	}

	public String toStringSimple() {
		String returnString = "[" + this.value;
		if(left != null) {
			returnString += " " + left.toStringSimple();
		}
		//else {returnString += " L" + "[]";}
		if(right != null) {
			returnString += " " + right.toStringSimple();
		}
		//else {returnString += " R[]";}
		returnString += "]";
		return returnString;
	}

	public String toStringNoBrackets() {
		String returnString = "" + this.value;
		if(left != null) {
			returnString += " " + left.toStringNoBrackets();
		}
		//else {returnString += " L" + "[]";}
		if(right != null) {
			returnString += " " + right.toStringNoBrackets();
		}
		//else {returnString += " R[]";}
		returnString += "";
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
			leftVal = 1 + left.depth();
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

	public void rebalance() {

//find a number roughly somewhere in the middle
		IntegerTreeNode oldRoot = this;
		int counter = this.count() / 2;

		this.findMedianInTree(this, counter, 0);
		//IntegerTreeNode[] nodeArray = new IntegerTreeNode[this.count()];

		//this.value = this.findMedian(this);
		//readd(this);
		System.out.println("median" + findMedian(this));

		//remove(this);

	}

	public void launch() {


		add(5);
		add(3);

		add(9);
		add(11);
		add(10);

		add(8);

		add(7);

		add(16);
		add(10);
		add(14);
		//add(15);

		add(55);
		add(33);

		add(91);
		add(111);
		add(110);

		add(81);

		add(17);

		add(163);
		add(102);
		add(147);

		add(14);

		add(10);
		System.out.println(this.toStringNoBrackets());
		//System.out.println(this.count());

		remove(91);



		//System.out.println(this.count());
		System.out.println(this.toStringNoBrackets());
		rebalance();


		//System.out.println(this.left.right.value);
		/*
		System.out.println(this.getMax());
		System.out.println(this.getMin());
		System.out.println(this.toString());
		System.out.println(toStringSimple());
		System.out.println(this.depth());
		System.out.println(depthSergio());
		System.out.println(search(5).value);
		System.out.println(this.count());
		*/
		//System.out.println(search(16).value);





		//System.out.println(this.right.right.right.value);

	}


	public static void main (String[] args) {
		IntegerTreeNode integerTreeNode = new IntegerTreeNode(6);
		integerTreeNode.launch();
	}

}
