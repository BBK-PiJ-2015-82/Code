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

	@Override
	public boolean hasError() {
		if (object == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ErrorMessage getError() {
		return this.errorMsg;
	}

	@Override
	public Object getReturnValue() {
		if (errorMsg == ErrorMessage.NO_ERROR) {
			return this.object;
		} else {
			return null;
		}
	}
}