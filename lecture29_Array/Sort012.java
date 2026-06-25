package lecture29_Array;

public class Sort012 {

    public static void sort012(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                count0++;
            }
            else if(arr[i] == 1){
                count1++;
            }
            else{
                count2++;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(count0 > 0){
                arr[i]=0;
                count0--;
            }
            else if(count1 > 0){
                arr[i]=1;
                count1--;
            }
            else{
                arr[i]=2;
                count2--;
            }
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    // ==================================================


    public static int[] swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static void TwoPointerSort(int[] arr){
        
        // int[] arr = { 1, 0, 2, 1, 0, 1, 2, 0, 0, 1, 2, 2, 0, 1, 0, 2, 1, 0, 1, 2};
        
        int left = 0;
        int right = arr.length;

        int i = 0;



        while(i < right){
            if(arr[i] == 0){
                swap(arr, i, left);
                i++;
                left++;
            }
            else if(arr[i] == 1){
                i++;
            }
            else{
                swap(arr, i, right-1);
                right--;
            }  

        }

        for(int a = 0; a<arr.length; a++){
            System.out.print(arr[a]+" ");
        }


    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 1, 0, 1, 2, 0, 0, 1, 2, 2, 0, 1, 0, 2, 1, 0, 1, 2};
        // sort012(arr);

        TwoPointerSort(arr);

    }
}
