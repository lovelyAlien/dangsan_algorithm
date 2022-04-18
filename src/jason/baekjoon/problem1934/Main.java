package jason.baekjoon.problem1934;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int T=sc.nextInt();

        for(int t=0;t<T;t++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int gcd;
            int answer;
            if(a>b){
                gcd=getGcd(a,b);
                answer=(a*b)/gcd;
            }


            else{
                gcd=getGcd(b,a);
                answer=(a*b)/gcd;

            }


            sb.append(answer).append('\n');





        }

        System.out.println(sb);
    }

    static int getGcd(int a, int b){
        if(a%b==0)
            return b;

        int c= a%b;

        return getGcd(b,c);
    }
}
