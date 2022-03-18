package jason.skictfamily.problem2;

class Solution {
    static int[][] answer;
    int[][] t_dir={{0,1},{1,0},{0,-1},{-1,0}};
    int[][] f_dir={{1,0},{0,1},{-1,0},{0,-1}};
    public int[][] solution(int n, boolean clockwise) {
        answer= new int[n][n];


        if(clockwise){
            rotation(0,0,0, t_dir);
            rotation(0,n-1,1, t_dir);
            rotation(n-1,n-1,2, t_dir);
            rotation(n-1,0,3, t_dir);
        }
        else{
            rotation(0,0,0, f_dir);
            rotation(n-1,0,1, f_dir);
            rotation(n-1,n-1,2, f_dir);
            rotation(0,n-1,3, f_dir);
        }
        //
        return answer;
    }

    private void rotation(int row, int col, int d_idx, int[][] dir ) {

        int num=1;
        int cur_r=row;
        int cur_c=col;
        answer[cur_r][cur_c]=num;
        //한 방향 이동 횟수
        int gap=1;
        int cnt=answer.length-1-gap;

        while(cnt>0){


            for(int i=0;i<cnt;i++){
                int next_r= cur_r+dir[d_idx%4][0];
                int next_c= cur_c+dir[d_idx%4][1];
                answer[next_r][next_c]=++num;
                cur_r=next_r;
                cur_c=next_c;

            }
            d_idx++;
            gap++;
            int dr= dir[d_idx%4][0];
            int dc= dir[d_idx%4][1];
            //우
            if(dr==0 && dc==1){
                cnt=answer.length-gap-cur_c-1;
            }
            //하
            else if(dr==1 && dc==0){
                cnt=answer.length-gap-cur_r-1;
            }//좌
            else if(dr==0 && dc==-1){
                cnt=cur_c-gap;
            }
            //상
            else{
                cnt=cur_r-gap;
            }

        }

    }
}
