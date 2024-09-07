package Arrays;

import java.util.ArrayList;

public class TransposeMatrix {
    public int[][] transposeMatrix(int[][] matrix) {
        int columnLength = matrix.length, rowLength = matrix[0].length;
        int[][] transposeMatrix = new int[rowLength][columnLength];
        for (int i = 0; i < columnLength; i++)
        {
            for(int j = 0; j < rowLength; j++)
            {
               transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }
}
