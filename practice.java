import java.util.*;

public class practice {
    public static void tower(int n, char src , char helper , char dest) {
        if(n == 0){
            return;
        }
        tower(n-1, src, dest, helper);  // Step 1
        System.out.println("disk " + n + " move from " + src + " to " + dest);  // Step 2
        tower(n-1, helper, src, dest);  // Step 3
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Number of disks
        tower(n, 'A', 'B', 'C');
    }
}
