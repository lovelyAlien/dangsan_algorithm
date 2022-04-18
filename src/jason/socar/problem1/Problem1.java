package jason.socar.problem1;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem1 {

    public static void main(String[] args) {
        int n=6;
        int k=17;

        int[][] roads={{5, 4, 6}, {5, 2, 5}, {0, 4, 2}, {2, 3, 3}, {1, 2, 7}, {0, 1, 3}};
//        int[][] roads={{0, 1, 2}, {1, 2, 7}, {2, 3, 10}, {3, 0, 9}};

        int[] answer=new Solution2().solution(n,k,roads);
        System.out.println(Arrays.toString(answer));
    }
}
