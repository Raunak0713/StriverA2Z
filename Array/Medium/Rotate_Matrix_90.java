package Array.Medium;

public class Rotate_Matrix_90 {
    public void rotate(int[][] matrix) {
        TransposeTheMatrix(matrix);
        ReverseTheRows(matrix);
    }
    public void TransposeTheMatrix(int[][] matrix){
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public void ReverseTheRows(int[][] matrix){
        int n = matrix.length;
        for(int[] a : matrix){
            for(int i=0; i<n/2; i++){
                int temp = a[i];
                a[i] = a[n-i-1];
                a[n-i-1] = temp;
            }
        }
    }
}
