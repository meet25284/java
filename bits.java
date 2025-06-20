import java.util.Scanner;

public class bits {
    public static void main(String[] args) {
        //get bit to know the bit at given position
        int n = 5;//take input number in decimal
        int pos = 1; //bit at given position
        int bitMask = 1<<pos; //left shifting 1bit by position is called bit masking(1<<pos) 
        if((bitMask & n)==0){  //using bitwise and can fetch bit is 0 or not
            System.out.println("bit is 0");
        }
        else{
            System.out.println("bit is 1");
        }


        //set bit to make give position bit to 1
        int NewNum = bitMask | n; //can do using or bitwise to change given position to 1
        System.out.println(NewNum);

        //clear bit to make given position bit to 0
        bitMask = ~(bitMask);//first using bitwise not make a bit inverse
        int ClearNum = (bitMask & n);//then using and bitwise fetch clear bit
        System.out.println(ClearNum);

        //update make bit from 1 to 0 and 0 to 1 at given position
        //take need inputs from user
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pos = sc.nextInt();
        int bit = sc.nextInt();
        bitMask = 1<<pos;

        if(bit == 0){ //to make 0 perform clear bit operation
            bitMask = ~(bitMask);
            int Num = (bitMask & n);
            System.out.println(Num);
        }
        else if (bit == 1) { //to make 1 perform set bit operation
            NewNum = bitMask | n; 
            System.out.println(NewNum);
        }
        else{
            System.out.println("your are giving wrong input");
        }
    }
}
