//establish class

class Point {
	Double x;
	Double y;
}

Point upLeftOne = new Point();
Point downRightOne = new Point();
Point upLeftTwo = new Point();
Point downRightTwo = new Point();


Point third = new Point();

//sustantiate co-ord 1





String userinput;

//first rect

println("Enter X co-ord 1: ");
userinput = System.console().readLine();
upLeftOne.x = Double.parseDouble(userinput);

println("Enter Y co-ord 1: ")
userinput = System.console().readLine();
upLeftOne.y = Double.parseDouble(userinput);

println("Enter X co-ord 2: ")
userinput = System.console().readLine();
downRightOne.x = Double.parseDouble(userinput);

println("Enter Y co-ord 2: ")
userinput = System.console().readLine();
downRightOne.y = Double.parseDouble(userinput);

//second rect

println("Enter X co-ord 1: ");
userinput = System.console().readLine();
upLeftTwo.x = Double.parseDouble(userinput);

println("Enter Y co-ord 1: ")
userinput = System.console().readLine();
upLeftTwo.y = Double.parseDouble(userinput);

println("Enter X co-ord 2: ")
userinput = System.console().readLine();
downRightTwo.x = Double.parseDouble(userinput);

println("Enter Y co-ord 2: ")
userinput = System.console().readLine();
downRightTwo.y = Double.parseDouble(userinput);



class Rectangle {
	Point upLeft;
	Point downRight;

}

Rectangle rect = new Rectangle();

rect.upLeft = upLeftOne;
rect.downRight = downRightOne;

Rectangle rectTwo = new Rectangle();

rectTwo.upLeft = upLeftTwo;
rectTwo.downRight = downRightTwo;



// the point

println("Enter X co-ord 3: ")
userinput = System.console().readLine();
third.x = Double.parseDouble(userinput);

println("Enter Y co-ord 3: ")
userinput = System.console().readLine();
third.y = Double.parseDouble(userinput);

// decide whether it falls within rect one

boolean inone = false;
boolean intwo = false;

inone = (third.x > rect.upLeft.x && third.x < rect.downRight.x && third.y < rect.upLeft.y && third.y > rect.downRight.y) ? true : false;
intwo = (third.x > rectTwo.upLeft.x && third.x < rectTwo.downRight.x && third.y < rectTwo.upLeft.y && third.y > rectTwo.downRight.y) ? true : false;

if (inone == true) {
	if (intwo == true) {
		println("in both");
	} else {
		println("just in one");
	}
} else if (intwo == true) {
	println("just in two");
}





// change to positive

