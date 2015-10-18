// verify palindrome

String userinput = System.console().readLine()
char searchchar
int j = (userinput.length() - 1);
boolean palindrome = true;
boolean lettercheck = false;
boolean lettercheckj = false;
char checkingchari, checkingcharj;
String lowercaseinput;
int setkloop = (userinput.length() - 1);

for (i = 0 ; i < userinput.length(); i++) {

	lettercheck = false;

	// check if i is valid latter

	checkingchari = userinput.charAt(i);
	lettercheck = Character.isLetter(checkingchari);

	// if true, check against j

	if (lettercheck == true) {

		// start a loop to keep going until j finds a letter

		lettercheckj = false		

		for (setkloop ; lettercheckj == false ; setkloop-- ) {

			//println"in k loop";
			//println
			checkingcharj = userinput.charAt(setkloop)
			lettercheckj = Character.isLetter(checkingcharj);


		}

		// lettercheckj has passed,  make both a lowercase letter

		checkingchari = Character.toLowerCase(checkingchari);
		checkingcharj = Character.toLowerCase(checkingcharj);

		//println("1" + checkingcharj);
		//println("1" + checkingchari);
		println(setkloop);
		
		// validate if they are the same

		if (checkingchari != checkingcharj) {
			palindrome = false;
			
		}

		//println("2" + checkingcharj);
		//println("2" + checkingchari);

		

	}
}

if (palindrome == false) {
	println("not palindrome");	
} else {

	println("palindrom")
	}
	