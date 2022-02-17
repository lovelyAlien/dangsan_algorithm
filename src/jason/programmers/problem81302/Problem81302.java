package jason.programmers.problem81302;

import java.util.Arrays;

public class Problem81302 {



    public static void main(String[] args) {
        String[][] places={{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};

        int[] answer=new Solution().solution(places);

        System.out.println(Arrays.toString(answer));
    }
}
