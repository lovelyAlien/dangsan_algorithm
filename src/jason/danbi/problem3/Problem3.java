package jason.danbi.problem3;

public class Problem3 {
    public static void main(String[] args) {
        int n=7;
        int[][] relation={{1,2},{2,5},{2,6},{1,3},{1,4},{3,7}};
        String[] dirname={"root","abcd","cs","hello","etc","hello","solution"};

        int answer=new Solution().solution(n, relation, dirname);
    }
}
