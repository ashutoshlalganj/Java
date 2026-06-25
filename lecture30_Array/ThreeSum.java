package lecture30_Array;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] arr, int target) {

        Set<List<Integer>> output = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                       List<Integer> temp = new ArrayList<>();
                       temp.add(arr[i]);
                       temp.add(arr[j]);
                       temp.add(arr[k]);
                       Collections.sort(temp); // to avoid duplicates
                       output.add(temp);
                    }
                }
            }
        }

        return new ArrayList<>(output);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 10;
        List<List<Integer>> result = threeSum(arr, target);
        
        for (Object num : result) {
            System.out.print(num + " ");
            
        }
    }
}
