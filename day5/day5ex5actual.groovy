
//String userinput = System.console().readLine();
//boolean isPalindrome = true;
//	boolean methodComplete = true;

int pow(int base, int exponent) {
	if (exponent == 0) {
		return 1;
	} 

	int total = base * pow(base, (exponent - 1))
	return total;
	
}

int y = pow(3, 3);
println(y);