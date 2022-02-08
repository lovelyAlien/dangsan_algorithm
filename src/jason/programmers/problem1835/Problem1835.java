package jason.programmers.problem1835;

public class Problem1835 {


    public static void main(String[] args) {
        int n=2;
        String[] data={"N~F=0", "R~T>2"};
//        String[] data={"M~C<2", "C~M>1"};

        int answer=new Solution().solution(n,data);
        System.out.println(answer);
    }
}
