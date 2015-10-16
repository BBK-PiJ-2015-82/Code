//establish class

class Point {
	Double x;
	Double y;
}

Point upLeft = new Point();
Point downRight = new Point();


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

println(rect.downRight.x - rect.upLeft.x);
println(rect.upLeft.y - rect.downRight.y);

println((2 * ((rect.downRight.x - rect.upLeft.x) + (rect.upLeft.y - rect.downRight.y))));
println((rect.downRight.x - rect.upLeft.x) * (rect.upLeft.y - rect.downRight.y));