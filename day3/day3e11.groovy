//Write a program that reads some text from the user and then says how many letters ’e’ are there in that text.
//Then modify the program so that it reads the text from the user and then asks for a letter. The program should
//then say how many times you can find the letter in the text.


println("enter word: ");
String userinput = System.console().readLine();
char character, repeatchar;
String word;
int i, count, countsearched;
//boolean a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
boolean repeated = false;
Class Searchedletter {
	boolean searched;
}

while(!repeated) {
	
	println("enter char to search: ");

	String charactersearch = System.console().readLine("userinput");

	//outer loop to loop through string

	for (i = 0 ; i < userinput.length() ; i++ ) {
		
		character = userinput.charAt(i);
		
		if (character == charactersearch) {
			count++;
		}

	}

	println("There were " + count + " instances of the letter " + charactersearch);
	count = 0;



	// set loop for the repetition, put true flag on the boolean letter just searched for 

	for (j = 0 ; j = true ; j++ ) {

			repeatchar = 
			j = charactersearch

			
		}




}

