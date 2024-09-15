package MCA1;

import java.util.Scanner;

public class Program05 {

    public static int [][]addition(int matrix1[][],int matrix2[][]){

        int row = matrix1.length,col = matrix2[0].length;
        int [][]result = new int[matrix1.length][matrix2[0].length];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static int [][]substraction(int matrix1[][],int matrix2[][]){

        int row = matrix1.length,col = matrix2[0].length;
        int [][]result = new int[matrix1.length][matrix2[0].length];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    public static int [][]multiplication(int matrix1[][],int matrix2[][]){
        int col = matrix1[0].length;
        int row = matrix2.length;

        int [][]result = new int[row][col];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                for(int k=0;k<col;k++){
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void display(int matrix[][]){
        int row = matrix.length,col = matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("--Enter Detail of Matrix 1 : -- ");
        System.out.print("Enter Rows for Matrix 1 : ");
        int row = s.nextInt();
        System.out.print("Enter Cols for Matrix 1 : ");
        int col = s.nextInt();
        int [][]matrix1 = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("Enter Value of Matrix1[%d][%d] : ",i,j);
                matrix1[i][j] = s.nextInt();
            }
        }

        System.out.println("--Detail of Matrix 2 -- ");
        System.out.print("Enter the row of Matrix2 : ");
        int row2 = s.nextInt();
        System.out.print("Enter the col of Matrix2 : ");
        int col2 = s.nextInt();

        int [][]matrix2 = new int[row2][col2];

        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                System.out.printf("Enter value of Matrix2[%d][%d] : ",i,j);
                matrix2[i][j] = s.nextInt();
            }
        }

        System.out.println("Matrix 1 : ");
        display(matrix1);
        System.out.println("Matrix 2 : ");
        display(matrix2);



        if((row == row2) && (col == col2)){
            int [][]additionMatrix = addition(matrix1,matrix2);
            System.out.println("Addition of Matrix : ");
            display(additionMatrix);
        }else{
            System.out.println("Error : Both Matrix must be Same Size..");
        }
        if((row == row2) && (col == col2)){
            int [][]substraction = substraction(matrix1,matrix2);
            System.out.println("Substration of Matrix : ");
            display(substraction);
        }else{
            System.out.println("Error : Both Matrix must be Same Size..");
        }
        if((col == row2)) {
            int [][]multiplicationMatrix = multiplication(matrix1, matrix2);
            System.out.println("Multiplication of Matrix : ");
            display(multiplicationMatrix);

        }else{
                System.out.println("Error : Column of Matrix1 and Row of Matrix2 Must be same");
            }



    }
}
