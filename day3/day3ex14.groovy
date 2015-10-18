// verify palindrome

String userinput = System.console().readLine()
char searchchar
int j = (userinput.length() - 1);
boolean palindrome = true;
print(userinput);

for (i = j ; i >= 0 ; i--) {

print(userinput.charAt(i));


	//if (userinput.charAt(i) != userinput.charAt(j)) {
	//	palindrome = false
	//	break;
	//}


}

if (palindrome == false) {
	println("not palindrome");	
} else {

	println("palindrom")
	}
	