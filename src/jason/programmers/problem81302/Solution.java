package jason.programmers.problem81302;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[5];

        for (int i = 0; i < places.length; i++) {
            String[] place = places[i];
            Boolean isOk = true;


            for (int r = 0; r < 5 && isOk; r++) {
                for (int c = 0; c < 5 && isOk; c++) {
                    if (place[r].charAt(c) == 'P') {
                        if (!bfs(r, c, place)) {
                            isOk = false;
                        }
                    }
                }
            }

            answer[i] = isOk ? 1 : 0;
        }


        return answer;
    }

    private boolean bfs(int r, int c, String[] place) {
        boolean[][] visited = new boolean[5][5];
        int[] dr = {0, 0, -1, 1};
        int[] dc = {-1, 1, 0, 0};
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[]{r, c});
        visited[r][c] = true;
        while (!queue.isEmpty()) {

            int[] pos = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nr = pos[0] + dr[i];
                int nc = pos[1] + dc[i];
                int len = Math.abs(r - nr) + Math.abs(c - nc);
                if (nr < 0 || nr >= 5 || nc < 0 || nc >= 5 || visited[nr][nc]) continue;
                if (visited[nr][nc] || len > 2) continue;
                if (place[nr].charAt(nc) == 'X') continue;
                else if (place[nr].charAt(nc) == 'P') return false;
                else {
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc});
                }

            }
        }

        return true;
    }
}
