public class MatrixTest{

	public static void main(String[] args) {
	
		
		MatrixNew matrixx = new MatrixNew();
		matrixx.MatrixNew(3,3);
		//matrixx.setElement(2, 2, 99);

		//matrixx.setRow(2, "5,6,7");

		matrixx.setMatrix("3,2,1;2,1,3;7,7,7");
		//System.out.println(matrixx.toString());
		matrixx.prettyPrint();

		//MatrixNew.matrix(7,8);

	}





}