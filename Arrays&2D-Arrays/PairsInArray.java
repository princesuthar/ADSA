//In this program I have create a function which creates pairs of given arrays

public class PairsInArray {
    public static void pairs(int number[]){
        for(int i = 0; i<number.length;i++){
            int current = number[i];
            for (int j = i+1;j<number.length;j++){
                System.out.print("(" + current + "," + number[j]+ ") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={6,5,9,3,1};
        pairs(number);
    }
}
