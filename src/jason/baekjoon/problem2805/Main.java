package jason.baekjoon.problem2805;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long answer=0;
        int N=sc.nextInt();

        int M=sc.nextInt();

        int[] tree_arr= new int[N];
        for(int i=0;i<N;i++){
            tree_arr[i]=sc.nextInt();
        }

        long start=0;
        long end=0;
        for(int i=0;i<N;i++){
            if(end<tree_arr[i]) end= tree_arr[i];
        }

        while(start<=end){
            long mid=(start+end)/2;
            long sum=0;
            for(int i=0;i<N;i++){
                long len= tree_arr[i]-mid;
                if(len>0) sum+=len;
            }

            if(sum>=M){
                answer=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }

        System.out.println(answer);
    }
}
