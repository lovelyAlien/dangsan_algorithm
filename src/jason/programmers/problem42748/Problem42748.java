package jason.programmers.problem42748;

import java.util.Arrays;

public class Problem42748 {
    public static void main(String[] args) {

        int[] array={1, 5, 2, 6, 3, 7, 4};

        int[][] commands={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer= new Solution().solution(array, commands);

        System.out.println(answer);
    }


}