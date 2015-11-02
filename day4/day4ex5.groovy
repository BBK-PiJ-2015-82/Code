

//establish class

class Point {
	double x;
	double y;

	double distanceTo(Point) {
		return Math.sqrt((this.x - Point.x).power(2) + (this.y - Point.y).power(2));
	}

	double distanceToOrigin() {
		return Math.sqrt((this.x).power(2) + (this.y).power(2));
	}

	void moveTo(double x, double y) {
		this.x = x;
		this.y = y;

	}

	void moveTo(Point) {
		this.x = Point.x;
		this.y = Point.y;
	}

	Point clone() {
		Point newclone = new Point();
		newclone.x = this.x;
		newclone.y = this.y;
		return newclone;
	}

	Point opposite() {
		Point newclone = new Point();
		this.x = -(this.x);
		this.y = -(this.y);
		return newclone;
	}
}




//sustantiate co-ord 1


Point first = new Point();
Point second = new Point();
Point third = new Point();


first.x = 5;
first.y = 10;

second.x = 6;
second.y = 22;

third.x = 8;
third.y = 99;


//double z = first.distanceTo(third);
//double z = first.distanceToOrigin();

//println(first.x + first.y);


first.opposite();



println(first.x + first.y);
//println(newclone.x + newclone.y);



/**
String userinput

println("Enter X co-ord 1: ")
userinput = System.console().readLine();
first.x = Double.parseDouble(userinput);

println("Enter Y co-ord 1: ")
userinput = System.console().readLine();
first.y = Double.parseDouble(userinput);

println("Enter X co-ord 2: ")
userinput = System.console().readLine();
second.x = Double.parseDouble(userinput);

println("Enter Y co-ord 2: ")
userinput = System.console().readLine();
second.y = Double.parseDouble(userinput);

println("Enter X co-ord 3: ")
userinput = System.console().readLine();
third.x = Double.parseDouble(userinput);

println("Enter Y co-ord 3: ")
userinput = System.console().readLine();
third.y = Double.parseDouble(userinput);




**/