//Write a program that reads some text from the user and then says how many letters ’e’ are there in that text.
//Then modify the program so that it reads the text from the user and then asks for a letter. The program should
//then say how many times you can find the letter in the text.


println("enter word: ");
String userinput = System.console().readLine();
char character;
String word;
int i, count;
println("enter char to search: ");
String charactersearch = System.console().readLine("userinput");

//outer loop to loop through string

for (i = 0 ; i < userinput.length() ; i++ ) {
	
	character = userinput.charAt(i);
	
	if (character == charactersearch) {
		count++;
	}

}

println("There were " + count + " instances of the letter " + charactersearch)

