

double sizeDown(int userInputint, double height) {
	if (userInputint == 0) {
		return height;
			
	} else {
		println(height);

		return sizeDown(userInputint - 1, height) / 1.414213;

	}




}


double sizeUp(int userInputint, double height) {
	if (userInputint == 1) {
		return height;
	}
	
		return sizeUp(userInputint - 1, height) * 1.414213;
}


String size(int userInputint, char upDown){
	double returnedheight;
	double returnedwidth;
	if (upDown == "u") {
		returnedheight = sizeUp(userInputint, 1189)//.round(0) - some rounding funcntion;
	} else {
		returnedheight = sizeDown(userInputint, 1189);
	}

	returnedwidth = 

	return returnedwidth + " X " + returnedheight;


}

//making assumption that if first char is A then the rest will be numbers, could use additional validation but that's not the point of this exercise really

println("enter size: ");
String userInput = "A00" //System.console().readLine();
if (userInput.charAt(0) != "A") {
	println("incorrect value!")
} else {
	userInput = userInput.substring(1);
}

println(userInput);
int userInputint;
char upDown;

if (userInput.charAt(0) == "0") {
	userInputint = userInput.length();
	upDown = "u";

} else {
	userInputint = Integer.parseInt(userInput);
	upDown = "d";
}

println(userInput);

println(userInputint);

//int userInputint = Integer.parseInt(userInput);
//println(userInputint)






println(size(userInputint, upDown));

//y = 2 * x
//x = x