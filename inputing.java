import java.util.Scanner;

public class inputing {
    public static void main(String[] args) {
        //how to take input a number
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age:");
        int age = sc.nextInt();

        //if you want to input string
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = scan.next();

    }
}
