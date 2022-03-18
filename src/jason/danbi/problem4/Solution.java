package jason.danbi.problem4;

class Solution {
    public int solution(int[] play_list, int listen_time) {
        int answer = 0;
        int play_total=0;

        for(int i=0;i<play_list.length;i++){
            play_total+=play_list[i];
        }

        int[] plays=new int[play_total];

        int song=0;
        int p_idx=0;
        for(int i=0;i<play_list.length;i++){

            for(int j=0;j<play_list[i];j++){
               plays[p_idx]=song;
               p_idx++;
            }
            song++;
        }
        if(listen_time>=plays.length)
            return play_list.length;

        for(int i=0;i<plays.length;i++){
            int cnt=0;
            int n_idx= (i+listen_time-1);

            if(n_idx>plays.length-1)
                cnt=plays[n_idx%plays.length]+2;
            else{
                cnt=plays[n_idx]-plays[i]+1;
            }

            if(cnt>answer) answer= cnt;
        }
        return answer;
    }
}
