//Write a program that reads a short string and then some longer text. The program must say how many times you
//can find the short string in the text. You cannot use any method of String apart from charAt() and length().



println("enter word: ");
String userinput = System.console().readLine();
char character, characterinner, charcompare;
String word;
int count, i, index;
println("enter text to search: ");
String textsearch = System.console().readLine("userinput");
int textsearchcount;
//char firstchar = textsearch.charAt

//outer loop to loop through string

for (i = 0 ; i < userinput.length() ; i++ ) {
	
	// reset character each outer loop

	character = userinput.charAt(i)
	index = i;

	// decide whether to enter inner loop based on potential first letter of text

	if (character == textsearch.charAt(0)) {

		// inner loop to analyse if the next letter and so on is correct

		for (j = 0 ; j < textsearch.length() ; j++ ) {
		//for (int j = 0 ; (characterinner == charcompare) ; j++ ) {

			characterinner = textsearch.charAt(j)
			charcompare = userinput.charAt((index + j))


		// condition to add to count
			if ((j + 1) == textsearch.length()) {
				textsearchcount++;
			}

			
		}
	}
}

println("There were " + textsearchcount + " instances of the text " + textsearch + " in your larger text")

