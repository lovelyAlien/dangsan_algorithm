package binarysearch;

import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;

        Arrays.sort(times);
        long left = 0L;
        answer = (long)times[times.length-1] * n;

        while(left < answer) {
            long mid = (left + answer) / 2;
            long total = 0; // n 값과의 비교를 위한 변수 선언

            for (int i = 0; i < times.length; i++) {
                total = total + mid/times[i];
            }
            if (total < n) { // 시간이 부족한 상황
                left = mid + 1;
            } else { // 많은 시간이 소요된 상황
                answer = mid;
            }
        }
        return answer;
    }
}
