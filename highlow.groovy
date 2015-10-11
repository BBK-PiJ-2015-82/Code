// guessing number

// generate number

int numberToGuess = Math.abs(1000 * Math.random())

// collect guess 

boolean guessed
int guess
String userInput
String feedback

// start loop here

while(!guessed) {

	// collect guess

	println "enter a guess: "
	userInput = System.console().readLine()
	guess = Integer.parseInt(userInput);
	
	// set whether guess was correct

	if (guess == numberToGuess) {
		guessed = true;
	}
	

	// feedback whether guess is too high or low

	if (guess < numberToGuess) {
		println "Too low"
	} else if (guess > numberToGuess) {
		println "Too high"
	}
		
	
}

println "well done";