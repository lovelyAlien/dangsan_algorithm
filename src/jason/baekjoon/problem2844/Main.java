package jason.baekjoon.problem2844;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //45분 일찍 알람
        //분에 45분 뺀다
        //뺀 값이 음수이면
        //분 60을 더한다.
        //시간은 1 뺀다.

        Scanner sc= new Scanner(System.in);

        int h=sc.nextInt();
        int m=sc.nextInt();

        m=m-45;
        if(m<0){
            m+=60;
            h-=1;

            if(h<0)
                h+=24;
        }

        System.out.println(h+" "+m);
    }
}
