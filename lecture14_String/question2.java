package lecture14_String;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.err.print("Enter your College name: ");
        String collName  = sc.nextLine();

        int count  = 0;
        for (int i = 0; i < collName.length(); i++) {
            char ch  = collName.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' || ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
                count++;
            }
        }
        System.out.println(count);
    }
}
