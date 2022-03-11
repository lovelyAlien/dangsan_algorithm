package jason.programmers.problem42888;

import java.util.Arrays;

public class Problem42888 {
    public static void main(String[] args) {
        String[] record= {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        String[] answer=new Solution().solution(record);
        System.out.println(Arrays.toString(answer));
    }
}
