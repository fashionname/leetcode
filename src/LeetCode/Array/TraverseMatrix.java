package LeetCode.Array;

import MyUtil.PrintLog;

import java.util.Arrays;

/**
 * @author cowBaby
 * @create 2023/3/2-01:41
 */
public class TraverseMatrix {

    public static void main(String[] args) {

        Integer[][] matrix = new Integer[10][10];
        Integer[][] emptyMatrix = new Integer[10][10];
        int id = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = ++id;
                emptyMatrix[i][j] = 0;
            }
        }

        int length = matrix.length * matrix[0].length;
        int[] ans = new int[length];
        int idx = 0;
        int row = 0;
        int col = 0;
        int[][] direction = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for(int i = 0; i < length; i++){
            ans[i] = matrix[row][col];
            emptyMatrix[row][col] = 1;
            int nextRow = direction[idx][0] + row;
            int nextCol = direction[idx][1] + col;

            if(nextRow < 0 || nextRow >= matrix.length
                || nextCol < 0 || nextCol >= matrix[0].length
                || emptyMatrix[nextRow][nextCol] == 1){
                idx++;
                idx %= direction.length;


            }
            row += direction[idx][0];
            col += direction[idx][1];
        }
        PrintLog.printArray(matrix);
        System.out.println(Arrays.toString(ans));
    }
}
