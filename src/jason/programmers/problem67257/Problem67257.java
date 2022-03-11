package jason.programmers.problem67257;

public class Problem67257 {

    public static void main(String[] args) {
        String expression= "100-200*300-500+20";
        long answer=new Solution().solution(expression);
        System.out.println(answer);
    }
}
