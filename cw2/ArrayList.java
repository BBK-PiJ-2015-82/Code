public class ArrayList implements List {
	
	private Object[] objectArray;

	public ArrayList() {
		objectArray = new Object[100];
	}

	@Override
	public boolean isEmpty() {
		if (objectArray[0] == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int size() {
		int i;

		if (isEmpty()) {
			return 0;
		} else {
			for (i = 0 ; i < objectArray.length ; i++) {
				if (i == objectArray.length - 1 || objectArray[i] == null) {
					break;
				} 

			}
		}
		return i;


	}

	@Override
	public ReturnObjectImpl get(int index) {
		ReturnObjectImpl returnObj = null;

		if (index < 0 || index > (size() - 1)) {
			returnObj = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (isEmpty()) {
			returnObj = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			returnObj = new ReturnObjectImpl(objectArray[index]);
		}
		return returnObj;

	}

	

	@Override
	public ReturnObjectImpl remove(int index) {
		ReturnObjectImpl returnObj = null;
			System.out.println("index = " + index + "size is " + size());

		if (index < 0 || index > (size() - 1)) {
			returnObj = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (isEmpty()) {
			returnObj = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index == (size() - 1)) {
			returnObj = new ReturnObjectImpl(objectArray[size() - 1]);
			objectArray[size() - 1] = null;
		} else {
			returnObj = new ReturnObjectImpl(objectArray[index]);
			for (int i = index ; i <= size() ; i++) {
				objectArray[i] = objectArray[i + 1];
			}
			System.out.println("index = " + index + "size is " + size());
		}

		return returnObj;


	}

	@Override
	public ReturnObject add(int index, Object item){
		ReturnObjectImpl returnObj = null;

		if (index < 0 || index > (size() - 1)) {
			returnObj = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (isEmpty()) {
			returnObj = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index == (size() - 1)) {
			objectArray[index] = item;
		} else {

			objectArray = enlargeArray(objectArray);


			for (int i = size() ; i >= index ; i--) {
				objectArray[i + 1] = objectArray[i];
							System.out.println("i = " + index + "size is " + size());


			}
			objectArray[index] = item;

		}
					return returnObj;

	}

	@Override
	public ReturnObject add(Object item) {
		ReturnObjectImpl returnObj = null;
		// check if item is invalid and return error if so
		if (item == null) {
			returnObj = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
		// check if array is full, if so create another larger one
			if (this.objectArray[objectArray.length - 1] != null) {
				objectArray = enlargeArray(objectArray);
			}

			for (int i = 0; i < objectArray.length ; i++) {
				if (objectArray[i] == null) {
					objectArray[i] = item;
					break;
				}
			}
		}

		return returnObj;


	}

private Object[] enlargeArray(Object[] anArray) {
	System.out.println("englarding array");
	Object[] newArray = new Object[anArray.length + 1];
	for (int i = 0; i < anArray.length ; i++) {
		newArray[i] = anArray[i];
	}
	return newArray;
}

}

/*

	@Override
	public

*/

//don't forget to increase array size as required

	// if index is greater than a null index an error should be returned

	// good idea to submit tests
























