public class MatrixChecker {

	int[] matrix;
	int arrayLength;

	public void Constructor(int x) {
		this.matrix = new int[x];


	}




	public boolean isSymmetrical(int[] arrayInput) {
		boolean innerBoolean = true;
		for (int i = 0; i < arrayInput.length ; i++) {
			int returnCounter = arrayInput.length - i;
			if (arrayInput[i] != arrayInput[returnCounter]) {
				innerBoolean = false;
			}
		}
		return innerBoolean;

	}


}