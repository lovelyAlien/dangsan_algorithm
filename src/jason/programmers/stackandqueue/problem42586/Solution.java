package jason.programmers.stackandqueue.problem42586;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {

    public int[] solution(int[] progresses, int[] speeds) {

        List<Integer> answer= new ArrayList<>();
        Stack<Integer> time_stack=new Stack<>();

        for(int i=progresses.length-1;i>=0;i--){

            int working_time=(100-progresses[i])/speeds[i] +  ((100-progresses[i])%speeds[i]>0 ? 1: 0);
            time_stack.add(working_time);


        }

        while(!time_stack.isEmpty()){


            int top=time_stack.pop();
            int cnt=1;

            while(!time_stack.isEmpty() && time_stack.peek()<=top){
                ++cnt;
                time_stack.pop();
            }

            answer.add(cnt);

        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
