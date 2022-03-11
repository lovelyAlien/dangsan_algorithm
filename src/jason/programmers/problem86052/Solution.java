package jason.programmers.problem86052;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    static boolean[][][] visited;
    static int[] dr = {0, -1, 0, 1};
    static int[] dc = {-1, 0, 1, 0};

    static int getCycle(int r, int c, int i, int cnt, String[] grid) {
        int R = grid.length;
        int C = grid[0].length();
        while (true) {
            if (visited[r][c][i]) break;
            visited[r][c][i] = true;
            r = (r + dr[i] + R) % R;
            c = (c + dc[i] + C) % C;

//            if (i == 0 && nc == -1) nc = C - 1;
//            else if (i == 1 && nr == -1) nr = R - 1;
//            else if (i == 2 && nc == C) nc = 0;
//            else if (i == 3 && nr == R) nr = 0;

            if (grid[r].charAt(c) == 'S') {
                i = i;
            } else if (grid[r].charAt(c) == 'R') {
                i = i + 1;
            } else {
                i = i - 1;
            }
            if (i == -1) i = 3;
            else if (i == 4) i = 0;

            cnt++;
        }
        return cnt - 1;
    }

    public int[] solution(String[] grid) {
        int[] answer = {};
        List<Integer> cycleList = new ArrayList<>();

        int R = grid.length;
        int C = grid[0].length();

        visited = new boolean[R][C][4];
        for (int r = 0; r < R; r++)
            for (int c = 0; c < C; c++)
                for (int i = 0; i < 4; i++) {
                    if (visited[r][c][i]) continue;

                    cycleList.add(getCycle(r, c, i, 1, grid));
                }

        Collections.sort(cycleList);

        answer = new int[cycleList.size()];
        for (int i = 0; i < cycleList.size(); i++) {
            answer[i] = cycleList.get(i);
        }


        return answer;
    }
}
