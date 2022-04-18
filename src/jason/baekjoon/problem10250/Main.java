package jason.baekjoon.problem10250;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            int H=sc.nextInt();
            int W=sc.nextInt();
            int N=sc.nextInt();

            int w=N/H+1;
            int h=N%H;

            if(h==0){
                h=H;
                w-=1;
            }

            int num= 100*h+w;
            System.out.println(num);
        }
    }
}
