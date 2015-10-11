// pi

// collect n to calculate pi to

String userInput
int n = Integer.parseInt(System.console().readLine("userInput"));

// set pi

float pi
int divider = 1
int count = 1
boolean posfrac = true

// pi = (4 / divider) - (4 / (divider + 2)) + (4 / (divider + 4))

// first calculation
pi = (4 / divider)


// start a while loop to do next fraction and so on

while(count <= n) {

	// put up divider

	divider = divider + 2

	// if last fraction was positive make next negative

	if (posfrac == true ) {
		pi = (pi - (4 / divider))
		posfrac = false;

	// if last fraction was negative make next positive

	} else if (posfrac == false) {
		pi = (pi + (4 / divider))
		posfrac = true;

	}

	count++;
}

println pi