package lecture30_Array;

public class removeDuplicate {

    public static int removeDuplicate(int arr[]) {

        int i=0;
        int j=1;

        int n = arr.length;

        while(j<n){
            if(arr[i] == arr[j]){
                j++;
            }
            else{
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        
        return i+1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 6, 6, 7, 8, 8, 9, 9, 9, 9 };
        
        int ans = removeDuplicate(arr);
        System.out.println(ans);
    }
    
}
