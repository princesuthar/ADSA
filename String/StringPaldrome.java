//In this program i have started to learn using Strings..

package String;


public class StringPaldrome {
    public static boolean palidrome(String str){
        int n = str.length();
      
        for(int i =0;i<=n/2; i++){
            if(str.charAt(i)!= str.charAt(n-i-1)){
            return false;

            }
        }
        return true;
    }
    public static void main(String[] args) {
    String str = "racecar";
    System.out.println(palidrome(str)); 
        
    }

}
