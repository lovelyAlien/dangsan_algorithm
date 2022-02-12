package jason.programmers.problem77484;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int[] rank={6,6,5,4,3,2,1};
        int zero=0;
        int count=0;
        //일치 숫자 찾는다.
        //찾으면, 카운트
        //맞은 갯수
        //rank[맞은 갯수]= 순위
        for(int l: lottos){
            if(l==0){
                zero++;
                continue;
            }
            for(int num: win_nums){
                if(l==num)
                    count++;

            }
        }
        answer[0]=rank[zero+count];
        answer[1]=rank[count];



        return answer;
    }
}