//In this code I have use the basic alogoritm to reverse the elements in an Array


public class ReverseArray {
    public static void Reverse(int number[]){
        int first = 0,last =number.length-1;

        while(first<last){
            int temp = number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;

        }
    }
    public static void main(String[] args) {
        int number[]={5,2,7,8,1};
        Reverse(number);
        for(int i = 0; i<number.length; i++){
            System.out.print(" "+number[i]);
        }
    }
    
}