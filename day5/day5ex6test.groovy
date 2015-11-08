



int gcd(int p, int q) {
	//if (p == q) {
	//	return p;
	//}
	int r = q;

	println("r" + r)
	println("q" + q)
	println("p" + p)
	

	if (p % q == 0) {
		return q;
	} else if(gcd(p, (q - 1)) == r) {

		return r;
	}

	//else if (p > q) {
	//	return gcd(p, (r - 1));
	//}/ 



}

/**

	else if (q % p == 0) {
		return p;

	} 

	else if (p < q) {
		return gcd(q, (p - 1));
	}

	**/

	


int y = gcd(24, 10);
println(y);