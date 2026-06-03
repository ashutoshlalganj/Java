package lecture18_Encapsulation;

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
        Student std = new Student(1, 12, "Rahul", 10, "Teena");

        System.out.println(std.getAge());
        std.setAge(25);
        System.out.println(std.getAge()); 



        //System.out.println(std.getName());

        //System.out.println(std.id); 
        //System.out.println(std.name);
        //System.out.println(std.age);
        //System.out.println(std.nos);
        //System.out.println(std.gf);


        //std.bunk();
        //std.sleep();
        //std.study();



        // Copy Constructor

        // Student B = new Student(std);
        // System.out.println(B.id);
        // System.out.println(B.name);
        // System.out.println(B.age);
        // System.out.println(B.nos);


    }
}

