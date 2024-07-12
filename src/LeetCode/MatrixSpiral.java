package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MatrixSpiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length, m = matrix[0].length;
        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        while( top <= bottom && left <= right){
            // L -----> R
            for( int i = left; i <= right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            // T -----> B
            for( int i = top; i <= bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;
            // R -----> L
            if( top <= bottom){
                for( int i = right; i >= left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // B -----> T
            if( left <= right){
                for( int i = bottom; i >= top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
