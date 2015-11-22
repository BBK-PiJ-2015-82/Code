public class HashUtilities {
	
	public static int shortHash(int hash) {
		return Math.abs(hash % 1000);
	}




	public static void main (String[] args) {

		System.out.println("Give me a string and I will calculate its hash code");
		String str = System.console().readLine();
		int hash = str.hashCode();
		int smallHash = shortHash(hash); 
		System.out.println("0 < " + smallHash + " < 1000");
		

	}
}