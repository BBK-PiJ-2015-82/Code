public class StackImpl extends AbstractStack {
	
	public StackImpl(List list) {
		super(list);
	}

	/*
	
	protected List internalList;

	public AbstractStack(List list) {
	  this.internalList = list;
    }

     */

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

	
	// for testing

	public void toStringFull() {
		for (int i = 0; i < size(); i++) {
			System.out.println(this.internalList.get(i).getReturnValue().toString());

		}
	}
	


}