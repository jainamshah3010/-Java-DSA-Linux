package ASSG;

import java.util.Scanner;

public class assg2 {
    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a number: ");
    //     int n = sc.nextInt();
    //     boolean ans = isPrime(n);
    //     System.out.println(ans);
    // }
    // static boolean isPrime(int n) {
    //     if(n <= 1) {
    //         return false;
    //     }
    //     int c = 2;
    //     while(c*c <= n) {
    //         if(n % c == 0) {
    //             System.out.println("Not prime because " + c + " is a factor");
    //             return false;
    //         }
    //         c++;
    //     }
    //     System.out.println("Prime because no factors found");
    //     return(c*c > n);
        

        Scanner one = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = one.nextInt();
        Scanner two = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int m = two.nextInt();
        Scanner three = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int o = three.nextInt();
    
        if(n > m && n > o){
            System.out.println(n + " is the largest number");
        } else if(m > n && m > o){
            System.out.println(m + " is the largest number");
        } else{
            System.out.println(o + " is the largest number");
        }
        
    
    } 
}
