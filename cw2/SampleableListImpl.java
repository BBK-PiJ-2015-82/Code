public class SampleableListImpl extends ArrayList implements SampleableList {
	
	public SampleableListImpl(Object[] input) {
		super(input);
	}

	public SampleableListImpl() {
		super();
	}

	@Override
	public SampleableList sample() {
		return new SampleableListImpl(returnSampledArray());
	}
}