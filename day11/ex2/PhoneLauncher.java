public class PhoneLauncher extends SmartPhone {

	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}

	public void launch() {
		
		Phone myPhone = new SmartPhone();
		  System.out.println(myPhone.getClass());
		myPhone.call("223234234");
		SmartPhone mySmartphone = (SmartPhone) myPhone;
		mySmartphone.browseWeb("Google");
		System.out.println(mySmartphone.findPosition());




		/*
		call("2342345345");
		ringAlarm("8.am");
		playGame("snake");
		last10Numbers[0] = "123";
				last10Numbers[1] = "3737";

		last10Numbers[2] = "1234523453";

		last10Numbers[3] = "127673";

		last10Numbers[4] = "121123423";

		last10Numbers[5] = "001456423";

		last10Numbers[6] = "456546488";
				last10Numbers[7] = "2462";

		last10Numbers[8] = "15838323";

		last10Numbers[9] = "1213453";

		printLastNumbers();

		browseWeb("google");
		System.out.println(findPosition());
		call("001456423");

		call("4564671456423");
		System.out.println(getBrand());
		*/



	}
}
