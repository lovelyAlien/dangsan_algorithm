package jason.iportolio.problem2;

public class Problem2 {
    public static void main(String[] args) {
        int[][] office={{5,-1,4},{6,3,-1},{2,-1,1}};
        int r=1;
        int c=0;
        String[] move={"go","go","right","go","right","go","left","go"};

        int result=new Solution().solution(office,r,c,move);
    }
}
