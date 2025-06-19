import java.util.*;
public class practice {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int coloum = sc.nextInt();
        int [][] matrix = new int[rows][coloum];
 

        //input
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < coloum; j++){
                matrix[i][j] = sc .nextInt();
            }
            System.out.println(" ");
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < coloum; j++){
                System.out.print(matrix[i][j] + " "); 
            }
            System.out.println(" ");
        }
        
        int x = sc.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < coloum; j++){
                if(matrix[i][j] == x){
                    System.out.println("(" + i + "," + j + ")");
                }
            }
            System.out.println(" ");
        }
        
        
        
    }
}
