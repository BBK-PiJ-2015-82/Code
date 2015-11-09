public class Target{




	private int[][][] matrix;
	int xAxis;
	int yAxis;
	int zAxis;

	int numberToGuessX;
	int numberToGuessY;
	int numberToGuessZ;


	//Result result;


	public void Target(int x){

		//int[][] matrix;
		this.matrix = new int[x][x][x];
		this.xAxis = x;
		this.yAxis = x;
		this.zAxis = x;
		//matrix[1][2] = 4;

		//System.out.println(matrix[1][2]);
	}


	public void init(){

		for (int i = 0; i < this.xAxis ; i++) {
			for (int j = 0 ; j < this.yAxis ; j++) {
				for (int k = 0; k < this.zAxis ; k++) {
					this.matrix[i][j][k] = 0;
				}
			}
		}

		this.numberToGuessX = (int) Math.abs(5 * Math.random());
		this.numberToGuessY = (int) Math.abs(5 * Math.random());
		this.numberToGuessZ = (int) Math.abs(5 * Math.random());

		this.matrix[numberToGuessX][numberToGuessY][numberToGuessZ] = 1;

	}

	public Result fire(int x, int y, int z) {
		
		Result result;
		if (this.matrix[x][y][z] == 1) {result = Result.HIT;}
		else if (x < this.numberToGuessX) {result = Result.FAIL_LEFT;}
		else if (x > this.numberToGuessX) {result = Result.FAIL_RIGHT;}
		else if (y > this.numberToGuessY) {result = Result.FAIL_HIGH;}
		else if (y < this.numberToGuessY) {result = Result.FAIL_LOW;}
		else if (z < this.numberToGuessZ) {result = Result.FAIL_SHORT;}
		else if (z > this.numberToGuessZ) {result = Result.FAIL_LONG;}
		else {result = Result.OUT_OF_RANGE;}

		return result;

	}
	
}


/**
	public void setElement(int xIndexToMod, int yIndexToMod, int newValue){

		// validate valid point for positive

		if ((this.xAxis >= 0 && xIndexToMod > this.xAxis) ||
			(this.xAxis < 0 && xIndexToMod < this.xAxis) ||
			(this.yAxis >= 0 && yIndexToMod > this.yAxis) ||
			(this.yAxis < 0 && yIndexToMod < this.yAxis)) {

			System.out.println("invalid value");
		}

		// replace value

		else {

			this.matrix[xIndexToMod][yIndexToMod] = newValue;

		}

		System.out.println(this.matrix[xIndexToMod][yIndexToMod]);
	}

	public void setRow(int x, String input){

		// validate length of string input

		if (((xAxis * 2) - 1) != input.length()) {
			System.out.println("Invalid String row");
		}

		else {

			// replace row - NB, only accepting integers of a single character

			int stringParser = 0;
			System.out.println(input.charAt(stringParser));

			for (int i = 0; stringParser < input.length() ; i++) {
				String stringToParse = "" + input.charAt(stringParser);

				this.matrix[x][i] = Integer.parseInt(stringToParse); // need to find a way to convert to integer here
				stringParser += 2;
				
			}
		}

	}


	public void setColumn(int x, String input){

		// validate length of string input

		if (((yAxis * 2) - 1) != input.length()) {
			System.out.println("Invalid String column");
		}

		else {


			// replace row - NB, only accepting integers of a single character

			int stringParser = 0;
			System.out.println(input.charAt(stringParser));

			for (int i = 0; stringParser < input.length() ; i++) {
				String stringToParse = "" + input.charAt(stringParser);
				this.matrix[i][x] = Integer.parseInt(stringToParse); // need to find a way to convert to integer here
				stringParser += 2;
				
			}

		}

	}

	public String toString(){
		String returnString = "[";
		
		for(int i = 0 ; i < xAxis ; i++ ){
			for (int j = 0; j < yAxis; j++ ) {
				returnString = returnString.concat("" + matrix[i][j]);

				returnString = returnString.concat(",");

			}

			returnString = returnString.substring(0,(returnString.length() - 1));
			returnString = returnString.concat(";");


		}
		
		returnString = returnString.substring(0,(returnString.length() - 1));
		returnString = returnString.concat("]");
		return returnString;
	}

	public void prettyPrint(){
		String returnString = "";

		for(int i = 0 ; i < xAxis ; i++ ){
			returnString = "";

			for (int j = 0; j < yAxis; j++ ) {
				returnString = returnString.concat("" + matrix[j][i]);

				returnString = returnString.concat(" ");

			}

			returnString = returnString.substring(0,(returnString.length() - 1));
			System.out.println(returnString);
			System.out.println('\t');


		}
		
		returnString = returnString.substring(0,(returnString.length() - 1));
	}

	public void setMatrix(String input){

		//assumption that string is correct

		int stringCounter = 0;
		int xIndexToMod = (xAxis < 0) ? xAxis : 0;
		int yIndexToMod = (yAxis < 0) ? yAxis : 0;

		while(stringCounter < input.length()){

			String charFromInput = "" + input.charAt(stringCounter);
				
				if (charFromInput.equals(",")) {
					stringCounter++;
					System.out.println("yes");

				}	else if (charFromInput.equals(";")) {
					yIndexToMod++;
					stringCounter++;
					xIndexToMod = 0;
				 	
				 } else {
				 			System.out.println(charFromInput);

				 this.matrix[xIndexToMod][yIndexToMod] = Integer.parseInt(charFromInput);
				 xIndexToMod++;
				 stringCounter++;

				}


		}

	}
	**/


