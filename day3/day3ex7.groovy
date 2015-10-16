//establish class

class Point {
	Double x;
	Double y;
}

Point upLeft = new Point();
Point downRight = new Point();
Point third = new Point();

//sustantiate co-ord 1





String userinput;

println("Enter X co-ord 1: ");
userinput = System.console().readLine();
upLeft.x = Double.parseDouble(userinput);

println("Enter Y co-ord 1: ")
userinput = System.console().readLine();
upLeft.y = Double.parseDouble(userinput);

println("Enter X co-ord 2: ")
userinput = System.console().readLine();
downRight.x = Double.parseDouble(userinput);

println("Enter Y co-ord 2: ")
userinput = System.console().readLine();
downRight.y = Double.parseDouble(userinput);



class Rectangle {
	Point upLeft;
	Point downRight;

}

Rectangle rect = new Rectangle();

rect.upLeft = upLeft
rect.downRight = downRight



// the point

println("Enter X co-ord 3: ")
userinput = System.console().readLine();
third.x = Double.parseDouble(userinput);

println("Enter Y co-ord 3: ")
userinput = System.console().readLine();
third.y = Double.parseDouble(userinput);

// decide whether it falls within the rect

if (third.x > rect.upLeft.x && third.x < rect.downRight.x && third.y < rect.upLeft.y && third.y > rect.downRight.y) {
	println("point is in Rectangle");
} else {
	println("point not in rect")
};

// change to positive

