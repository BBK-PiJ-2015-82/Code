public class ArrayCopierMain {
	

	public static void main(String[] args) {


		//System.out.println(ArrayCopier.)

		int j = 2;

		int[] anArrayOfInts = new int[10];
		int[] anotherArrayofInts = new int[7];

		for (int i = 0; i <= 9; i++) {
			anArrayOfInts[i] = j;
			j += 2;
		}



		for (int i = 0; i <= (anotherArrayofInts.length - 1); i++) {
			anotherArrayofInts[i] = j;
			j += 3;
		}

		ArrayCopier.copy(anArrayOfInts, anotherArrayofInts);

		for (int i = 0; (i <= anotherArrayofInts.length - 1) ; i++ ) {
			System.out.println(anotherArrayofInts[i]);
		}

	

	}





}