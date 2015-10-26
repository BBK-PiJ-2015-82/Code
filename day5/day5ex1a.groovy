/** a)
What number would the following method print on screen if you called printNumbers(6)?

void printNumbers(int n) {
if (n <= 0) {
return;
}
printLine(n);
printNumbers(n-2);
printNumbers(n-3);
printLine(n);
}

Do this exercise on paper. Then add this method to a Java Decaf program and check your answer.

6, 4, 3, 6 

void printNumbers(int n) {
    if (n <= 0) {
    return;
    }
    println(n);
    printNumbers(n-2);
    printNumbers(n-3);
    println(n);
}

int x = printNumbers(6);
println(x);

**/

String buggyMethod(int n) {
if (n <= 0) {
return "";
}
return n + " " + buggyMethod(n - 2);
}



String x = buggyMethod(7);
println(x);