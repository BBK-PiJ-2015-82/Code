
println("Enter borrowed amount: ")
int totalAmountBorrowed = Integer.parseInt(System.console().readLine());

println("Enter number of years to pay back: ")
int yearsToPayBack = Integer.parseInt(System.console().readLine());

println("Enter interest rate: ")
Double InterestRate = Double.parseDouble(System.console().readLine());

Double t = totalAmountBorrowed * (1 + (InterestRate / 100));

println("The total amount to be paid over the lifetime is " + yearsToPayBack)

