/**2.1 a) Factorial
Write a small program with a method that calculates the factorial of an integer number as seen in the notes.
Is it easy to do this both iteratively and recursively? Try both ways and see which is more natural for you. If
one takes too long, try the other way.


int factorial(int n){
	if (n == 1) {
		return 1;
	} else {
	int x = n * factorial(n - 1);
	return x;
	}

}

int y = factorial(4);
println(y);

**/


int n = 8;
int x, y;

x = n;
while (n > 1) {
	n--;
	x = x * n;
	//x = n * (n - 1);

	
}

println(x);


