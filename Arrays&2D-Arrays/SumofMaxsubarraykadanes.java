//In this code i have calculated the maximum sum of the elements of the sub arrays using kadanes method.. 

public class SumofMaxsubarraykadanes {


 public static void kanades(int array[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;

    for(int i =0; i<array.length; i++){
        cs = cs + array[i];
        if(cs <0){
            cs = 0;
        }
        ms = Math.max(cs,ms); 
    }
    System.out.println("max subarray sum is : " + ms);
 }
 public static void main(String[]args){
    int array[]={1,-2,6,-1,3};
    kanades(array);
 }   
}
