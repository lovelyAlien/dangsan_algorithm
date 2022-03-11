package jason.programmers.problem92334;

public class Problem92334 {

    public static void main(String[] args) {
        String[] id_list={"con", "ryan"};
        String[] report={"ryan con", "ryan con", "ryan con", "ryan con"};
        int k=3;

        int[] answer=new Solution().solution(id_list, report, k);
        System.out.println(answer);
    }
}
