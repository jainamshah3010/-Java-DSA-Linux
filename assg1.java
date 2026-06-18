package ASSG;

import java.util.Scanner;
public class assg1 {
    public static void main(String[] args) {

       // 1. Write a program to print whether a number is even or odd, also take input from the user.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter A Number: ");
        // int num = sc.nextInt();
        // if(num % 2 == 0){
        //     System.out.println("The number is even.");
        // } else{
        //     System.out.println("The number is odd.");
        // }

        //2. Take name as input and print a greeting message for that particular name.

        // Scanner name = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String intro = name.nextLine();
        // System.out.println("Hello " + intro + ", Welcome to visual code!");



        //3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

        // Scanner principal = new Scanner(System.in);
        // System.out.print("Enter the principal amount: ");
        // int p = principal.nextInt();
        // System.out.print("Enter the rate of interest: ");
        // int r = principal.nextInt();
        // System.out.print("Enter the time in years: ");
        // int t = principal.nextInt();
        // int si = (p * r * t) / 100;
        // System.out.println("The simple interest is: " + si);
    

        // 4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)


        // try (Scanner sc = new Scanner(System.in)) {
        //     System.out.print("Enter the first number: ");
        //     int a = sc.nextInt();
        //     System.out.print("Enter the second number: ");
        //     int b = sc.nextInt();
        //     sc.nextLine();
        //     System.out.print("Enter the operator (+, -, *, /): ");
        //     String op = sc.nextLine();

        //     int sum = a + b;
        //     int diff = a - b;
        //     int product = a * b;
        //     int quotient = a / b;

        //     if (op.equals("+")) {
        //         System.out.println("The sum of two numbers is:" + sum);
        //     } else if (op.equals("-")) {
        //         System.out.println("The difference of two numbers is:" + diff);
        //     } else if (op.equals("*")) {
        //         System.out.println("The product of two numbers is:" + product);
        //     } else if (op.equals("/")) {
        //         System.out.println("The quotient of two numbers is:" + quotient);
        //     } else {
        //         System.out.println("Invalid operator.");
        //     }
        // }


        // 5. Take 2 numbers as input and print the largest number.        


        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the first number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter the second number: ");
        // int b = sc.nextInt();

        // if (a > b) {
        //     System.out.println("The first number is greater than the second number.");
        // } else if (a < b) {
        //     System.out.println("The second number is greater than the first number.");
        // } else {
        //     System.out.println("Both numbers are equal.");
        // }
    
        // 6. Input currency in rupees and output in USD.

        // Scanner inr = new Scanner(System.in);
        // System.out.print("Enter the amount in INR: ");
        // double inrAmount = inr.nextDouble();
        // double usdAmount = inrAmount / 94.50;
        // System.out.println("The amount in USD is: " + usdAmount); 


        // 7. To calculate Fibonacci Series up to n numbers.

        // Scanner fnum = new Scanner(System.in);
        // System.out.print("Enter number of series: ");
        // int n = fnum.nextInt();
        // int num1 = 0;
        // int num2 = 1;

        // for (int i = 1; i <= n; ++i) {
        //     System.out.print(num1 + " ");
        //     int nextNum = num1 + num2;
        //     num1 = num2;
        //     num2 = nextNum;
        // }
        

       // 8.  To find out whether the given String is Palindrome or not.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Your String: ");
        // String str = sc.next();
        // String myobj = str;  //myobj is variable to compare with rev string

        // String rev = "";

        // int len = str.length();

        // for (int i = len - 1; i >= 0; i--) {
            
        //     rev = rev + str.charAt(i);

        // }
        // if (myobj.equals(rev)) {
        //     System.out.println("The string is a palindrome.");
        // } else {
        //     System.out.println("The string is not a palindrome.");
        // }

            // 9. To find Armstrong number or not.
            
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter A Number ");
        // int num = sc.nextInt();
        // int temp = num;
        // int r, sum = 0;

        // while(temp>0){
        //     r = temp % 10;
        //     temp = temp / 10;
        //     sum = sum + r*r*r;
        // }

        // if (num == sum) {
        //     System.out.println("The number is an Armstrong number.");
        // } else {
        //         System.out.println("The number is not an Armstrong number.");
        // }
        

    }
}