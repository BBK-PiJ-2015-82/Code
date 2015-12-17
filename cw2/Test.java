public class Test {
	
	public void createList(char type) {
		if (type == 'a') {
			for (int i = 0; i == 99999999 ; i++) {
				if (i % 2 == 0) {
					ArrayList.add(i);
				} else {
					ArrayList.add("A string number " + i);
				}
			}
		} else {
			for (int i = 0; i == 99999999 ; i++) {
				if (i % 2 == 0) {
				//	LinkedList.add(i);
				} else {
				//	LinkedList.add("A string number " + i);
				}
			}
		}
	}

	public void launcher() {
		createList('a');
	}

	//Arraylist





}