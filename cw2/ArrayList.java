public class ArrayList implements List {
	
	Object[] objectArray;

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

		if (index >= objectArray.length || index < 0) {
			returnObj = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return returnObj;
		} else if (isEmpty()) {
			ReturnObjectImpl returnObj = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return returnObj;
		} else {
			ReturnObjectImpl returnObj = new ReturnObjectImpl(objectArray[index]);
			return returnObj;
		}
	}

	

	@Override
	public ReturnObjectImpl remove(int index) {


	}

	@Override
	public ReturnObject add(int index, Object item){};

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
		Object[] newArray = new Object[anArray.length + 100];
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
























