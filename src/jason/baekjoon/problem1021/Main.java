package jason.baekjoon.problem1021;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int M=sc.nextInt();
        int cnt=0;
        int[] target_arr=new int[M];
        for(int i=0;i<M;i++){
            target_arr[i]=sc.nextInt();
        }

        LinkedList<Integer> deque=new LinkedList<>();
        for(int i=0;i<N;i++){
            deque.add(i+1);
        }


        for(int i=0;i<M;i++){
            int target_idx=deque.indexOf(target_arr[i]);
            int half_idx;
            if(deque.size()%2==0){
                half_idx=deque.size()/2-1;
            }
            else
                half_idx= deque.size()/2;

            if(target_idx<=half_idx){
                for(int j=0;j<target_idx;j++){
                    int tmp=deque.pollFirst();
                    deque.offerLast(tmp);
                    cnt++;
                }
            }
            else{
                for(int j=0; j<deque.size()-target_idx;j++){
                    int tmp=deque.pollLast();
                    deque.offerFirst(tmp);
                    cnt++;
                }
            }

            deque.pollFirst();
        }
        System.out.println(cnt);
    }
}
