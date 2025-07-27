//In this code i have calculated the maximum sum of the elements of the sub arrays .. 

public class SumofMaxsubarrayP {

 public static void maxSubarrasumy(int array[]){
    int currentsum = 0;
    int maxsum = Integer.MIN_VALUE;
    int prefixsum[] = new int[array.length];

    prefixsum[0] = array [0];

    for(int i = 1;i<array.length;i++){
        prefixsum[i] = prefixsum[i-1] + array[i];

    }

    for(int i = 0;i<array.length;i++){
            int start = i;
            for (int j = i; j<array.length;j++){
                int end = j;
                currentsum = start == 0 ? prefixsum[end] : prefixsum[end] - prefixsum[start-1];
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
