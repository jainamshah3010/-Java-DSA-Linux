import java.util.Scanner;
public class basicmath{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    //1 count digits
    // count(n);
    // }
    
    // static int count(int n){
    //     int count = 0;
    //     while(n > 0){
           
    //         count = count + 1;
    //         n = n / 10;
    //     }
    //     System.out.println("Total digits: " + count);
    //     return count;

    // revrse a number
   
    // int revnum = 0;
    // while(n > 0){
    //     int r = n % 10;
    //     revnum = revnum * 10 + r;
    //     n = n / 10;

    // }
    // System.out.println("Reversed number: " + revnum);

    //palindrome number

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

        //armstrong number
        // // Scanner sc = new Scanner(System.in);
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

        //print all divisors of a number
    //     printDivisors(n);
    // static void printDivisors(int n) {
    //     System.out.print("Divisors of " + n + " are: ");
    //     for (int i = 1; i <= n; i++) {
    //         if (n % i == 0) {
    //             System.out.print(i + " ");
    //         }
    //     }
    //     System.out.println();
    }
}