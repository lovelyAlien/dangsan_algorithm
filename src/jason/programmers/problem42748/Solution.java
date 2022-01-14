
package jason.programmers.problem42748;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        //커맨드 마다 함수를  실행한다.
        //원소를 자른다. 새 배열에 넣는다. 정렬한다. 찾는다.
        //결과값을 answer 배열에 넣는다.

        int[] answer = new int[commands.length];
        int idx = 0;

        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];

            int[] slice = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(slice);
            answer[idx++] = slice[k - 1];
        }

        return answer;
    }
}


