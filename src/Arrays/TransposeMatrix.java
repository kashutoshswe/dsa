package Arrays;

import java.util.ArrayList;

public class TransposeMatrix {
    public int[][] transposeMatrix(int[][] matrix) {
        int[][] transposeMatrix = new int[matrix.length][matrix[].length];
        for(int i = 0; i < matrix.length; i++)
        {
            ArrayList<Integer> columnList = new ArrayList<Integer>();
            int columnIndex = 0;
            for(int j = 0; j < matrix[i].length; j++)
            {
                columnList.add(matrix[columnIndex++][i]);
            }
        }
        return matrix;
    }
}
