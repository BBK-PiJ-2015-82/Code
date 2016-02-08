import java.util.*;
import java.lang.*;

public class PrimeDivisorList extends Object {
	
	List<Integer> intList;

	public PrimeDivisorList() {
		super();
		intList = new LinkedList<Integer>();
	}

	public void add() throws NullPointerException, IllegalArgumentException {
				System.err.println("here");
		Scanner sc = new Scanner(System.in);
		String anInt = new String(sc.nextString());
		if (sc != "") {
			throw new NullPointerException("Null input not allowed");
		}
		int anInt = (int) Integer.parseInt(sc);

		if (anInt % 2 == 0) {
			throw new IllegalArgumentException("Odd numbers not allowed");
		}
		intList.add(anInt);
		System.err.println("here");

	}

	//@Override
	public void toStringNew() {
		for (Integer i : intList) {
			System.out.println((int) i);
		}
	}
	

	public static void main(String[] args) {
		PrimeDivisorList pdl = new PrimeDivisorList();

		Scanner sc = new Scanner(System.in);

		pdl.add();

	}
}