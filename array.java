import java.util.*;

public class array {
    public static void main (String[] args) {
        //array can make using data type then squre bracket name of array
        int[] marks = new int[3];
        marks[0]=70;
        marks[1]=34;
        marks[2]=90;

        //it can print using its index
        System.out.println(marks[1]);

        //2d array 
        int[][] finalmarks = {{63,34,34},{77,34,34}};

        //access it using index
        System.out.println(finalmarks[0][2]);

        //lenth of array
        System.out.println(finalmarks.length);

        //asending order sort
        Arrays.sort(marks);
        System.out.println(marks[0]);

        
    }
}
