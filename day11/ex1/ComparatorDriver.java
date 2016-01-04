public class ComparatorDriver {
	
	public static void main(String[] args) {

		Comparator<Integer> str = new Comparator<Integer>();
		System.out.println(str.getMax(1, 5));

		Comparator<String> str2 = new Comparator<String>();
		System.out.println(str2.getMax("cat", "dog"));


		Comparator<String> str3 = new Comparator<String>();
		System.out.println(str3.getMax(5.5, 6.7));




	}
}