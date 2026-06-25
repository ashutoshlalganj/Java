package lecture29_Array;

public class Unique {

    public static int unique(int[] arr) {
        int n = arr.length;
        int xor = 0;
        for(int i = 0; i<n; i++){
            xor = xor ^ arr[i];
        }
        return xor;
        
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 1, 2, 3, 4, 0, 5, 6, 7, 8, 9, 6, 7, 8, 9, 10};
        System.out.println("Unique element is : "+unique(arr));
    }
}
