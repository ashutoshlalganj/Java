package lecture12;

public class method {
    public static int palindrome(int num){
        int ans  = 0;
        while(num>0){
            int rem = num%10;
            ans = ans*10 + rem;
            num /= 10;
        }
       
        return ans;
    }
    public static void main(String[] args){
        method md = new method();

        int num = 121;
        int result = palindrome(num);

        if(num==result){
            System.out.println(result + " is palindrome number.");
        }
        else{
            System.out.println(result + " is not palindrome number.");
        }
    }
}
