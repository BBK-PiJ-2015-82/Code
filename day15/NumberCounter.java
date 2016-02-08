import java.util.*;

public class NumberCounter {
	
	List<Integer> numbers;
	int indexCounter;
	int arraySize;

	public NumberCounter(int n) {
		numbers = new ArrayList<Integer>(n);
		indexCounter = -1;
		arraySize = n;

	}

	public void getInts() {

		while (indexCounter != arraySize - 1) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter an integer");
				numbers.add(sc.nextInt());
				indexCounter++;

			} catch (NumberFormatException ex) {
				System.err.println("Not an int!!");
			}
		}

	}

	public void returnResult() {
		int result = 0;
		for (int i = 0; i < arraySize ; i++) {
			result = result + numbers.get(i);
		}

		System.out.println(new Double((double) result / (double) arraySize));
	}

	public static void main(String[] args) {

		NumberCounter numberCounter = new NumberCounter(3);
		numberCounter.getInts();
		numberCounter.returnResult();

	}

}