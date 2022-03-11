package jason.programmers.tmax.problem316;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(int[][] v) {

        Map<Integer, Integer> rows= new HashMap<>();
        Map<Integer, Integer> cols= new HashMap<>();
        int[] answer = new int[2];

        for(int i=0;i<3;i++){

            int row=v[i][0];
            int col=v[i][1];

            if(rows.containsKey(row)){
                rows.put(row, rows.get(row)+1);
            }
            else{
                rows.put(row,1);
            }

            if(cols.containsKey(col)){
                cols.put(col, cols.get(col)+1);
            }
            else{
                cols.put(col,1);
            }
        }

        for(Integer key: rows.keySet()){
            if(rows.get(key).equals(1))
                answer[0]=key;
        }

        for(Integer key: cols.keySet()){
            if(cols.get(key).equals(1))
                answer[1]=key;
        }



        System.out.println("Hello Java");

        return answer;
    }
}
