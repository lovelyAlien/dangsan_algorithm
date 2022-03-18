package jason.baekjoon.problem1929;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int M=sc.nextInt();
        int N=sc.nextInt();

        //3 16
        boolean[] primeArray=new boolean[N +1];
        for(int i=0;i<=N;i++){
            primeArray[i]=true;
        }
        //eratos
        primeArray[0]=false;
        primeArray[1]=false;

        for(int i=2;i*i<=N;i++){
            if(primeArray[i]){
                for(int j=i+i;j<=N;j+=i){
                    primeArray[j]=false;
                }
            }
        }

        for(int i=M;i<=N;i++){
            if(primeArray[i])
                System.out.println(i);
        }





    }


}
