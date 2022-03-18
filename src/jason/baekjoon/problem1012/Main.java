package jason.baekjoon.problem1012;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int[] r_dir = {-1, 0, 1, 0};
    static int[] c_dir = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int R = sc.nextInt();
            int C = sc.nextInt();
            int K = sc.nextInt();
            int[][] graph = new int[R][C];
            boolean[][] visited = new boolean[R][C];
            int cnt = 0;
            for (int j = 0; j < K; j++) {
                graph[sc.nextInt()][sc.nextInt()] = 1;
            }

            for (int r = 0; r < R; r++)
                for (int c = 0; c < C; c++) {
                    if (graph[r][c] == 1 && !visited[r][c]) {
                        bfs(r, c, graph, visited);
                        cnt++;
                    }
                }

            System.out.println(cnt);
        }

    }

    static void bfs(int r, int c, int[][] graph, boolean[][] visited) {
        int R = graph.length;
        int C = graph[0].length;
        visited[r][c] = true;
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{r, c});

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            for (int i = 0; i < 4; i++) {
                int nr = cur[0] + r_dir[i];
                int nc = cur[1] + c_dir[i];

                if (nr >= 0 && nr < R && nc >= 0 && nc < C && !visited[nr][nc] && graph[nr][nc]!=0) {
                    visited[nr][nc] = true;
                    q.add(new int[]{nr, nc});

                }

            }
        }
    }


}
