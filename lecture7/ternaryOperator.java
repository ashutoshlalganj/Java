package lecture7;

public class ternaryOperator {
    public static void main(String[] args) {
        int streakDays = 34;

        String status = (streakDays >= 30) ? "Consistent" : "Irregular";
        System.out.println(status);
    }
    
}
