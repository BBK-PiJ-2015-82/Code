//Write a program that reads some text from the user and then writes the same text on screen, but each letter on a
//different line.
//Now modify your program to write each word (as defined by spaces) rather than letter on a different line.

println("enter word: ");
String userinput = System.console().readLine();
char character;
String word;
int i;

//outer loop to loop through string

for (i = 0 ; i < userinput.length() ; i++ ) {
	
	character = userinput.charAt(i);
	
	if (character == " ") {
		println("");
	} else {
		print(character);
	}

}

