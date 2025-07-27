//In this code i have calculated the maximum sum of the elements of the sub arrays ..

public class SumofMaxsubarrayI {

 public static void maxSubarrasumy(int array[]){
    int currentsum = 0;
    int maxsum = Integer.MIN_VALUE;

    for(int i = 0;i<array.length;i++){
            int start = i;
            for (int j = i; j<array.length;j++){
                int end = j;
                currentsum = 0;
                for(int k=start;k<=end;k++){ //print
                    //subarray sum
                   currentsum += array[k];
                }
                System.out.println(currentsum);
                if(maxsum < currentsum){
                    maxsum = currentsum;
                }
            }
        }
        System.out.println("Max sub array sum is equals to " + maxsum);
 }
 public static void main(String[]args){
    int array[]={1,-2,6,-1,3};
    maxSubarrasumy(array);
 }   
}
