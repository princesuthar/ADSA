// In this code I have created a function which prints all the sub arrays of an array.

public class SubArray {
    public static void Sub(int number[]){
        for(int i = 0;i<number.length;i++){
            int start = i;
            for (int j = i; j<number.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
   public static void main(String[] args) {
        int number[]={5,2,7,8,1};
        Sub(number);
   } 
}
