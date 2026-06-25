package lecture30_Array;

import java.util.HashMap;

public class firstDuplicate {


    public static int findFirstReaptingElement(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for(int i : arr){
            if(freq.get(i) > 1){
                return i;
            } 
        }

        return -1;


    }






    public static int firstDuplicate(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            int val = Math.abs(arr[i]);
            int idx = val - 1;
            if (arr[idx] < 0) {
                ans = val;
                break;
            } else {
                arr[idx] = -arr[idx];
            }
        }
        return ans;
    }




    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 4, 3, 4, 5, 6, 7, 1, 8, 9, 2, 10 };
        // int ans = firstDuplicate(arr);
        // System.out.println(ans);

        int ans = findFirstReaptingElement(arr);
        System.out.println(ans);

    }
}
