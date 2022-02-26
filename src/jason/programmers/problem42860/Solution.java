package jason.programmers.problem42860;

class Solution {
    public int solution(String name) {

        int answer=0;
        int min_move=name.length()-1;
        int len=name.length();

        for(int i=0;i<len;i++){
            char ch=name.charAt(i);
            answer+=Math.min(ch-'A', 'Z'-ch+1);

            int next=i+1;
            while(next<len && name.charAt(next)=='A'){
                next+=1;
            }

            min_move=Math.min(min_move, i+i+1+(len-1)-next);

        }

        answer+=min_move;
        return answer;
    }
}
