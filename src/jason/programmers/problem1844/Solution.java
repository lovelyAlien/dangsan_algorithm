package jason.programmers.problem1844;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int[] dr= {0, -1, 0,1 };
    static int[] dc={-1,0,1,0};
    static int R=0;
    static int C=0;
    public int solution(int[][] maps) {
        int answer = 0;



        R=maps.length;
        C=maps[0].length;


        int[][] route= new int[R][C];

        for(int i=0;i<R;i++)
            for(int j=0;j<C;j++){
                if(maps[i][j]==0){
                    route[i][j]=-1;
                }
                else{
                    route[i][j]=0;
                }
        }

        answer=bfs(0,0,R-1, C-1, route);


        return answer;
    }

    static int bfs(int sr, int sc, int n, int m, int[][] route){

        Queue<int[]>queue=new LinkedList();
        route[sr][sc]=1;
        queue.offer(new int[]{sr,sc});

        while(!queue.isEmpty()){
            int[] cur=queue.poll();
            int  r=cur[0];
            int  c=cur[1];
            if(r==n&& c==m){
                return route[n][m];
            }
            for(int i=0;i<4;i++){
                int nr= r+dr[i];
                int nc= c+dc[i];

                if(nr>=0 && nr<R && nc>=0 && nc<C && route[nr][nc]==0){
                    route[nr][nc]=route[r][c]+1;
                    queue.offer(new int[]{nr,nc});
                }
            }
        }

        return -1;
    }
}
