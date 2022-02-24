package jason.programmers.problem42587;

public class Problem42587 {

    public static void main(String[] args) {
        int[] priorites= {1, 1, 9, 1, 1, 1};
        int location= 0;

        int answer=new Solution().solution(priorites, location);
        System.out.println(answer);
    }
}
