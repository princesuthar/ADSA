import java.util.Arrays;

public class inbuiltsort {

     public static void print(int arr[]){
        for(int i = 0; i< arr.length;i++){
            System.out.print(" "+ arr[i]);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int number[]={5,2,1,3,4};
        Arrays.sort(number);
        print(number);
    }
}