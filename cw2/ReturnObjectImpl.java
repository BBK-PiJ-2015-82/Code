public class ReturnObjectImpl implements ReturnObject {
	
	Object object;
	ErrorMessage errorMsg;


	public ReturnObjectImpl(Object inputObject) {
		this.object = inputObject;
		errorMsg = ErrorMessage.NO_ERROR;
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


	public Object getReturnValue() {

		if (errorMsg == ErrorMessage.NO_ERROR) {
			return this.object;
		} else {
			return null;

		}

		}

}