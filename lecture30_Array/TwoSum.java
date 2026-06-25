package lecture30_Array;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {

        int ans[] = new int[2];

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    ans[0] = arr[i];
                    ans[1] = arr[j];
                    return ans;
                }
            }
        }



        return ans;
        
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int target = 14;
        int[] ans = twoSum(arr, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
