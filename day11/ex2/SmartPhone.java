public class SmartPhone extends MobilePhone {
	

	public SmartPhone() {
		super("iPhone");
	}

	

	public void browseWeb(String str) {
		System.out.println(str + " on the internet");
	}

	public String findPosition() {
		String str = "this is your location";
		return str;
	}



	@Override
	public void call(String str) {
		if (str.charAt(0) == '0' && str.charAt(1) == '0') {
			System.out.println("Calling " +  str + " through the internet to save money");
		} else {
			super.call(str);
		}
	}

	public void testPhone(Phone phone) {
		System.out.println(pyhone."Phonnnneee");

	}

	

}