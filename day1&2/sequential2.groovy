// a programme to detect whether sequentially entered numbers go up in the correct sequence

boolean sequential = true
int testSequence, lastEntry, userEntryInt
String userEntry

println "Please enter a number: "
userEntry = System.console().readLine()
lastEntry = Integer.parseInt(userEntry)

println "Please enter a number: "
userEntry = System.console().readLine()
testSequence = Integer.parseInt(userEntry)

if (testSequence > lastEntry) {
	// branch for ascending


	
	while (lastEntry != -1) {
		println "Please enter a number: "
		userEntry = System.console().readLine()
		userEntryInt = Integer.parseInt(userEntry)


		if (userEntryInt < lastEntry && userEntryInt != -1) {
			sequential = false
		}
		lastEntry = userEntryInt;




	}


} else {
	//branch for descending
	while (lastEntry != -1) {
		println "Please enter a number: "
		userEntry = System.console().readLine()
		userEntryInt = Integer.parseInt(userEntry)


		if (userEntryInt > lastEntry && userEntryInt != -1) {
			sequential = false
		}
		lastEntry = userEntryInt;




	}

}


if (sequential == true) {
	println "sequential";
} else {

	println "not sequential"
}