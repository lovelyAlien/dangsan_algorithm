package jason.programmers.problem17677;

public class Problem17677 {


    public static void main(String[] args) {
        String str1="E=M*C^2";

        String str2="e=m*c^2";


        int answer=new Solution().solution(str1, str2);
        System.out.println(answer);

    }
}
