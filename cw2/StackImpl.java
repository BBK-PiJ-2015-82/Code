public class StackImpl extends AbstractStack {
	
	public StackImpl(List list) {
		super(list);
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

	//FOR TESTING

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