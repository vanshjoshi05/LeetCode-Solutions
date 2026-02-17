import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<Integer> generateRow(int row ){
        List<Integer>ls=new ArrayList<>();
        ls.add(1);
        int ans=1;
        for (int i=1;i<row;i++){
            ans=ans*(row-i);
            ans=ans/i;
            ls.add(ans);
        }
        return ls;
        
        
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalList=new ArrayList<>();
        for (int i =1;i<=numRows;i++){
            // generateRow(int i);
            finalList.add(generateRow(i));
        }
        return finalList;
    }
}

