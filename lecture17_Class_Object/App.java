package lecture17_Class_Object;

public class App {
    public static void main(String[] args) {
/*         
        // Default constructor

        Student std = new Student();
        std.id = 1;
        std.name = "Ashu";
        std.age = 23;
        std.nos = 10;

        System.out.println(std.id);
        System.out.println(std.name);
        System.out.println(std.age);
        System.out.println(std.nos);

        std.bunk();
        std.sleep();
        std.study();

*/

 
        // Parameteries Constructor
        Student std = new Student(1, 12, "Ashu", 10);

        // System.out.println(std.id);
        // System.out.println(std.name);
        // System.out.println(std.age);
        // System.out.println(std.nos);



        // Copy Constructor

        Student B = new Student(std);
        System.out.println(B.id);
        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.nos);


    }
}
