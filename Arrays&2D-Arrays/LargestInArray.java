//In this program I have use the logic of arrays to find out the maxing number from the array.

public class LargestInArray {
    public static int Largest(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i< number.length;i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
         return largest;
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16};
        System.out.println("The largest value is "  + Largest(number));
    }
}
