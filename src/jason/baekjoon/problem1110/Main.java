package jason.baekjoon.problem1110;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num=sc.nextInt();

        int next=num;
        int cnt=0;

        while(true){
            cnt++;
            int a=next/10;
            int b=next%10;

            int c=a+b;

            next=b*10+c%10;
            if(next==num)
                break;


        }

        System.out.println(cnt);
    }

}
