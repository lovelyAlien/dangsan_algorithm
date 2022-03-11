package jason.programmers.problem42587;

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer=0;
        List<Integer> p_print=new ArrayList<>();
        Queue<int[]> p_queue=new LinkedList<>();
        Stack<Integer> p_stack=new Stack<>();

        for(int i=0; i<priorities.length;i++){
            p_queue.add(new int[]{i,priorities[i]});
        }
        Arrays.sort(priorities);
        for(int i=0; i<priorities.length;i++){
            p_stack.add(priorities[i]);
        }

        while(!p_queue.isEmpty()){
            int top= p_stack.peek();
            int[] front=p_queue.poll();

            if(front[1]==top){
                p_stack.pop();
                p_print.add(front[0]);
            }
            else{
                p_queue.add(front);
            }

        }

        answer= p_print.indexOf(location)+1;
        return answer;
    }
}
