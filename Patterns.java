
package ASSG;
import java.util.Scanner;
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        //pattern1
        // ***
        // ***
        // ***
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

    //}

   // pattern 2
//    *
//    **
//    ***
        // for(int i = 0;i < n; i++){
        //     for(int j = 0;j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //pattern 3
        // for(int i = 1;i <= n; i++){
        //     for(int j = 1;j <= i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        //pattern 4
        // for(int i = 1;i <= n; i++){
        //     for(int j = 1;j <= i; j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        //}

        //pattern 5
        // for(int i = 1;i <= n; i++){
        //     for(int j = 0;j < n-i+1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //pattern 6
        // for(int i = 1;i <= n; i++){
        //     for(int j = 1;j <= n-i+1; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //pattern 7
    //     for(int i = 0;i < n; i++){
    //         //spaces
    //         for(int j = 0;j < n-i-1; j++){
    //             System.out.print(" ");
    //         }
    //         //stars

    //         for(int j = 0;j < 2*i+1; j++){
    //             System.out.print("*");
    //         }
    //         //spaces
    //         for(int j = 0;j < n-i-1; j++){
    //             System.out.print(" ");
    //         }
    //         System.out.println();
            
    //     }
    //     //pattern 8
    //     for(int i = 0;i < n; i++){
    //         //spaces
    //         for(int j = 0;j < i; j++){
    //             System.out.print(" ");
    //         }
    //         //stars

    //         for(int j = 0;j < 2*n - (2*i + 1); j++){
    //             System.out.print("*");
    //         }
    //         //spaces
    //         for(int j = 0;j < i; j++){
    //             System.out.print(" ");
    //         }
    //         System.out.println();
            
    //    }
       
        //pattern 9
//          for(int i = 0;i < n; i++){
//             //spaces
//             for(int j = 0;j < n-i-1; j++){
//                 System.out.print(" ");
//             }
//             //stars

//             for(int j = 0;j < 2*i+1; j++){
//                 System.out.print("*");
//             }
//             //spaces
//             for(int j = 0;j < n-i-1; j++){
//                 System.out.print(" ");
//             }
    
//             System.out.println();

//             for(int i = 0;i < n; i++){
//             //spaces
//             for(int j = 0;j < i; j++){
//                 System.out.print(" ");
//             }
//             //stars

//             for(int j = 0;j < 2*n - (2*i + 1); j++){
//                 System.out.print("*");
//             }
//             //spaces
//             for(int j = 0;j < i; j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
            
//         }
//         }

        //pattern 10
        // for(int i = 1;i <= 2*n-1; i++){
        //     int stars = i;
        //     if(i > n) stars = 2*n - i;
        //     for(int j = 1;j <= stars; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //pattern 11
        // int start = 1;
        // for(int i = 0;i < n;i++){
        //     if(i % 2 == 0) start = 1;
        //     else start = 0;
        //     for(int j = 0;j <= i; j++){
        //         System.out.print(start);
        //         start = 1 - start;
        //     }
        //     System.out.println();
        // }

        //pattern 12
        // int space = 2*(n-1);
        // for(int i = 1;i <= n;i++){
        //     //numbers
        //     for(int j = 1;j <= i; j++){
        //         System.out.print(j);
        //     }
        //     //spaces
        //     for(int j = 1;j <= space; j++){
        //         System.out.print(" ");
        //     }
        //     //numbers
        //     for(int j = i;j >= 1; j--){
        //         System.out.print(j);    

        // }
        // System.out.println();
        // space -= 2;
           
        // }

        //pattern 13
        // int num = 1;
        // for(int i = 1;i <= n;i++){
        //     for(int j = 1;j <= i; j++){
        //         System.out.print(num + " ");
        //         num = num + 1;

        //     }
        //     System.out.println();
        // }
         
        //pattern 14
        // for(int i = 0;i < n; i++){
        //     for(char ch = 'A';ch <= 'A' + i; ch++){
        //         System.out.print(ch);
        //     }
        //     System.out.println();
        // }

        //pattern 15
        // for(int i = 0;i < n; i++){
        //     for(char ch = 'A';ch <= 'A' + n - i - 1; ch++){
        //         System.out.print(ch);
        //     }
        //     System.out.println();
        // }

        //pattern 16
        // for(int i = 0;i <= n; i++){
        //     char ch = (char)('A' + i);
        //     for(int j = 0;j <= i; j++){
        //         System.out.print(ch);
        //     }
        //     System.out.println();
        // }

        //pattern 17
        for(int i = 0;i < n; i++){
            //spaces
            for(int j = 0;j < n-i-1; j++){
                System.out.print(" ");
            }
            //characters
            char ch = 'A';
            for(int j = 0;j < 2*i+1; j++){
                System.out.print(ch);
                if(j < i) ch++;
                else ch--;
            }
            //spaces
            for(int j = 0;j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        //pattern 18
        // for(int i = 1;i <= n; i++){
        //     for(char ch ='A';ch <= 'A' + i + 1 - n; ch++){
        //         System.out.print(ch);
        //     }
        //     System.out.println();
        // }
    }
}
