package jason.socar.problem1;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public int[] solution(int n, int k, int[][] roads) {
        int[][] graph=new int[n][n];
        boolean[][] visited=new boolean[k+1][n];
        List<Integer>[]dp= new ArrayList[k+1];
        for(int i=0;i<k+1;i++){
            dp[i]=new ArrayList<>();
        }
        dp[0].add(0);

        for(int[] road: roads){
            int n1=road[0];
            int n2=road[1];
            int len=road[2];

            graph[n1][n2]=len;
            graph[n2][n1]=len;

        }

        int cur_time=0;

        while(cur_time<k){
            for(Integer node: dp[cur_time]){
                for(int i=0;i<n;i++){
                    if(graph[node][i]!=0){
                        int value= cur_time+graph[node][i];
                        if(value<=k && !visited[value][i]){
                            visited[value][i]=true;
                            dp[value].add(i);
                        }

                    }
                }
            }
            cur_time+=1;

        }
        if(dp[k].isEmpty())
            return new int[]{-1};

        return dp[k].stream()
                .mapToInt(i->i)
                .toArray();
    }
}
