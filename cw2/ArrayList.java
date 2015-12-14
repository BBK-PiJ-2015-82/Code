public class ArrayList implements List {
	
	Object[] objectArray;

	public ArrayList() {
		Object[] = null;
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
		if (isEmpty()) {
			return 0;
		} else {

			for (int i = 0 ; i < objectArray.length ; i++) {
				if ((i = == objectArray.length - 1) {
					return i;
				} else if (objectArray[i + 1] == null) {
					return i;
				}
			}
		}

	}

@Override
	public ReturnObjectImpl get(int index) {
		if (index >= objectArray.length || index < 0) {
			ReturnObjectImpl returnObj = new ReturnObjectImpl(ErrorMessage INDEX_OUT_OF_BOUNDS);
			return returnObj;
		} else if (isEmpty()) {
			ReturnObjectImpl returnObj = new ReturnObjectImpl(ErrorMessage EMPTY_STRUCTURE);
			return returnObj;
		} else {
			ReturnObjectImpl returnObj = new ReturnObjectImpl(Object objectArray[index], ErrorMessage NO_ERROR);
			return returnObj;
		}
	}

	@Override
	public ReturnObjectImpl remove(int index) {


	}


	@Override
	public



//don't forget to increase array size as required
























