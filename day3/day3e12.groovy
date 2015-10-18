//Write a program that reads the total cost of a purchase and an amount of money that is paid to buy it. Your
//program should output the correct change specifying the amount of notes (50, 20, 10, 5) and coins (2, 1, 0.50, 0.20,
//0.10, 0.05, 0.02, 0.01) needed.


println("enter sale: ");
String userinput = System.console().readLine();
Double amount = Double.parseDouble(userinput);
println("enter tender: ");
userinput = System.console().readLine();
Double tender = Double.parseDouble(userinput);
Double change = (tender - amount);
Double changeremaining = change;
class Increment {
	Double value
	int quantity
	String name
}

Increment fiftypounds = new Increment();
Increment twentypounds = new Increment();
Increment tenpounds = new Increment();
Increment fivepounds = new Increment();
Increment twopounds = new Increment();
Increment onepound = new Increment();
Increment fiftypence = new Increment();
Increment twentypence = new Increment();
Increment tenpence = new Increment();
Increment fivepence = new Increment();
Increment twopence = new Increment();
Increment onepence = new Increment();

 fiftypounds.name = "fiftypounds note";
 twentypounds.name = "twnentypiunds nnote";


println changeremaining;

for (i = 0 ; changeremaining > 0.009 ; i++ ) {
	println changeremaining;
	println fiftypounds.quantity;
	if (changeremaining > 50) {
		fiftypounds.quantity++
		changeremaining = changeremaining - 50;				
	} else if (changeremaining > 20) {
		twentypounds.quantity++
		changeremaining = changeremaining - 20;				
	}	else if (changeremaining > 10) {
		tenpounds.quantity++
		changeremaining = changeremaining - 10;				
	} else if (changeremaining > 5) {
		fivepounds.quantity++
		changeremaining = changeremaining - 5;				
	} else if (changeremaining > 2) {
		twopounds.quantity++
		changeremaining = changeremaining - 2;				
	} else if (changeremaining > 1) {
		onepound.quantity++
		changeremaining = changeremaining - 1;				
	} else if (changeremaining > 0.5) {
		fiftypence.quantity++
		changeremaining = changeremaining - 0.5;				
	} else if (changeremaining > 0.2) {
		twentypence.quantity++
		changeremaining = changeremaining - 0.20;				
	} else if (changeremaining > 0.1) {
		tenpence.quantity++
		changeremaining = changeremaining - 0.1;				
	} else if (changeremaining > 0.05) {
		fivepence.quantity++
		changeremaining = changeremaining - 0.05;				
	} else if (changeremaining > 0.02) {
		fiftypounds.quantity++
		changeremaining = changeremaining - 0.02;				
	} else if (changeremaining > 0.01) {
		fiftypounds.quantity++
		changeremaining = changeremaining - 0.01;				
	} else {
		break;
	}

	i = changeremaining;
		
	
}

println "change is " + fiftypounds.quantity + " " + fiftypounds.name
