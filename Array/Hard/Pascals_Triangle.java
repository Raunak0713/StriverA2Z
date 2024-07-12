package Array.Hard;

import java.util.ArrayList;
import java.util.List;

// Each Element of the Pascal triangle is represented by the Formula (n-1) C (r-1), where n is rows and r is columns
public class Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Row = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> RowElement = new ArrayList<>();

            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    RowElement.add(1);
                }else{
                    List<Integer> previousRow = Row.get(i-1);
                    int num = previousRow.get(j-1) + previousRow.get(j);
                    RowElement.add(num);
                }
            }

            Row.add(RowElement);
        }

        return Row;
    }
}
