package jason.danbi.problem2;

import java.util.LinkedList;
import java.util.Queue;

class Solution
{
    static boolean[][] visited;
    static int[] r_dir={-1,0,1,0};
    static int[] c_dir={0,1,0,-1};
    public int[] solution(int[][] v)
    {
        int[] answer = new int[2];
        int R=v.length;
        int C=v[0].length;
        int cnt=0;
        int max_area=0;

       visited=new boolean[R][C];

        for(int i=0; i<R;i++)
            for(int j=0;j<C;j++){
                if(!visited[i][j] && v[i][j]==1){
                    int area=bfs(i,j, v);
                    cnt++;
                    if(max_area<area) max_area=area;
                }

            }
        answer[0]=cnt;
        answer[1]=max_area;

        return answer;
    }

    static public int bfs(int row, int col, int[][] v){
        visited[row][col]=true;
        int area=1;
        int R=v.length;
        int C=v[0].length;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{row,col});

        while(!q.isEmpty()){
            int[] cur=q.poll();

            for(int i=0;i<4;i++){
                int nr=cur[0]+r_dir[i];
                int nc= cur[1]+c_dir[i];

                if(nr>=0 && nr<R && nc>=0 && nc<C && !visited[nr][nc] && v[nr][nc]==1){
                    visited[nr][nc]=true;
                    area++;
                    q.add(new int[]{nr,nc});
                }
            }
        }
        return area;
    }
}
