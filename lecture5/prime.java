package lecture5;

import java.util.Scanner;

public class prime{

    public static void primeNumber(int ans){
        System.out.print("Prime No : ");

        int num = 2;
        int count  = 0;
        while (count < ans) { 
            int factor = 0;
            for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                factor++;
            } 
        }
        if(factor==0){
            System.out.print(num + " ");
            count++;
        }
        num++;
            
        }
        System.out.println();
        
     
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to find the prime number: ");
        int ans = sc.nextInt();
   
        primeNumber(ans);

        sc.close();
        
        

    }
}
