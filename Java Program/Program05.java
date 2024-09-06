// Use 2 Matrix and create addition,multiplication,substraction.
public class Program05 {

    public static void displayMatrix(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] addition(int matrix1[][], int matrix2[][]) {
        int matrix[][] = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix;
    }

    public static int[][] subtraction(int matrix1[][],int matrix2[][]){
        int matrix[][] = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrix;
    }

    public static int[][]  multiplication(int matrix1[][],int matrix2[][],int colA,int rowB){
        int matrix[][] = new int[colA][rowB];

        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < colA; j++) {
                for(int k=0;k<colA;k++){
                    matrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] matrix2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Matrix 1 -- ");
        displayMatrix(matrix1);

        System.out.println("Matrix 2 -- ");
        displayMatrix(matrix2);

        // Addition of 2 Matrix
        System.out.println("Addition of 2 Matrix : ");
        int additionOfMatrix[][] = addition(matrix1, matrix2);
        displayMatrix(additionOfMatrix);

        // subtraction of 2 Matrix
        System.out.println("Substraction of 2 Matrix : ");
        int subtractionOfMatrix[][] = subtraction(matrix1,matrix2);
        displayMatrix(subtractionOfMatrix);

        //  multiplication of 2 Matrix
        
        int rowA = matrix1.length;
        int colA = matrix1[0].length;
        int rowB = matrix2.length;
        int colB = matrix2[0].length;
        if(colA != rowB ){
            System.out.println("Matrix multiplication is not possible. Number of columns in A must be equal to number of rows in B.");
        }else{

            System.out.println(" Multiplication of 2 Matrix : ");
            int multiplicationOfMatrix[][] = multiplication(matrix1,matrix2,colA,rowB);
            displayMatrix(multiplicationOfMatrix);
        }
    }
}
