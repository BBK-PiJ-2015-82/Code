// verify palindrome

String userinput = System.console().readLine()
char searchchar
int j = (userinput.length() - 1);
boolean palindrome = true;

for (i = 0 ; i < userinput.length() ; i++) {

println userinput.charAt(i);
println userinput.charAt(j);


	if (userinput.charAt(i) != userinput.charAt(j)) {
		palindrome = false
		break;
	}

	j--;

}

if (palindrome == false) {
	println("not palindrome");	
} else {

	println("palindrom")
	}
	