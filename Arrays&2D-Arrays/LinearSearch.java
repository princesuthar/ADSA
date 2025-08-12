// In this question I have solved the Q, where I find the index of the Entered key element of the Array.

public class LinearSearch {
    public static int LinearS(int number[],int key){
        for(int i = 0; i< number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
         return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16};
        int key = 10;
        int index = LinearS(number, key);
        System.out.println("The index is " + index);
    }
}