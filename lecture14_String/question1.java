package lecture14_String;

import java.util.Scanner;

public class question1{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.err.print("Enter Your Name: ");
        String name  = sc.nextLine();

        int count  = 0;
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
            count++;
        }
        System.out.println("Length of String: "  + count);



        // for(String str : name){
        //     count++;
        // }

    }
    
}