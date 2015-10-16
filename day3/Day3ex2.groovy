//Write a program that reads two numbers from the user and then offers a menu with the four basic operations:
//addition, subtraction, multiplication, and division. Once the user has selected an operation from the menu, the
//calculator performs the operation.
//Hint: In the same way that there exists an Integer.parseInt() method to parse integers, there is a Double.parseDouble()
//method to parse real numbers.

//capture numbers and operation
String input;
println "Please enter number 1: ";
input = System.console().readLine();
double n1 = Double.parseDouble(input);
println "Please enter number 2: ";
input = System.console().readLine();
double n2 = Double.parseDouble(input);
println n1
println n2
String answer
println "Which operation?: ";
answer = System.console().readLine(input)
switch (answer) {
	case "Multiply": println (n1 * n2);
	break;
	case "Divide": println (n1 / n2);
	break;
	case "Add": println (n1 + n2);
	break;
	case "Minus": println (n1 - n2);
	break;
	
	
}
