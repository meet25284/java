import java.util.*;

public class practice {
    public static void reverse(String str ,int n) {
     if(n == 0){
     System.out.print(str.charAt(n));
        return;
     }
     System.out.print(str.charAt(n));
     reverse(str ,n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();        
        reverse(str ,(str.length())-1);
    }
}
