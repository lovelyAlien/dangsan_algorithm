package jason.baekjoon.problem1874;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack<Integer> stack=new Stack();
        StringBuilder sb=new StringBuilder();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int next=0;
        for(int j=1;j<=n;j++){
            stack.push(j);
            sb.append('+').append('\n');

            while(!stack.isEmpty() && stack.peek().equals(arr[next])){
                stack.pop();
                sb.append('-').append('\n');
                next+=1;
            }
        }

        if(stack.isEmpty()){
            System.out.println(sb);
        }
        else
            System.out.println("NO");
    }

}
