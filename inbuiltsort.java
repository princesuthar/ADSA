import java.util.Arrays;
import java.util.Collections;

public class inbuiltsort {

     public static void print(Integer arr[]){
        for(int i = 0; i< arr.length;i++){
            System.out.print(" "+ arr[i]);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Integer number[]={5,2,1,3,4};
        Arrays.sort(number,Collections.reverseOrder());
        print(number);
    }
}
