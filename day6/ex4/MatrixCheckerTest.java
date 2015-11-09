public class MatrixCheckerTest{

	public static void main(String[] args) {
	
		
		MatrixChecker matrixx = new MatrixChecker();

		matrixx.Constructor(8);
		System.out.println(matrixx.arrayLength);

		//System.out.println(matrixx.length);
		matrixx.setElement(2,44);
		System.out.println(matrixx.getElement(2));


		int[] newArray = new int[4];
		newArray[0] = 1;
		newArray[1] = 2;
		newArray[2] = 2;
		newArray[3] = 1;

		int[][] newArrayy = new int[2][2];
		newArrayy[0][0] = 1;
		newArrayy[0][1] = 4;
		newArrayy[1][0] = 0;
		newArrayy[1][1] = 5;


		//for (int i = 0; i < newArray.length - 1; i++ ) {
	//		int insertNumber = 2;
		//	newArray[i] = insertNumber;
			
	//	}


	//	System.out.println(matrixx.isSymmetrical(newArray));
		System.out.println(matrixx.isSymmetrical(newArrayy));
		System.out.println(matrixx.isTriangular(newArrayy));


		
		//matrixx.MatrixNew(3,3);
		//matrixx.setElement(2, 2, 99);

		//matrixx.setRow(2, "5,6,7");

		//matrixx.setMatrix("3,2,1;2,1,3;7,7,7");
		//System.out.println(matrixx.toString());
		//matrixx.prettyPrint();

		//MatrixNew.matrix(7,8);

	}





}