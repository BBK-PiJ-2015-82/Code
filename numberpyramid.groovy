int num = 1
int count = 0
println "please enter number"
int numcomplete = Integer.parseInt(System.console().readLine())
int loopCount = 0
while(loopCount < numcomplete) {
	

	while(count < num) {
		print num
		count++
		
	}
	print "\n"
	num++
	count = 0
	loopCount++;
}

