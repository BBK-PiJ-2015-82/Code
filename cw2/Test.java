public class Test {
	

	public ArrayList createList(char type, ArrayList listIn) {
		if (type == 'a') {
			for (int i = 0; i < 10; i++) {
				System.out.println("adding to array");
				TestObj addToList = null;
				if (i % 2 == 0) {
					addToList = new TestObj(i + 1);

					listIn.add(addToList);
				} else {
					addToList = new TestObj("A string number " + (i + 1));
					listIn.add(addToList);
				}
			}
		} else {
			for (int i = 0; i == 10 ; i++) {
				if (i % 2 == 0) {
				//	LinkedList.add(i);
				} else {
				//	LinkedList.add("A string number " + i);
				}
			}
		}
		return listIn;
	}

	public boolean testArrayAdd() {
				theList = createList('a', theList);

		theList.add("Testadd");
		if (theList.get(size() - 1).toString().equals("Testadd") {
			return true;
		} else {
			return false;
		}

	}

	public void launcher() {
		ArrayList theList = new ArrayList();

		theList = createList('a', theList);
		System.out.println("list size is " + theList.size());
		theList.remove(5);
		for (int i = 0; i < theList.size() ; i++ ) {
			System.out.println(theList.get(i).getReturnValue().toString());

		}
		TestObj addToList = new TestObj(5);
		theList.add(5, addToList);
		System.out.println("list size is " + theList.size());
		for (int i = 0; i < theList.size() ; i++ ) {
			System.out.println(theList.get(i).getReturnValue().toString());

		}
				System.out.println("list size is " + theList.size());


					//System.out.println(theList.get(9).getReturnValue().toString());

		//System.out.println(ReturnObjectImpl(theList.get(123)));

	}

	//Arraylist

	public static void main(String[] args) {
		Test test = new Test();
		test.launcher();
	}



}