




int gcd(int p, int q, int r = q) {


	if ((p % r == 0) && (q % r == 0)) {
		return r;
	} else {

		return gcd(p, q, (r - 1));
	}
}

println("please enter the higher number for GCD: ")
String userInput = System.console().readLine();
int x = Integer.parseInt(userInput);
println("please enter the lower number for GCD: ")
userInput = System.console().readLine();

int y = Integer.parseInt(userInput);

int z = gcd(x, y);
println(z);
