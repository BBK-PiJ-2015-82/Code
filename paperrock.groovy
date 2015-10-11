// Write a program that reads 2 characters from either the keyboard or a file. The characters are either PP, PR, PS, RP,
// RR, RS, SP, SR, or SS. They correspond to the selections made by 2 players playing the game of rock-paper-scissors.
// Make the program accept inputs until one player’s score is more than 3 points ahead of the other.
// Hint: remember that you can use .substring() to get the elements of a String.


int scoreAhead, oneScore, twoScore
String oneChoice, twoChoice

// start loop

while(scoreAhead > -2  || scoreAhead < 2) {
	
	// take input

	String input
	println "Enter result: "
	input = System.console().readLine()

	// validate input

	if (input != "PP" || input != "PR" || input != "PS" || input != "RR" || input != "RP" || input != "RS" || input != "SS" || input != "SP" || input != "SR" ) {
		println "Please enter a valid entry!"
	}

	oneChoice = input.substring(0, 1)
	twoChoice = input.substring(1)

	if (oneChoice == "P") {
		switch(twoChoice) {
			case "P": oneScore = oneScore ;
			break;
			case "R": oneScore++;
			break;
			case "S": twoScore++;
			break;
		}
	} else if (oneChoice == "R") {
		switch(twoChoice) {
			case "P": twoScore++;
			break;
			case "R": ;
			break;
			case "S": oneScore++;
			break;
		}
	} else if (oneChoice == "S") {
		switch(twoChoice) {
			case "P": oneScore++;
			break;
			case "R": twoScore++;
			break;
			case "S": ;
			break;
		}
	}


	println oneChoice
	println twoChoice

	scoreAhead = oneScore - twoScore

}

if (scoreAhead < -2) {
	println "congratulations player two, you won!"
} else if (scoreAhead > 2) {
	println "congratulations player one, you won!"
}

