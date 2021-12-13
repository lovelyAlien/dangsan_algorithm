package jason.programmers.stackandqueue.problem42840;

import java.util.Arrays;

public class Problem42840 {

    public static void main(String[] args) {
        int[] answers={1,2,3,4,5};


        Solution solution =new Solution();
        int[] answer= solution.solution(answers);
        System.out.println(Arrays.toString(answer));
    }
}
