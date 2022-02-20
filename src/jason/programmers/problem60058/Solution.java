package jason.programmers.problem60058;

import java.util.Stack;

class Solution {
    public String solution(String p) {

        String answer=dfs(p);

        return answer;

    }
    static public String dfs(String p){
        if(isRight(p))
            return p;


        int left=0;
        int right=0;
        int pivot=0;

        for(int i=0;i<p.length();i++){
            if(p.charAt(i)=='(')
                left++;
            else
                right++;

            if(left==right){
                pivot=i;
                break;
            }
        }

        String u=p.substring(0,pivot+1);
        String v=p.substring(pivot+1,p.length());


        if(isRight(u)){
            return u+dfs(v);
        }
        else{
            String tmp='('+dfs(v)+')';

            for(int i=1;i<u.length()-1;i++){
                if(u.charAt(i)=='(')
                    tmp+=')';
                else
                    tmp+='(';
            }

            return tmp;
        }
    }


    static public boolean isRight(String s){
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
                continue;
            }

            char top=stack.peek();

            if(top=='(' && ch==')')
                stack.pop();
            else
                stack.push(ch);
        }
        if(stack.isEmpty())
            return true;


        return false;

    }

}
