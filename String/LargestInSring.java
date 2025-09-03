//in this program I have comapred the string in (lexiographic method)..
 package String;
public class LargestInSring {

    public static void main(String[] args) {
        String fruits[] = {"mango" , "kiwi" ,"pomogranade"};
        String largest  = fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}