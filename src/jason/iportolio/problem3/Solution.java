package jason.iportolio.problem3;

class Solution {
    public int solution(int n) {
        int answer = 0;

        int cnt=0;

        while(n!=0){
            int m= (int)Math.sqrt(n);
            n-=m*m;
            cnt+=1;
        }
        answer=cnt;


        return answer;


    }
}