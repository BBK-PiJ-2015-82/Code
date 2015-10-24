// power(int, int): Takes a base b and an exponent e from the user, and returns the result of b

int power(int b, int e) {
	int x
	if (e == 0) {
		x = 1;
	} else {
		x = b;
		for (i = 1 ; i < e ; i++) {
			x = x * b;
		}
	}
	return x;
}

//power2(int): Takes an exponent e from the user and returns the result of 2e
//. This method must call the previous
//one to find out the result.

int power2(int userinput){
	//String userinput;
	//e = Integer.parseInt(System.console().readLine("userinput"));
	//println userinput;
	this.userinput = userinput;
	int x = power(2, userinput);
	return x;
}


//binary2decimal(String): Takes from the user a binary number (with digits 0 and 1) and returns the corresponding
//number in decimal (base-10, with digits between 0 and 9). 

int binary2decimal(String binaryinput){
		int digittoincrement;
		int calculateddigit = 0;
		int powerdigit = binaryinput.length() - 1;
		for (int i = 0 ; i < binaryinput.length() ; i++) {
			digittoincrement = Integer.parseInt("" + binaryinput.charAt(i));  // note - this to turn a char into a string, sergio also suggests: new String(c) 
			calculateddigit = calculateddigit + (digittoincrement * power2(powerdigit));
			powerdigit--;

			println(calculateddigit);
		}
	
	
	
	return calculateddigit;

}

// afraid that, to save time I've used some methods that I looked up such as .toString(), .concat(), .reverse()

String decimalToBinary (int decimalInput){
	String binaryOutput = "";
	int moduloNumericalOutput
	String moduloOutput;
	//int startPosition = decimalInput.length() - 1;
	for (;decimalInput >= 1; decimalInput = decimalInput / 2) {

		moduloNumericalOutput = decimalInput % 2;
		moduloOutput = moduloNumericalOutput.toString();
		binaryOutput = binaryOutput.concat(moduloOutput)
		

	}

	
		binaryOutput = binaryOutput.reverse();

	
	return binaryOutput;
}


String z = decimalToBinary(65465);
//int z =  binary2decimal("01010110110");
//int z = power(3,2);
//println(""+power(7,0));



print z;