package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 테스트를 위한 코드로 작성

public class Problem42840 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("몇개 입력?");
        int num = Integer.parseInt(br.readLine());
        int[] answer = new int[num];
        for (int j = 0; j < num; j++) {
            answer[j] = Integer.parseInt(br.readLine());
        }

//        int[] answer = {};

        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 정답 맞춘 갯수
        int one_cnt = 0;
        int two_cnt = 0;
        int three_cnt = 0;

        for (int i = 0; i < answer.length; i++) {

            if (one[i % 5] == answer[i]) {
                one_cnt++;
            }

            if (two[i % 8] == answer[i]) {
                two_cnt++;
            }

            if (three[i % 10] == answer[i]) {
                three_cnt++;
            }
        }
        List<Integer> orderList = new ArrayList<>();
        int maxValue = Math.max(Math.max(one_cnt, two_cnt), three_cnt);
        System.out.println("maxValue = " + maxValue);
        if (maxValue==one_cnt) {
            orderList.add(1);
        }

        if (maxValue==two_cnt) {
            orderList.add(2);
        }

        if (maxValue==three_cnt) {
            orderList.add(3);
        }

        answer = orderList.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(answer));
    }
}
