public class TestScript {
	
	public static void main(String[] args){
//		Employee emp1 = new Employee();
//		emp1.setname();
//		System.out.println(emp1.getName());
		String[] names;
		//int[] ids;

		names = new String[10];


		System.out.println("names");



		names[0] = System.console().readLine();
		names[1] = System.console().readLine();
		names[2] = System.console().readLine();
		names[3] = System.console().readLine();
		names[4] = System.console().readLine();
		names[5] = System.console().readLine();
		names[6] = System.console().readLine();
		names[7] = System.console().readLine();
		names[8] = System.console().readLine();
		names[9] = System.console().readLine();


		System.out.println("names END");

		int[] ids;
		//int[] ids;

		ids = new int[10];

		ids[0] = Integer.parseInt(System.console().readLine());
		ids[1] = Integer.parseInt(System.console().readLine());
		ids[2] = Integer.parseInt(System.console().readLine());
		ids[3] = Integer.parseInt(System.console().readLine());
		ids[4] = Integer.parseInt(System.console().readLine());
		ids[5] = Integer.parseInt(System.console().readLine());
		ids[6] = Integer.parseInt(System.console().readLine());
		ids[7] = Integer.parseInt(System.console().readLine());
		ids[8] = Integer.parseInt(System.console().readLine());
		ids[9] = Integer.parseInt(System.console().readLine());


		System.out.println("ids END");

		//public void checkIds(int[] ids) {

		for (int i = 0; i < 10 ; i++) {
			//int comp = ids[i];
			if (ids[i] < 1000) {
				System.out.println(names[i]);
				System.out.println(ids[i]);
			
			}
			
		}


		




	}



}