 package String;

public class StringCompare {
    public static void main(String[] args) {
        
    
    String s1 = "Prince";
    String s2 = new String("Prince");

    if(s1.equals(s2)){
        System.out.println("Strings are equal");
 } else {
    System.out.println("Strings are not equal");
 }
}
}