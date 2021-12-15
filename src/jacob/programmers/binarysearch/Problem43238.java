package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem43238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("n 입력 : ");
        int n = Integer.parseInt(br.readLine());

        int[] times = new int[2];

        System.out.print("공백을 기준으로 두 숫자 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < times.length; i ++) {
            times[i] = Integer.parseInt(st.nextToken());
        }

//        System.out.println(Arrays.toString(times));

        /* 코드 시작 */
        Arrays.sort(times);
        long left = 0;
        long right = (long)times[times.length-1] * n; // 시간이 가장 오래 걸리는 최대 시간

        while (left < right) {
            long mid = (left + right) / 2;
            long total = 0;

            for (int i = 0; i < times.length; i++) {
                total += mid/times[i];
            }
            if (total < n) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        System.out.println(right);
    }
}
