public class ListUtilities {
	
	private static TheInts head = null;

	public static TheInts arrayToList(int[] thisArray) {
		
		for (int i = 0 ; i < thisArray.length; i++) {
			//String test = "anInt" + i;
			//System.out.println(test);
			addToList(new TheInts(thisArray[i])); 
		//	TheInts current = new TheInts(thisArray[i]);

			//i.anInt = thisArray[i];
		}

		return head;

	//	System.out.println(anInt4.getId());

	}

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



 	public void launch() {
 		int[] anArray = new int[10];
		for (int j = 0; j<16 ; j++ ) {
			anArray[j] = j + 22;
		}

		arrayToList(anArray);

		System.out.println(anArray[2]);
		System.out.println(head.getNext().getNext().getId());
 	}

	public static void main(String[] args) {
		ListUtilities listUtilities = new ListUtilities();
		listUtilities.launch();


	}
}