package lecture10;

public class newStar {
    public static void main(String[] args){
        int num = 3;
        for(int i=1; i<=num; i+=2){
            for(int j=num; j>=i+1; j-=2){
                System.out.print(" ");
            }


            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=1; i<=num; i++){
            for(int j=1; j<num; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=num+2; k++){
                if(k==1 || k==num+2 || i==num){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
