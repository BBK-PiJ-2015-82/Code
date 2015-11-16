public class ListUtilities {
	
	private static TheInts head = null;



	public static TheInts arrayToList(int[] thisArray) {
		
		for (int i = 0 ; i < thisArray.length; i++) {
			//String test = "anInt" + i;
			//System.out.println(test);
			bubbleSort(new TheInts(thisArray[i])); 
		//	TheInts current = new TheInts(thisArray[i]);
				//	printAll();

			//i.anInt = thisArray[i];
		}

		return head;

	//	System.out.println(anInt4.getId());

	}

	//public static void addToListSortedNew

	
/**
	public static void sortedList(int[] thisArrayToSort) {

		for (int i = 0 ; i < thisArrayToSort.length; i++) {
					//String test = "anInt" + i;
					//System.out.println(test);
					addToListSorted(new TheInts(thisArrayToSort[i])); 
				//	TheInts current = new TheInts(thisArray[i]);

					//i.anInt = thisArray[i];
				}
	}
*/

	public static void addToList(TheInts toList) {
		if (head == null) {
			head = toList;
		} else if (head.getNext() == null) {
			head.setNext(toList);
		} else {
			TheInts current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(toList);
		}
	}

	public static void addToListSorted(TheInts toSortedList) {
		//printAll();
		System.out.println("sorted list value " + toSortedList.getId());
		// if no head
		if (head == null) {
			head = toSortedList;
			System.out.println("head null");

		// if only head	
		} else if (head.getNext() == null) {
			System.out.println("head value " + head.getId());
			if (head.getId() > toSortedList.getId()) {
				TheInts currentStart = head;
				head = toSortedList;
				head.setNext(currentStart);
			} else {
				head.setNext(toSortedList);
				}
			System.out.println("list of one");
			System.out.println(head.getId());
		}
		// if head + 1

			else if (head.getNext().getNext() == null) {
			System.out.println("list of two");

				TheInts current = head;

				if (toSortedList.getId() > current.getNext().getId()) {
					//current.setNext(current.getNext());
					current.getNext().setNext(toSortedList);
				} else {
					TheInts currentLast = current.getNext();
					current.setNext(toSortedList);
					current.getNext().setNext(currentLast);

				}
			}

		// all others	
			else {
			System.out.println("the rest");
			//if this is the lowest number
				if (toSortedList.getId() <= head.getId()) {
					TheInts current = head;
					head = toSortedList;
					head.setNext(current);
				} else {

					TheInts current = head;

					while ((current.getNext().getId() < toSortedList.getId()) && (current.getNext() != null)) {
						current = current.getNext();
					}

					if (current.getNext() == null) {
						current.setNext(toSortedList);

					}

					

					else {
					TheInts currentNext = current.getNext().getNext();
					current.setNext(toSortedList);
					toSortedList.setNext(currentNext);
					}
				}
}
	}

	public static void compare(TheInts comparee, TheInts comparator) {
		//TheInts returnValue = (comparee.getId() > comparator.getId()) ? comparee : comparator;
		if (comparee.getId() > comparator.getId()) {
			comparator.setNext(comparee);
		} else {
			comparee.setNext(comparator);
		}
	}

	public static void bubbleSort(TheInts intToSort) {
		//if no head
		if (head == null) {
			head = intToSort;
		}

		// head 
		else if (head.getNext() == null) {
			compare(head, intToSort); //check this actually changes the head
		}

		else {
			TheInts current = head;
			while (current != null) {
				compare(current, intToSort);
				current = current.getNext();
			}
		}
	}

	

	public static void printAll() {
		TheInts printcurrent = head;
		while (printcurrent.getNext() != null) {
			System.out.println("printall " + printcurrent.getId());
			printcurrent = printcurrent.getNext();

		}
	}

 	public void launch() {
 		int[] anArray = new int[6];
		//for (int j = 0; j<10 ; j++ ) {
		//	anArray[j] = (int)((Math.abs(Math.random() + 1)) * (Math.abs(Math.random() + 1)) * (Math.abs(Math.random() + 1)));
		//	System.out.println("array value " + anArray[j]);
		//}
		//System.out.println("array 0 value " + anArray[0]);
 		anArray[0] = 99;
 		anArray[1] = 66;
 		anArray[2] = 33;
 		anArray[3] = 21;
 		anArray[4] = 5;
 		anArray[5] = 7;
		arrayToList(anArray);
		printAll();
		System.out.println(head.getId());
		//printAll();


		//System.out.println(head.getNext().getNext().getId());

		//System.out.println(head.getNext().getNext().getId());
 	}

	public static void main(String[] args) {
		ListUtilities listUtilities = new ListUtilities();
		listUtilities.launch();


	}
}