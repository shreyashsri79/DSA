package LeetCode;

public class RotateMatrixBy90 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for( int i = 0; i < n; i++){
            for( int j = 0; j < n; j++){
                if( i != j && i < j) swap2d(matrix, i , j);
            }
        }
        for( int i = 0; i < n; i++){
            reverse( matrix[i]);
        }
    }
    private void swap2d( int[][] matrix, int a, int b){
        int temp = matrix[a][b];
        matrix[a][b] = matrix[b][a];
        matrix[b][a] = temp;
    }
    private void reverse( int[] arr){
        int i = 0, j = arr.length - 1;
        while( i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
