package jason.programmers.stackandqueue.problem42586;

import java.util.Arrays;

public class Problem42586 {

    public static void main(String[] args) {
        int[] progresses={93,30,55};

        int[] speeds={1,30,5};

        Solution solution=new Solution();
        int[] answer= solution.solution(progresses, speeds);
        System.out.println(Arrays.toString(answer));
    }
    
    

}
