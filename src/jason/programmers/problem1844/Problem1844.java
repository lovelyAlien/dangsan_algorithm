package jason.programmers.problem1844;

public class Problem1844 {
    public static void main(String[] args) {
        int[][] maps={{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};

        int answer=new Solution().solution(maps);
        System.out.println("answer: "+ answer);
    }
}
