import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        //conditional operater if else
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how much money do you have :");
        int cash = sc.nextInt();

        if(cash < 10) {
            System.out.println("you can only buy a pen.");
            System.out.println("get more money");
        }
        else if(cash >=50) {
            System.out.println("you can buy both pen and nb");
        }
        else 
            System.out.println("you can buy only nb");
        }
}
