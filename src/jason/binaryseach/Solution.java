package jason.binaryseach;

import java.util.Arrays;


class Solution {
    public long solution(int n, int[] times) {
//        Arrays.sort(times);

        long answer = 0;
        long max= 0;

//        for(int i=0;i< times.length;i++){
//            if(max<times[i]) max=times[i];
//        }
        max=Arrays.stream(times).max().getAsInt();

        System.out.println(max);

        long max_time= max * n;
        
//        long max_time=n * (long)times[times.length - 1];


        long left = 1;
        long right = max_time;

        while (left <= right) {

            long mid = (left + right) / 2;
            long sum=0;
            for(int i=0; i<times.length;i++){
                sum+=mid/times[i];
            }
            if(sum< n)
                left=mid+1;

            else{
                right=mid-1;
                answer=mid;
            }

        }
        return answer;
    }
}