public class FunctionalArrayList extends ArrayList implements FunctionalList {

	public FunctionalArrayList() {
		super();
	}

	public FunctionalArrayList(Object[] a) {
		super(a);
		//this.remove(0);
	}

	// Copy constructor

	public FunctionalArrayList(FunctionalArrayList copy, Object[] objArrayIn) {
		
		Object[] objArrayIn2 = new Object[objArrayIn.length];
		for (int i = 0; i < objArrayIn.length - 1 ; i++ ) {
			objArrayIn2[i] = objArrayIn[i + 1];
		}
		this.setRestObjectArray(objArrayIn2);
		
	}

	public ReturnObject head() {
		//remember - validation in the ArrayListClass will manage
		//the error message

		return super.get(0);
	}


    public FunctionalList rest() {
		//error validation first
		//Object[] a = returnArrayWithoutHead();
    	//FunctionalArrayList copy = new FunctionalArrayList(this);
    	//copy.remove(0);
    	//this.toStringFull();
    	return new FunctionalArrayList(this, this.getObjectArray());

		//returnArray();
    }

}