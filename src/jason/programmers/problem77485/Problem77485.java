package jason.programmers.problem77485;

import java.util.Arrays;

public class Problem77485 {

    public static void main(String[] args) {
        int rows= 6;
        int columns=6;
        int[][] queries={{2,2,5,4},{3,3,6,6},{5,1,6,3}};

        int[] answer=new Solution().solution(rows,columns, queries);
        System.out.println(Arrays.toString(answer));
    }

}
