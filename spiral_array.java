public class spiral_array {
    public static void print_spiral(int matrix[][]){
        int startrow = 0;
        int startcol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startrow<= endRow && startcol <= endCol) {
            //top
            for (int j = 0; j <= endCol; j++) {
                System.out.print(matrix[startrow][j]+" ");
            }

            //right
            for (int i = startrow +1; i <= endRow; i++) {

                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom
            for (int j = endCol - 1; j >= startcol; j--) {
                if (startrow == endRow) {
                    break;
                }

                
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for (int i = endRow -1; i >= startrow+1; i--) {
                if (startcol == endCol) {
                    break;
                }

                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }


    public static int diagonal_sun(int matrix[][]){
        int sum = 0;
        // for (int i = 0; i < matrix.length; i++) {
        //     //primary diagonal
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (i==j) {
        //             sum += matrix[i][j];
        //         }//secondary diagonal 
        //         else if (i+j == matrix.length -1) {
        //             sum += matrix[i][j];
        //         }
                
        //     }
            
        // }
        for (int i = 0; i < matrix.length; i++) {
            //pd
            sum += matrix[i][i];
            //sd
            if (i != matrix.length -1-i) {
                sum+= matrix[i][matrix.length-i-1];    
            }
            
        }
        return sum;
    }

    public static boolean Sorted_search(int matrix[][], int key){
        int row = 0 , col = matrix.length-1;
        while (row< matrix.length && col>= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            else if (key < matrix[row][col]) {
                col--;
            }else{
                row++;
            }
        }
        System.out.println("not found");
        return false;
    }


    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,60}};
        int key = 34;
        Sorted_search(matrix, key);
        // int matrix[][]={{1,2,3,4},
        //                 {5,6,7,8},
        //                 {9,10,11,12},
        //                 {13,14,15,16}};
    // // print_spiral(matrix);
    // System.out.println(diagonal_sun(matrix));
    }


    
    
}
