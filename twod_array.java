import java.util.*;
public class twod_array {
    public static boolean search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               if (matrix[i][j]== key) {
                System.out.println("found th cell ("+ i + ","+j+")");
                return true;
                
               }
                
            }
            
        }
        System.out.println("key not found");
        return false;
    }

    

    public static void main(String[] args) {
        int matrix [][] = new int[3][3];
        int n = 3, m = 3;
        int key = 5;
        // int n = matrix.length , m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the elements of the matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
                
            }
        }


        //output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println();
        }
        search(matrix, key);

    }
}