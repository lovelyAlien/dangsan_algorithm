package jason.programmers.stackandqueue.problem12978;

public class Problem12978 {
    public static void main(String[] args) {
        int N = 6;
//        int[][] road = {{1, 2, 1}, {2, 3, 3}, {5, 2, 2}, {1, 4, 2}, {5, 3, 1}, {5, 4, 2}};
        int[][] road= {{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}};
        int K = 4;
        Solution solution = new Solution();

        int answer= solution.solution(N, road, K);
        System.out.println("answer="+ answer);

    }
}
