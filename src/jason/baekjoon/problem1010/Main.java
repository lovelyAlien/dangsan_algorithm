package jason.baekjoon.problem1010;

import java.util.Scanner;

//3
//        2 2
//        1 5
//        13 29
public class Main {
    static int[][] dp=new int[30][30];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int answer=combi(m,n);
            sb.append(answer).append('\n');


        }
        System.out.println(sb);
    }
    static int combi(int m, int n){
        if(dp[m][n]>0)
            return dp[m][n];


        if(m==n || n==0)
            return dp[m][n]=1;

        return dp[m][n]=combi(m-1,n-1)+combi(m-1,n);

    }
}
