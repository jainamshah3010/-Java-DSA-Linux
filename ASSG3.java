package ASSG;
import java.util.Arrays;
import java.util.Scanner;
public class ASSG3{
    public static void main(String[] args) { 
    //    Scanner sc = new Scanner(System.in);
    //      System.out.println("Enter the size of the array:");
    //         int size = sc.nextInt();
    //         int[] arr = new int[size];
    //         System.out.println("Enter the elements of the array:");
    //         for (int i = 0; i < size; i++) {
    //             arr[i] = sc.nextInt();
    //         }

    //         // for loop 
    //         // System.out.print("[");
    //         // for(int i = 0;i < size; i++){
    //         //     if(i > 0)
    //         //             System.out.print(",");
    //         //     System.out.print(arr[i]);


    //         // }
    //         // System.out.println("]");
    
    //         // tostring method
    //         System.out.println("Using toString method:");
    //         System.out.println(Arrays.toString(arr));
    
            //2d array input
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows:");
            int rows = sc.nextInt();
            System.out.println("Enter the number of columns:");
            int cols = sc.nextInt();
            int[][] arr = new int[rows][cols];
            System.out.println("Enter the elements of the 2D array:");
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    arr[i][j] = sc.nextInt();
                }
                //output
            }
            // for(int row = 0; row < rows; row++){
            //     System.out.println(Arrays.toString(arr[row]));

            // }
            // enhanced for loop
            for(int[] row : arr){
                System.out.println(Arrays.toString(row));
            }

    }
}