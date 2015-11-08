public class Matrix{




	public Matrix(int x, int y){

		int[][] matrix;
		matrix = new int[x][y];

		for (int i = 0; i < x ; i++) {
			for (int j = 0 ; j < y ; j++) {

				matrix[i][j] = 1;


			}
		}

	}




}