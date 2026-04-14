package lecture13_arrays;

import java.util.Scanner;

public class input2D {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of row: ");
        int m = sc.nextInt();
        System.out.print("Enter the length of column: ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        System.out.println("Enter the element of array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum : " + sum);

    sc.close();
    }
    
}
