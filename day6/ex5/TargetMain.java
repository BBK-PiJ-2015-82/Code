public class TargetMain {
	

	public static void main(String[] args) {

		Target plane = new Target();
		plane.Target(5);
		plane.init();
		Result result = null;
		while (result != Result.HIT) {


			System.out.println("enter x co-ord: ");

			String userInput = System.console().readLine();
			int x = Integer.parseInt(userInput);


			System.out.println("enter y co-ord: ");
			userInput = System.console().readLine();

			int y = Integer.parseInt(userInput);

			System.out.println("enter z co-ord: ");
			userInput = System.console().readLine();

			int z = Integer.parseInt(userInput);
			result = plane.fire(x,y,z);
			System.out.println(result);
		
		}

	}






}