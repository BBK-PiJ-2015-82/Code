import java.util.*;

public class Trycatchcatch {


	public void test() {

	try {


		List<Integer> intList = new ArrayList<Integer>();
		intList.add(5);
		System.out.println(intList.get(1));

	} catch (Exception ex) {
		ex.printStackTrace();
	} catch (NullPointerException ex) {
		ex.printStackTrace();
	}
}
}