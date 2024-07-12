package Array.Medium;

import java.util.ArrayList;

public class Set_Matrix_0 {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Pair> zero = new ArrayList<>();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    zero.add(new Pair(i,j));
                }
            }
        }

        for(Pair pair : zero){
            for(int j=0; j<n; j++){
                matrix[pair.first][j] = 0;
            }
            for(int i=0; i<m; i++){
                matrix[i][pair.second] = 0;
            }
        }
    }
}

class Pair{
    int first;
    int second;

    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
