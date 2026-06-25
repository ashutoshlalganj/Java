public class Sort0and1{
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 1, 0, 1};

        for(int i = 0; i< arr.length; i++){

            for(int j=i; j< arr.length; j++){
                if(arr[i] == 1 && arr[j] == 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            
            }
        }

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}