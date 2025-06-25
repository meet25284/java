import java.util.*;

public class practice {
    public static boolean sort(int arr[] , int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] < arr[i+1]){
           return sort(arr ,i+1);            
        }
        else{
            return false;
        }
        
    }
   public static void main(String arg[]){
    int arr[] = {1,2,5,4,5};
    System.out.println(sort(arr , 0) );
   }
}
