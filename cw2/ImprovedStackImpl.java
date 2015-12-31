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

	public ReturnObject top() {
		return internalList.get(0);
	}

	;

	public ReturnObject pop() {

		return internalList.remove(0);
	}


	public ImprovedStack reverse() {
		//ImprovedStack newList = new ImprovedStackImpl();
		ArrayList newArray = new ArrayList();
		ImprovedStackImpl copy = this;
		//while(!copy.isEmpty()) {
		//for (int i = 0; i < size(); i++) {
		for (int i = size() - 1; i >= 0 ; i-- ) {
			//System.out.println(internalList.get(i).getReturnValue().toString());
			//newList.push(internalList.get(i).getReturnValue());
			//System.out.println("here");
			newArray.add(internalList.get(i).getReturnValue());
		}
		//newArray.toStringFull();

		
	//	internalList = newList;
		//newList.toStringFull();
		return new ImprovedStackImpl(newArray);
	}

	public void remove(Object object) {
		//Count how many instances of object
		int counter = 0;
		for (int i = 0; i < internalList.size() ; i++ ) {
			if (object.equals(internalList.get(i).getReturnValue())) {
				counter++;			}
			}

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