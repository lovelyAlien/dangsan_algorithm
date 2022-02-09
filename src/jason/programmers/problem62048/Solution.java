package jason.programmers.problem62048;

class Solution {


    //유클리드 호제법
    static long getGcd(long a, long b){

        if(a%b==0)
            return b;

        return getGcd(b, a%b);
    }


    public long solution(int w, int h) {

        long big= w>=h? w:h;
        long small=w<h?w:h;
        long gcd=getGcd(big, small);

        //최소단위

        long a= w/gcd;
        long b=h/gcd;




        long answer = 1;

        answer=(long)w*(long)h-(a+b-1)*gcd;
        return answer;
    }
}
