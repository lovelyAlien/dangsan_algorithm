package jason.baekjoon.problem1436;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int cnt=1;
        Integer next=666;
        while(true){

            if(cnt==n)
                break;


            next+=1;
            String s_next=next.toString();

            if(s_next.contains("666"))
                cnt++;

        }

        System.out.println(next);
    }
}
