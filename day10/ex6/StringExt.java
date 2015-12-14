public class StringExt extends String {
	
	public void printEven() {
		for (int i = 0 ; i < this.length() ; i = i + 2 ) {
			System.out.println(this.charAt(i));
		}
	}
}