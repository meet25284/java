import java.util.*;
public class practice {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sb = sc.nextLine();
        int n = sb.length();
        StringBuilder reverse = new StringBuilder("");
        for(int i = n-1;i >= 0; i--){
            char revese = sb.charAt(i);
            reverse.append(revese);
        }
        System.out.println(reverse);

        



    }
}
