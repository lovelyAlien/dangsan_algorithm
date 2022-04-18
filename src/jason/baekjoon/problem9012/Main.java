package jason.baekjoon.problem9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();

        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            boolean flag=true;
            Stack<Character> stack=new Stack<>();
            String str= sc.next();


            for(int j=0;j<str.length();j++){

                if(str.charAt(j)=='(')
                    stack.push('(');



                else{ //')'
                    if(!stack.isEmpty() && stack.peek()=='(')
                        stack.pop();
                    else{
                        stack.push(')');
                        break;
                    }

                }



            }
            if(stack.isEmpty())
                sb.append("YES").append('\n');
            else
                sb.append("NO").append('\n');


        }
        System.out.println(sb);
    }
}
