package jason.baekjoon.problem2609;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n1=sc.nextInt();

        int n2=sc.nextInt();

        //유클리드 호제법
        //24 18
        int gcd;
        if(n1>n2)
            gcd= getGcd(n1,n2);
        else
            gcd= getGcd(n2,n1);

        System.out.println(gcd);

        System.out.println((n1*n2)/gcd);
    }

    static int getGcd(int n1, int n2){
        if(n1%n2==0) return n2;

        return getGcd(n2,n1%n2);
    }
}
