package ASSG;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ASSG4 {
     public static void main(String[] args) {
        int[] nums = {};
        int target = 50;

        int result = linearSearch(nums, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
     }

     static int linearSearch(int[] arr, int target) {
        //  if (arr.length == 0) {
        //      return -1; // Return -1 if the array is empty
        // }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i; // Return the index if the target is found
                }
            }
            return -1; // Return -1 if the target is not found

        } 
}

    

