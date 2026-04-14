package lecture13_arrays;

public class max2nd {
    public static void main(String[] args) {
        int[] arr  = {45,23,565,56,-12, 0, 100};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= max){
                max = arr[i];
            }
        }
       
        int secondMax = Integer.MIN_VALUE;;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != max && arr[j] > secondMax){
                secondMax = arr[j];
            }
        }
        System.out.println("2nd Maximum No : " + secondMax);
    }
}
