package jason.baekjoon.problem11053;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer=1;

        int n = sc.nextInt();
        int[] A = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            dp[i] = 1;
        }

        for(int i=1;i<n;i++){

            for(int j=0;j<i;j++){
                if(A[j]<A[i]){
                    dp[i]=Math.max(dp[i], dp[j]+1);
                }
            }
            answer=Math.max(answer, dp[i]);
        }


        System.out.println(answer);
    }
}
