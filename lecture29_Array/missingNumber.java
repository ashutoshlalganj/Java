package lecture29_Array;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i]; 
        }
        int n = arr.length+1;
        int total = (n*(n+1))/2;
        int missing = total - sum;
        System.out.println("Missing number is : "+missing);


    }
}
