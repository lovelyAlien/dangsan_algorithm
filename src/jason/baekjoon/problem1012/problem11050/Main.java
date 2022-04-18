package jason.baekjoon.problem1012.problem11050;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int K=sc.nextInt();
        int parent=1;
        int child=1;
        int answer=1;
        for(int i=0;i<K;i++){
            parent*=N-i;
            child*=K-i;
        }
        answer=parent/child;
        System.out.println(answer);



    }
}
