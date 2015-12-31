public class SampleableListImpl extends ArrayList implements SampleableList {
	
	public SampleableListImpl(Object[] input) {
		super(input);
	}

	public SampleableListImpl() {
		super();
	}

	public SampleableListImpl(SampleableList input) {
		
	}

	//check 


	public SampleableList sample() {
		//Object[] sampledArray = returnSampledArray();
		return new SampleableListImpl(returnSampledArray());
	}

	//public toSampleableListImpl

}