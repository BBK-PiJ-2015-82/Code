//int discSize;
//int pillar;
int x;

int moves(int n) {
 if (n == 1) {
	return 1; 	
 } else {
	x = (2 * moves(n-1)) + 1;

 }

 return x;
}



int y = moves(6);
println(y);



/**
int 

n = 2 x (n-1) + 1

	
 1 1
 2 3 = 2
 3 7 = 4
 4 15 = 8
 5 31 = 16
 6 63 = 32

 x = 




 1 b
 2 c
 1 c
 3 b
 1 a
 2 b
 1 b
 4 c
 1 c
 2 a
 1 a
 3 c
 1 b
 2 c
 1 c
 **/