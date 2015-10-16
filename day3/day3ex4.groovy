//Write a program that reads a text representing a mathematical operation (one of the four basic ones) with two
//operands, and then execute it. For example, if the user enters “3/5” the program outputs “0.6”; if the user
//enters “23 * 4” the program outputs “92”


// take input

int first, second;
boolean finished = false;
String userinput;
char character;


// see if operand is at position 1

while(!finished) {
	println("please enter an op, max three digits");

	userinput = System.console().readLine();
	character = userinput.charAt(1);

	if (character == "+" || character == "-" || character == "*" || character == "/") {
		 first = Integer.parseInt(userinput.substring(0,1))
		 second = Integer.parseInt(userinput.substring(2))
		 finished = true
		 break;
	} else {
		character = userinput.charAt(2);
	}

	// see if operand is at position 2

	if (character == "+" || character == "-" || character == "*" || character == "/") {
		 first = Integer.parseInt(userinput.substring(0,2))
		 second = Integer.parseInt(userinput.substring(3))
		 finished = true
		 break;
	} else {
		character = userinput.charAt(3);
	}



	if (character == "+" || character == "-" || character == "*" || character == "/") {
		first = Integer.parseInt(userinput.substring(0,3))
		second = Integer.parseInt(userinput.substring(4))
		finished = true
		break;
	} else {
		println "Invalid entry"
	}

}

Double Answer
switch(character) {
	case "*" : Answer = (first * second);
	break;
	case "/" : Answer = (first / second);
	break;
	case "+" : Answer = (first + second);
	break;
	case "-": Answer = (first - second);		
	break;
}

println(Answer)