package ASSG;
import java.util.Arrays;
import java.util.Scanner;
public class ASSG3{
    public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array:");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // for loop 
            // System.out.print("[");
            // for(int i = 0;i < size; i++){
            //     if(i > 0)
            //             System.out.print(",");
            //     System.out.print(arr[i]);


            // }
            // System.out.println("]");
    
            // tostring method
            System.out.println("Using toString method:");
            System.out.println(Arrays.toString(arr));
        }
}