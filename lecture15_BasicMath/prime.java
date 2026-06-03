package lecture15_BasicMath;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to how much to you find prime number: ");
        int ans = sc.nextInt();

        int count = 0;
        int num = 2;
        while(count < ans){

            int factor = 0;
            for (int i = 2; i <= Math.sqrt(num); i++){
                if(num%i==0){
                    factor++;
                }
            }
            if(factor==0){
                System.out.println(num+" ");
                count++;
            }
            num++;
        }

            
    }
}
