package org.example;

public class MatrixDiagonal {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        int i = 0;
        while (i < matrix.length) {
            diagonal[i] = matrix[i][i];
            i++;
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        int i = matrix.length - 1;
        int j = 0;
        while (i >= 0) {
            counterDiagonal[j] = matrix[j][i];
            i--;
            j++;
        }
        return counterDiagonal;
    }
}