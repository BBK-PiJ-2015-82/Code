public class ImprovedStackImpl implements ImprovedStack {
	
	protected List internalList;

	public ImprovedStackImpl() {
		super();
		this.internalList = new ArrayList();
	}

	public ImprovedStackImpl(List list) {
		this.internalList = list;
	}

	@Override
	public boolean isEmpty() {
		return internalList.isEmpty();

	}

	@Override
	public int size() {
		return internalList.size();
	}		

	@Override
	public void push(Object item) {
		internalList.add(0, item);

	}

	@Override
	public ReturnObject top() {
		return internalList.get(0);
	}

	@Override
	public ReturnObject pop() {

		return internalList.remove(0);
	}

	@Override
	public ImprovedStack reverse() {
		ArrayList newArray = new ArrayList();
		ImprovedStackImpl copy = this;
		for (int i = size() - 1; i >= 0 ; i-- ) {
			newArray.add(internalList.get(i).getReturnValue());
		}
		return new ImprovedStackImpl(newArray);
	}

	@Override
	public void remove(Object object) {
		//Count how many instances of object
		int counter = 0;
		for (int i = 0; i < internalList.size() ; i++ ) {
			if (object.equals(internalList.get(i).getReturnValue())) {
				counter++;			
			}
		}

		//Then run through and remove that number of times
		for (int j = 0 ; j <= counter ; j++ ) {
			for (int i = 0; i < internalList.size() ; i++ ) {
				if (object.equals(internalList.get(i).getReturnValue())) {
					internalList.remove(i);
					break;
				}
			}
		}
	}

	// for testing

	public void toStringFull() {
		for (int i = 0; i < size(); i++) {
			System.out.println(this.internalList.get(i).getReturnValue().toString());

		}
	}

	public void popAll() {
		while(!isEmpty()) {
			System.out.println(this.pop().getReturnValue().toString());
		}
	}
}