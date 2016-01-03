public class Test {
	

	public ArrayList createArrayList(int number) {
		ArrayList listIn = new ArrayList();
		for (int i = 0; i < number ; i++) {
			//System.out.println("adding to array" + i);
			TestObj addToList = null;
			if (i % 2 == 0) {
				addToList = new TestObj(i + 1);

				listIn.add(addToList);
			} else {
				addToList = new TestObj("A string number " + (i + 1));
				listIn.add(addToList);
			}
		}
		
		return listIn;
	}

	public FunctionalArrayList createFunctionalArrayList(int number) {
		FunctionalArrayList listIn = new FunctionalArrayList();
		for (int i = 0; i < number; i++) {
				//System.out.println("adding to array");
			TestObj addToList = null;
			if (i % 2 == 0) {
				addToList = new TestObj(i + 1);

				listIn.add(addToList);
			} else {
				addToList = new TestObj("A string number " + (i + 1));
				listIn.add(addToList);
			}
		}
		
		return listIn;
	}

	public SampleableListImpl createSampleableListImpl(int number) {
		SampleableListImpl listIn = new SampleableListImpl();
		for (int i = 0; i < number; i++) {
				//System.out.println("adding to array");
			TestObj addToList = null;
			if (i % 2 == 0) {
				addToList = new TestObj(i + 1);

				listIn.add(addToList);
			} else {
				addToList = new TestObj("A string number " + (i + 1));
				listIn.add(addToList);
			}
		}
		
		return listIn;
	}

	public LinkedList createLinkedList(int number) {
		LinkedList listIn = new LinkedList();
		for (int i = 0; i < number; i++) {
				//System.out.println("adding to array");
			TestObj addToList = null;
			if (i % 2 == 0) {
				addToList = new TestObj(i + 1);

				listIn.add(addToList);
			} else {
				addToList = new TestObj("A string number " + (i + 1));
				listIn.add(addToList);
			}
		}
		
		return listIn;
	}

	public FunctionalLinkedList createFunctionalLinkedList(int number) {
		FunctionalLinkedList listIn = new FunctionalLinkedList();
		for (int i = 0; i < number; i++) {
				//System.out.println("adding to array");
			TestObj addToList = null;
			if (i % 2 == 0) {
				addToList = new TestObj(i + 1);

				listIn.add(addToList);
			} else {
				addToList = new TestObj("A string number " + (i + 1));
				listIn.add(addToList);
			}
		}
		
		return listIn;
	}

	public boolean testArrayAdd(ArrayList theList) {
		boolean returnValue = true;
		theList = createArrayList(10);

		// test size()

		if (theList.size() != 10) {
			returnValue = false;
		}

		// test isEmpty()

		if (theList.isEmpty()) {
			returnValue = false;
		}

		// test error validation on null object
		TestObj nullObj = null;
		if (theList.add(nullObj).getError() != ErrorMessage.INVALID_ARGUMENT) {
			returnValue = false;
		}
		if (theList.add(5, nullObj).getError() != ErrorMessage.INVALID_ARGUMENT) {
			returnValue = false;
		}
		
		// test simple add()
		TestObj newObj = new TestObj("Testadd");
		theList.add(newObj);
		if (!theList.get(theList.size() - 1).getReturnValue().toString().equals("Testadd")) {
			returnValue = false;
		} 

		//test add(index 0, obj)
		newObj = new TestObj("Testadd2");
		theList.add(0, newObj);

		if (!theList.get(0).getReturnValue().toString().equals("Testadd2")) {
			returnValue = false;
		} 

		//test add(index 5, obj)
		newObj = new TestObj("Testadd3");
		TestObj last = new TestObj(theList.get(theList.size() - 1).getReturnValue().toString());
		int oldSize = theList.size();
		theList.add(5, newObj);

		if (!theList.get(5).getReturnValue().toString().equals("Testadd3")) {
			returnValue = false;
		} 

		if (!theList.get(theList.size() - 1).getReturnValue().toString().equals(last.toString()) || theList.size() != (oldSize + 1)) {
			returnValue = false;
		}
		return returnValue;

	}

	public boolean testLinkedListAdd() {
		boolean returnValue = true;
		LinkedList theList = new LinkedList();
		theList = createLinkedList(100);

		// test error validation on null object

		TestObj nullObj = null;
		if (theList.add(nullObj).getError() != ErrorMessage.INVALID_ARGUMENT) {
			returnValue = false;
		}
		if (theList.add(5, nullObj).getError() != ErrorMessage.INVALID_ARGUMENT) {
			returnValue = false;
		}

		// test adding one object

		TestObj newObj = new TestObj("Testadd");		
		theList.add(newObj);

		if (!theList.get(theList.size() - 1).getReturnValue().toString().equals("Testadd")) {
			returnValue = false;
		} 
		
		// test adding one object by index

		TestObj testObj2 = new TestObj("Testadddd");
		theList.add(0, testObj2);

		if (!theList.get(0).getReturnValue().toString().equals("Testadddd") || theList.size() != 102) {
			returnValue = false;
		} 

		TestObj testObj3 = new TestObj("Testadddddd");
		theList.add(50, testObj3);

		if (!theList.get(50).getReturnValue().toString().equals("Testadddddd") || theList.size() != 103) {
			returnValue = false;
		} 

		return returnValue;

	}

	public boolean testLinkedListRemove() {
		boolean returnValue = true;

		// test error validation - remove from empty list

		List nullList = new LinkedList();
		if (nullList.remove(0).getError() != ErrorMessage.EMPTY_STRUCTURE) {
				returnValue = false;
		}

		LinkedList theList = createLinkedList(100);
		int oldSize = theList.size();
		theList.remove(theList.size() - 1);
		theList.remove(0);
		theList.remove(theList.size() - 2);

		if (!(theList.size() == (oldSize - 3))) {
			returnValue = false;
		} 

		// test error validation - bad index

		if (theList.remove(-1).getError() != ErrorMessage.INDEX_OUT_OF_BOUNDS) {
			returnValue = false;
		}
		if (theList.remove(theList.size()).getError() != ErrorMessage.INDEX_OUT_OF_BOUNDS) {
			returnValue = false;
		}

		return returnValue;
	}

	public boolean testArrayRemove(ArrayList theList) {
		boolean returnValue = true;

		//this will test size also
		theList = new ArrayList();
		theList = createArrayList(100);
		int oldSize = theList.size();

		theList.remove(0);

		theList.remove(theList.size() - 2);
		theList.remove(theList.size() - 1);



		if (theList.size() != (oldSize - 3)) {
			returnValue = false;
		} 

		if (theList.remove(-1).getError() != ErrorMessage.INDEX_OUT_OF_BOUNDS) {
			returnValue = false;
		}
		if (theList.remove(theList.size()).getError() != ErrorMessage.INDEX_OUT_OF_BOUNDS) {
			returnValue = false;
		}
		return returnValue;
	}

	public boolean testFunctionalArrayList() {
		boolean returnValue = true;

		// test error validation of head() on null list

		FunctionalArrayList nullList = new FunctionalArrayList();
		if (!nullList.head().hasError()) {
			returnValue = false;
		}

		if (nullList.head().getError() != ErrorMessage.EMPTY_STRUCTURE) {
			returnValue = false;
		}

		// test basic method

		FunctionalArrayList fal = new FunctionalArrayList();
		fal = createFunctionalArrayList(999);
		if (!fal.get(4).getReturnValue().toString().equals("5")) {
			returnValue = false;
		}

		// remove last item on list
		int recordSize = fal.size();
		fal.remove(fal.size() - 1);
		if (fal.size() != recordSize - 1) {
			returnValue = false;
		}

		// remove first item on list
		Object secondItem = fal.get(1).getReturnValue();
		fal.remove(0);
		if (!fal.head().getReturnValue().equals(secondItem) && fal.size() != recordSize - 2) {
			returnValue = false;
		}

		// re-add a number, check size is correct
		fal.add(new TestObj(55));
		if (fal.size() != recordSize - 1) {
			returnValue = false;
		}

		return returnValue;
	}

	public boolean testFunctionalLinkedList() {
		boolean returnValue = true;
		FunctionalLinkedList fll = createFunctionalLinkedList(999);
		if (fll.get(3).getReturnValue().toString() == null) {
			returnValue = false;
		}
		int recordSize = fll.size();
		fll.remove(fll.size() - 1);
		if (fll.size() != recordSize - 1) {
			returnValue = false;
		}
		fll.add(new TestObj(55));
		if (fll.size() != recordSize) {
			returnValue = false;
		}

		return returnValue;
	}

	public boolean testNullOrOneNodeFunctionalLinkedList() {
		boolean returnValue = true;

		FunctionalLinkedList nullList = new FunctionalLinkedList();
		if (!nullList.head().hasError()) {
			returnValue = false;
		}

		if (nullList.head().getError() != ErrorMessage.EMPTY_STRUCTURE) {
			returnValue = false;
		}

		FunctionalLinkedList fll = createFunctionalLinkedList(10);
		
		// test head
		if (!fll.head().getReturnValue().toString().equals("1")) {
			returnValue = false;
		}
		
		// test rest doesn't work on list of one

		fll = createFunctionalLinkedList(1);

		if (!fll.rest().isEmpty()) {
			returnValue = false;
		}
		
		// test rest() works on normal list


		fll = createFunctionalLinkedList(10);
		if (fll.size() != 10) {
			returnValue = false;
		}

		if (fll.rest().size() != 9) {
			returnValue = false;
		}

		if (fll.size() != 10) {
			returnValue = false;
		}
		return returnValue;
	}

	public boolean testNullOrOneItemFunctionalArrayList() {
		boolean returnValue = true;
		
		//Test empty list returns correct error message for null head()
		FunctionalArrayList fal = createFunctionalArrayList(0);
		
		if (fal.head().getError() != ErrorMessage.EMPTY_STRUCTURE) {
			returnValue = false;
		}

		// test rest() on 0 list returns empty list and not an error

		if (fal.rest().size() != 0 && fal.rest() != null) {
			returnValue = false;
		}

		//test head return value is correct
		fal = createFunctionalArrayList(5);

		if (!fal.head().getReturnValue().toString().equals("1")) {
			returnValue = false;
		}

		if (fal.rest().get(0).getReturnValue().toString().equals("1")) {
			returnValue = false;
		}

		if (fal.size() != 5) {
			returnValue = false;
		}


		//test list of one returns empty list for rest()
		fal = createFunctionalArrayList(1);
		if (!fal.rest().isEmpty()) {
			returnValue = false;
		}

		fal = createFunctionalArrayList(2);
		if (fal.rest().size() != 1) {
			returnValue = false;
		}
		

		fal = createFunctionalArrayList(10);
		if (fal.rest().size() != 9) {
			returnValue = false;
		}
		if (fal.size() != 10) {
			returnValue = false;
		}
			
		

		return returnValue;
	}

	public boolean testSampleableListImpl() {
		SampleableListImpl sli = createSampleableListImpl(10);
		boolean returnValue = true;
		int oldSize = sli.size();
		if (sli.sample().size() != sli.size() / 2) {
			returnValue = false;
		}

		// test some actual values of sample()
		if (!sli.sample().get(1).getReturnValue().toString().equals("3")) {
			returnValue = false;
		}
		if (!sli.sample().get(2).getReturnValue().toString().equals("5")) {
			returnValue = false;
		}
		if (!sli.sample().get(3).getReturnValue().toString().equals("7")) {
			returnValue = false;
		}

		// test values of actual SLI

		if (sli.get(1).getReturnValue().toString().equals("3")) {
			returnValue = false;
		}
		if (sli.size() != oldSize) {
			returnValue = false;
		}

		sli = createSampleableListImpl(0);
		if (sli.getObjectArray() == null) {
			returnValue = false;
		}

		// test null list

		sli = createSampleableListImpl(0);
		if (sli.sample() == null) {
			returnValue = false;
		}
		if (sli.sample().get(0).getError() != ErrorMessage.EMPTY_STRUCTURE) {
			returnValue = false;
		}

		if (sli.get(0).getError() != ErrorMessage.EMPTY_STRUCTURE) {
			returnValue = false;
		}
		return returnValue;

	}



	


	public boolean testStackImpl() {

		boolean returnValue = true;

		// Test isEmpty()

		ArrayList theList = createArrayList(0);
		StackImpl stackImpl = new StackImpl(theList);
		if (!stackImpl.isEmpty()) {
			returnValue = false;
		}
		if (stackImpl.pop().getError() != ErrorMessage.EMPTY_STRUCTURE) {
			returnValue = false;
		}

		// Test works with array and linkedlist

		LinkedList theLinkedList = createLinkedList(10);
		stackImpl = new StackImpl(theLinkedList);
		if (stackImpl.size() != 10) {
			returnValue = false;
		}
		TestObj atestObj = new TestObj("atest");

		stackImpl.push(atestObj);
		if (stackImpl.size() != 11) {
			returnValue = false;
		}

		TestObj stackPop = new TestObj(stackImpl.pop().getReturnValue().toString());
		if (!stackPop.toString().equals("atest") || stackImpl.size() != 10) {
			returnValue = false;
		}

		// test size()

		theList = createArrayList(10);
		stackImpl = new StackImpl(theList);


		if (stackImpl.size() != 10) {
			returnValue = false;
		}

		//test new size and push()
		TestObj testObj = new TestObj("Testadd");
		stackImpl.push(testObj);
		//stackImpl.push(testObj);

		//System.out.println(stackImpl.size());
		if (stackImpl.size() != 11 || !stackImpl.top().getReturnValue().toString().equals("Testadd")) {
			returnValue = false;
		}

		//test pop()
		int oldSize = stackImpl.size();

		TestObj testObj2 = new TestObj("Testaddd");
		TestObj testObj3 = new TestObj("Testadddd");


		stackImpl.push(testObj2);
		stackImpl.push(testObj3);



		if (!stackImpl.pop().getReturnValue().toString().equals("Testadddd") || stackImpl.size() != oldSize + 1) {
			returnValue = false;
		}

		if (!stackImpl.pop().getReturnValue().toString().equals("Testaddd") || stackImpl.size() != oldSize) {
			returnValue = false;
		}


		// test 


		return returnValue;
	}

	public boolean testImprovedStackImplReverse() {
		boolean returnValue = true;
		ArrayList list = createArrayList(0);

		//NOTE - THIS WILL CREATE A STACK 1-55 NOT 55-1
		ImprovedStack stack = new ImprovedStackImpl(list);

		if (stack.pop().getError() != ErrorMessage.EMPTY_STRUCTURE) {
			returnValue = false;
		}

		list = createArrayList(5);
		stack = new ImprovedStackImpl(list);
		
		if (!stack.top().getReturnValue().toString().equals("1")) {
			returnValue = false;
		}



		if (!stack.reverse().top().getReturnValue().toString().equals("5")) {
			returnValue = false;
		}

		stack.pop();
		stack.pop();


		if (!stack.top().getReturnValue().toString().equals("3")) {
			returnValue = false;
		}

		TestObj testObj = new TestObj("testObj");
		stack.push(testObj);


		if (stack.size() != 4) {
			returnValue = false;
		}

		if (!stack.pop().getReturnValue().toString().equals("testObj")) {
			returnValue = false;
		}

		if (stack.size() != 3) {
			returnValue = false;
		}
		
		return returnValue;


	}

	public boolean testImprovedStackImplRemove() {
		boolean returnValue = false; //different here because of first test
		ArrayList list = createArrayList(55);
		ImprovedStack stack = new ImprovedStackImpl(list);
		Object testObj = new TestObj(99);
		stack.push(testObj);
		
		while(!stack.isEmpty()) {

			// Check it inserts it initially

			if (stack.pop().getReturnValue().equals(testObj)) {
				returnValue = true;
			}
		}



		list = createArrayList(55);
		stack = new ImprovedStackImpl(list);
		stack.push(testObj);
		stack.push(testObj);
		stack.push(testObj);
		if (stack.size() != 58) {
			returnValue = false;
		}
		stack.remove(testObj);
		if (stack.size() != 55) {
			returnValue = false;
		}
		while(!stack.isEmpty()) {
			if (stack.pop().getReturnValue().equals(testObj)) {
				returnValue = false;
			}
		}
		/*if (stack.size() != oldSize - 1 || stack.get(33).toString().equals("33")) {
			returnValue = false;
		}*/

		return returnValue;
	}




	public void launcher() {
		ArrayList theList = new ArrayList();
		//LinkedList theLinkedList = new LinkedList();
		System.out.println(testArrayAdd(theList));
		System.out.println(testArrayRemove(theList));
		System.out.println(testLinkedListAdd());
		System.out.println(testLinkedListRemove());
		System.out.println(testFunctionalArrayList());
		System.out.println(testFunctionalLinkedList());
		System.out.println(testNullOrOneNodeFunctionalLinkedList());
		System.out.println(testNullOrOneItemFunctionalArrayList());
		System.out.println(testSampleableListImpl());
		System.out.println(testStackImpl());
		System.out.println(testImprovedStackImplReverse());
		System.out.println(testImprovedStackImplRemove());

	}


	public static void main(String[] args) {
		Test test = new Test();
		test.launcher();
	}



}