package lecture13_arrays;

public class maxNumber{
    public static void main(String[] args) {
        
        int[] arr  = {45,23,565,56,-12};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= max){
                max  = arr[i];
            }
        }
        System.out.println("Maximum number in array: " + max);
    }
}
