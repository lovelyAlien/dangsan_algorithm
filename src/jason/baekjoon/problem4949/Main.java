package jason.baekjoon.problem4949;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        while(true){
            String str=sc.nextLine();
            if(str.equals(".")) break;

            String result=isBalance(str);
            sb.append(result).append('\n');
        }
        System.out.println(sb);

    }

    static String isBalance(String str){
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                stack.push('(');
            }

            else if(str.charAt(i)=='['){
                stack.push('[');
            }

            else if(str.charAt(i)==')'){
                if(!stack.isEmpty() &&stack.peek()=='('){
                    stack.pop();
                }
                else
                    stack.push(')');
            }
            else if(str.charAt(i)==']'){
                if(!stack.isEmpty() && stack.peek()=='['){
                    stack.pop();
                }
                else
                    stack.push(']');
            }
        }

       if(stack.isEmpty()){
           return "yes";
       }
       else{
           return "no";
       }
    }

}
