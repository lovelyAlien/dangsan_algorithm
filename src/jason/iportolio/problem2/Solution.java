package jason.iportolio.problem2;

class Solution {

    static int[] r_dir={-1,0,1,0};
    static int[] c_dir={0,1,0,-1};
    public int solution(int[][] office, int r, int c, String[] move) {
        int answer = 0;
        int R=office.length;
        int C=office[0].length;
        int sum=0;
        int dir=0;
        if(office[r][c]>=0){
            sum+=office[r][c];
            office[r][c]=0;
        }
        for(int i=0;i<move.length;i++){
            String command=move[i];

            if(command.equals("go")){
                int[] next=new int[]{r+r_dir[dir], c+c_dir[dir]};
                int nr=next[0];
                int nc=next[1];

                if(nr>=0 && nr<R && nc>=0 && nc<C && office[nr][nc]!=-1){
                    sum+=office[nr][nc];
                    office[nr][nc]=0;
                    r=nr;
                    c=nc;
                }
            }
            else if(command.equals("left")){
                dir=(dir+3)%4;
            }

            else if(command.equals("right")){
                dir=(dir+1)%4;
            }
        }

        answer=sum;
        return answer;
    }
}
