public class MatrixChecker {


	 int[] matrix;
	 int arrayLength;

	public void Constructor(int x) {
		this.matrix = new int[x];
		this.arrayLength = x;
		
		for (int i = 0; i < x ; i++) {
			this.matrix[i] = 0;
		}


		for (int i = 0; i < x - 1; i++ ) {
			int insertNumber = 2;
			this.matrix[i] = insertNumber;
			insertNumber += 8;
		}

		//System.out.println(this.matrix[2]);


	}

	public void setElement(int x, int y){
		this.matrix[x] = y;
	}

	public int getElement(int x){
		return this.matrix[x];
	}

	public boolean isSymmetrical(int[] arrayInput) {
		boolean innerBoolean = true;
		for (int i = 0; i < arrayInput.length ; i++) {
			int returnCounter = arrayInput.length - 1 - i;
			if (arrayInput[i] != arrayInput[returnCounter]) {
				innerBoolean = false;
			}
		}

		return innerBoolean;

	}

// An matrix is symmetrical if m[i][j] == m[j][i] for any value of i and j.

	public boolean isSymmetrical(int[][] arrayInput) {
		
		boolean innerBoolean = true;

		for (int i = 0; i < arrayInput.length ; i++) {
			for (int j = 0; j < arrayInput.length; j++ ) {
				//int returnCounter = arrayInput.length - 1 - i;
				if (arrayInput[i][j] != arrayInput[j][i]) {
					innerBoolean = false;
				}


			}



			
		}

		return innerBoolean;

	}

// An matrix is triangular if m[i][j] == 0 for any value of i that is greater than j.
	public boolean isTriangular(int[][] arrayInput){
		
		boolean innerBoolean = true;

		for (int j = 0 ; j < arrayInput.length ; j++) {
			for (int i = j + 1; i < arrayInput.length ; i++ ) {
				innerBoolean = (arrayInput[i][j] == 0) ? true : false;
			}



		}
		
		return innerBoolean;


	}


}