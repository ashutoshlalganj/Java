package lecture14_String;

public class basic {
    public static void main(String[] args) {
        // String str = "Ashutosh Kumar";
        // String name = "Ashutosh Kumar";

        // System.out.println(str.charAt(0));
        // System.out.println(str.length());


        // if (str==name) {
        //     System.out.println("Both are equals");
        // } else {
        //     System.out.println("Both are not equals");
        // }


        // if (str.equals(name)) {
        //     System.out.println("Both are equals");
        // } else {
        //     System.out.println("Both are not equals");
        // }


        // if (str.equalsIgnoreCase(name)) {
        //     System.out.println("Both are equals");
        // } else {
        //     System.out.println("Both are not equals");
        // }

// --------------------------------------------------------------------------


        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter your name here: ");
        // String name = sc.nextLine();
        // System.out.println(name);

        //  System.out.print("Enter your college here: ");
        // String college = sc.next();
        // System.out.println(college);


        // String str = " ";
        // System.out.println(str.isBlank());
        // System.out.println(str.isEmpty());

        // String name = " Ashu  ";
        // name = name.trim();
        // System.out.println(name);
        // System.out.println(name.length());



        String str = "Babbar";
        char[] crr = str.toCharArray();

        for(char ch : crr){
            System.out.println("Value of char: " + ch);
        }
    }
}
