public class MobilePhone extends OldPhone {
	
	protected String[] last10Numbers = new String[10];

	public MobilePhone(String str) {
		super(str);
		for (int i = 0; i < last10Numbers.length ; i++ ) {
			last10Numbers[i] = "0";
		}

	}



	


	public void ringAlarm(String str) {
		System.out.println("beep beep");

	}

	public void playGame(String str) {
		System.out.println("snake");

	}

	public void printLastNumbers() {
		for (int i = 0; i < last10Numbers.length ; i++ ) {
			System.out.println(last10Numbers[i]);

		}
	}


	@Override
	public void call(String number) {
		for (int i = 0; i < last10Numbers.length ; i++ ) {
			if (last10Numbers[i].equals("0")) {
				last10Numbers[i] = number.toString();
				break;
			} 
		}

		System.out.println("ring ring " + number);

	}
	

	
}