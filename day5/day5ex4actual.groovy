
//String userinput = System.console().readLine();
//boolean isPalindrome = true;
//	boolean methodComplete = true;

boolean palindrome(String palindromeInput, int n = 0, boolean innerisPalindrome = true) {

	String innerPalindromeInput = palindromeInput
	char evalChar = innerPalindromeInput.charAt(n);
	char evalAgainstChar = innerPalindromeInput.charAt(innerPalindromeInput.length() - n - 1)
	println(n)
	if (n == innerPalindromeInput.length() - 1) {
		return true;
		
	} else {
		if (evalChar != evalAgainstChar || (palindrome(innerPalindromeInput, n + 1, innerisPalindrome))) {
			innerisPalindrome = false;

		}

	}
	return innerisPalindrome;
}

boolean y = palindrome("qwertyterewq");
println(y);