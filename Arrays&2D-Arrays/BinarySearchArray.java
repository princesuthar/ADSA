//In this program i have used another logic for seaching the index of the element in an Array,which is binary search method..
//''

public class BinarySearchArray {
    
    public static int BinarySearch(int number[],int key){
        int start = 0,end = number.length-1; 


        while(start<=end){
            int mid = (start+end)/2;

            //comparisions

            if(key == number[mid]){
                return mid;

            }
            if(number[mid]<key){
                start = mid + 1;       //right case
            }else{
                end = mid - 1;         //left case
            }
        }
        
        return -1;

    }
    public static void main(String[] args) {
        int number[]={7,3,9,5,1,6};
        int key = 9;
        System.out.println("Index of the key element is " + BinarySearch(number, key));
    }
}