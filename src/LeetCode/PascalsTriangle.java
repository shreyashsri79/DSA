package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerList = new ArrayList<>();

        for( int i = 0; i < numRows; i++){
            outerList.add(innerList(i));
        }
        return outerList;
    }
    private static List<Integer> innerList( int row){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= row; i++) {
            if( list.isEmpty()) list.add(1);
            else{
                int res = list.get(list.size() - 1);
                res *= row - i + 1;
                res /= i;
                list.add(res);
            }
        }
        return list;
    }

}
