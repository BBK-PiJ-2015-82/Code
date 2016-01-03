public class ArrayList implements List {
	
	private Object[] objectArray;

	public ArrayList() {
		objectArray = new Object[100];
	}
	public ArrayList(Object[] input) {
		this.objectArray = input;
	}

	public Object[] getObjectArray() {
		return this.objectArray;
	}

	public void set(int index, Object obj) {
		this.objectArray[index] = obj;
	}

	public void setRestObjectArray(Object[] objArrayIn) {
		// used for functionalArrayList class
		this.objectArray = objArrayIn;
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
				if (objectArray[i] == null) {
					break;
				} 
			}
		}
		return i;
	}

	@Override
	public ReturnObjectImpl get(int index) {
		ReturnObjectImpl returnObj = null;
		if ((index < 0 || index > (size() - 1)) && !isEmpty()) {
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
		if ((index < 0 || index > (size() - 1)) && !isEmpty()) {
			returnObj = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (isEmpty()) {
			returnObj = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index == (size() - 1)) {
			returnObj = new ReturnObjectImpl(objectArray[size() - 1]);
			objectArray[size() - 1] = null;
		} else {
			returnObj = new ReturnObjectImpl(objectArray[index]);
			for (int i = index ; i < size() ; i++) {
				if (i == size() - 1) {
					objectArray[i] = null;
				} else {
					objectArray[i] = objectArray[i + 1];
				}
			}
		}
		return returnObj;
	}

	@Override
	public ReturnObject add(int index, Object item){
		ReturnObjectImpl returnObj = null;
		if (item == null) {
			returnObj = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			if ((index < 0 || index > (size() - 1)) && !isEmpty()) {
				returnObj = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			} else if (isEmpty()) {
				returnObj = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			} else if (index == (size() - 1)) {
				objectArray[index] = item;
			} else {
				objectArray = enlargeArray(objectArray);
				for (int i = size() ; i >= index ; i--) {
					objectArray[i + 1] = objectArray[i];
				}
				objectArray[index] = item;
			}
		}
		return returnObj;
	}

	@Override
	public ReturnObject add(Object item) {
		ReturnObjectImpl returnObj = null;
		if (item == null) {
			returnObj = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
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

	// ADDITIONAL METHODS

	private Object[] enlargeArray(Object[] anArray) {
		Object[] newArray = new Object[size() * 2];
		for (int i = 0; i < size() ; i++) {
			newArray[i] = anArray[i];
		}
		return newArray;
	}

	public Object[] returnSampledArray() {
		ArrayList returnArray = new ArrayList();
		for (int i = 0; i < this.objectArray.length ; i = i + 2) {
			returnArray.add(this.objectArray[i]);
		}
		return returnArray.objectArray;
	}

	// METHOD FOR TESTING

	public void toStringFull() {
		for (int i = 0; i < size(); i++) {
			System.out.println(this.get(i).getReturnValue().toString());

		}
	}

}