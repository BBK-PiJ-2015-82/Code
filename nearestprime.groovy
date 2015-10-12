// nearest prime number to a selection

int count = 1
int count2 = 2
int topNum = 2
boolean isNotPrime = false

while (count <= 10000) {
	while (count2 < topNum) {

		
		if ((topNum % count2) == 0) {
			isNotPrime = true;
		}

		
		
	count2++;

	}

	if (isNotPrime == false) {
			println topNum
			count++;
		}
	isNotPrime = false
	topNum++
	count2 = 2;

}
