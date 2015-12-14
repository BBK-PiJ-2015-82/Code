public class ReturnObjectImpl implements ReturnObject {
	
	Object object;
	ErrorMessage errorMsg;


	public ReturnObjectImpl(Object inputObject, ErrorMessage msg) {
		this.object = inputObject;
	}

	public ReturnObjectImpl(ErrorMessage msg) {
		this.object = null;
		this.errorMsg = msg;
	}

		public boolean hasError() {
			if (object == null) {
				return true;
			} else {
				return false;
			}
		}


	public ErrorMessage getError() {
		return this.errorMsg;



	}


	public Object getReturnValue();

}