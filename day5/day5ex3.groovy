int fibonacci(int n) {
	if (n == 1 || n == 2) {
		
	}
		int x = fibonacci(n-1) + fibonacci(n-2);

	return x;
	
	

}

int x = fibonacci(8);
println(x);