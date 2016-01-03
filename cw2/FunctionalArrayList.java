public class FunctionalArrayList extends ArrayList implements FunctionalList {

	public FunctionalArrayList() {
		super();
	}

	public FunctionalArrayList(Object[] a) {
		super(a);
	}

	public FunctionalArrayList(FunctionalArrayList copy, Object[] objArrayIn) {
		Object[] objArrayIn2 = new Object[objArrayIn.length];
		for (int i = 0; i < objArrayIn.length - 1 ; i++ ) {
			objArrayIn2[i] = objArrayIn[i + 1];
		}
		this.setRestObjectArray(objArrayIn2);
	}

	@Override
	public ReturnObject head() {
		return super.get(0);
	}

	@Override
    public FunctionalList rest() {
	   	return new FunctionalArrayList(this, this.getObjectArray());
    }

}