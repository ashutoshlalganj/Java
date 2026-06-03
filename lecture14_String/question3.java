package lecture14_String;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.err.print("Enter your College name: ");
        String collName  = sc.nextLine();

        String rev = "";
        for (int i = collName.length()-1; i >= 0; i--) {
            char ch  = collName.charAt(i);
            rev = rev + ch;

            System.out.print(collName.charAt(i));
        }
        System.out.println();
        System.out.println(rev);
    }
    
}
