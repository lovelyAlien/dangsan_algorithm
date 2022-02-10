package jason.programmers.problem12973;

import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = -1;

        //stack
        //일단 첫번째 넣어
        //top과 같으면 top pop
        //마지막 요소까지 반복문 돌리고, 스택을 확인
        //스택이 비었으면 1, 아니면 0

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stack.isEmpty() && ch == stack.peek()) {
                stack.pop();
            } else
                stack.push(ch);
        }

        if (stack.isEmpty())
            return 1;
        else
            return 0;


    }
}
