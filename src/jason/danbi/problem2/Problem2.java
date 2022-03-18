package jason.danbi.problem2;

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        int[][] v={{1,1,0,1,1},{0,1,1,0,0},{0,0,0,0,0},{1,1,0,1,1},{1,0,1,1,1},{1,0,1,1,1}};
        int[] answer= new Solution().solution(v);

        System.out.println(Arrays.toString(answer));
    }
}
