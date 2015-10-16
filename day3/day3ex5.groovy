//establish class

class Point {
	Double x;
	Double y;
}

//sustantiate co-ord 1


Point first = new Point();
Point second = new Point();
Point third = new Point();

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


Double dist12 = Math.sqrt((first.x - second.x).power(2) + (first.y - second.y).power(2));
Double dist13 = Math.sqrt((((first.x - third.x) * (first.x - third.x)) + ((first.y - third.y) * (first.y - third.y))));
Double dist23 = Math.sqrt((((second.x - third.x) * (second.x - third.x)) + ((second.y - third.y) * (second.y - third.y))));

println(dist12);
println(dist13);
println(dist23);

String largest

//largest = ((dist12 >= dist13) && (dist12 >= dist23)) ? "Distance between 1 and 2" : "none";
//largest = ((dist13 >= dist12) && (dist13 >= dist23)) ? "Distance between 1 and 3" : "none";
//largest = ((dist23 >= dist12) && (dist23 >= dist13)) ? "Distance between 2 and 3" : "none";


if (dist12 >= dist13) {
	if (dist23 >= dist12) {
		largest = "dist23";
	} else {
		largest = "dist12";
	}
} else {
	largest = "dist13";
}




println("The largest is the " + largest);



//if (dist12 > dist13) {
//	if (dist23 > dist12) {
//		println(dist23);
//	} else {
//		println(dist12);
//	}
//
//}


//, dist13, dist23
