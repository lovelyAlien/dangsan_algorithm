package jason.programmers.bruteforce.problem42840;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] a = {1, 2, 3, 4, 5}; //5
        int a_answer_cnt = 0;
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5}; //8
        int b_answer_cnt = 0;
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10
        int c_answer_cnt = 0;

        for (int i = 0; i < answers.length; i++) {

            if (a[i % 5] == answers[i]) {
                a_answer_cnt++;
            }
            if (b[i % 8] == answers[i]) {
                b_answer_cnt++;
            }
            if (c[i % 10] == answers[i]) {
                c_answer_cnt++;
            }
        }

        List<Integer> answerList=new ArrayList<>();
        int max_cnt=Math.max(Math.max(a_answer_cnt, b_answer_cnt), c_answer_cnt);


        if(max_cnt==a_answer_cnt) answerList.add(1);
        if(max_cnt==b_answer_cnt) answerList.add(2);
        if(max_cnt==c_answer_cnt) answerList.add(3);

        answer= answerList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}