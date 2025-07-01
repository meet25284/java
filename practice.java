import java.util.*;

public class practice {
    public static void printperm(String str,String perm){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char currentchar = str.charAt(i);
            String newstr = str.substring(0 , i) + str.substring(i+1);
            printperm(newstr,perm + currentchar);
        }
        
    }
   public static void main(String arg[]){
        String str = "abcd";
        printperm(str,"");
   }
}
