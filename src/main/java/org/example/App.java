package org.example;

import java.util.Arrays;

import static org.example.function.*;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        MatrixDiagonal matrixDiagonal = new MatrixDiagonal();
        int[][] matrix = {
                {-2, 31, 6, 7},
                {15, -42, 1, 0},
                {9, -7, 12, 19},
                {55, 34, 1, -10}
        };
        int[] diagonal = matrixDiagonal.getCounterDiagonal(matrix);
        System.out.println(Arrays.toString(diagonal));


        MatchResult matchResult = new MatchResult();
        System.out.println(" match rez " + matchResult.matchResult(2, 3, 1, 4));

        Printer pr = new Printer();
        int iii = 11;
        pr.printer(iii);
        UserAccount uu = new UserAccount();
        uu.setName("yyy");
        UserAccount uuu[] = new UserAccount[4];
        Car car = new Car();

        Man mm = new Man();
  /*      var result = switch (month) {
            case JANUARY, JUNE, JULY -> 3;
            case FEBRUARY, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER -> 1;
            case MARCH, MAY, APRIL, AUGUST -> {
                int monthLength = month.toString().length();
                yield monthLength * 4;
            }
            default -> 0;
        };
    */


        //creating two matrices
        int[][] a = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] b = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

//creating another matrix to store the multiplication of two matrices
        int[][] c = new int[3][3];  //3 rows and 3 columns

//multiplying and printing multiplication of 2 matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    System.out.println();
                    c[i][j] += a[i][k] * b[k][j];
                }//end of k loop
                System.out.print(c[i][j] + " ");  //printing matrix element
            }//end of j loop
            System.out.println();//new line
        }
        System.out.println();

        System.out.println("Matrix 2");

        int[][] matrixXYZ = {{1, 2}, {6, 2}, {9, 4}};
        int max = matrixXYZ[0][0];
        String[][] mtr = new String[3][3];
        for (int[] j : matrixXYZ) {
            for (int i : j) {
                System.out.print(i + " ");
                if (max < i) {
                    max = i;
                }
            }
            System.out.println();
        }
        System.out.println("MAX = " + max);

        System.out.println(booleanExpression(true, true, true, true));
        System.out.println(booleanExpression(true, true, true, false));
        System.out.println(booleanExpression(true, true, false, false));
        System.out.println(booleanExpression(true, true, false, false));
        System.out.println(booleanExpression(true, false, false, false));
        System.out.println(booleanExpression(true, false, true, false));
        System.out.println(booleanExpression(false, false, true, false));
        System.out.println(booleanExpression(false, false, false, false));

        getDoubledNumber(4);
        getDoubledNumber(10);

        System.out.println(iToBi(3));
        System.out.println(iToBi(5));
        System.out.println(iToBi(2));
        System.out.println(0);

    }
}
