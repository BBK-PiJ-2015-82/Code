public class Comparator<T> extends Comparable<T>> {

	public T getMax(T n, T m) {
		
		int i = n.compareTo(m);
		if (i > 0) {
			return n;
		} else {
			return m;
		}
/*
		if (n.compareTo(m) > 0) {
			return n;
		} else {
			return m;
		}

		*/

/*		if (n < m) {
			return n;
		} else {
			return m;
		}*/
	}


	/*
	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}
	public String getMax(String number1, String number2) {
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		if (n1 > n2) {
			return number1;
		} else {
			return number2;
		}
	}*/
}