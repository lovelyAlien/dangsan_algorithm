package jason.programmers.problem77484;

public class Problem77484 {


    public static void main(String[] args) {
        int[] lottos={44, 1, 0, 0, 31, 25};

        int[] win_nums={31, 10, 45, 1, 6, 19};

        int[] answer=new Solution().solution(lottos, win_nums);

        System.out.println(answer);
    }
}
