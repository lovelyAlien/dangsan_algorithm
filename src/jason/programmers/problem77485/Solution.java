package jason.programmers.problem77485;

class Solution {
    static int[][] graph;

    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        graph = new int[rows][columns];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) {
                graph[i][j] = i * columns + j + 1;
            }

        for (int i = 0; i < queries.length; i++) {
            answer[i] = rotate(queries[i]);
        }
        return answer;
    }


    public static int rotate(int[] query) {

        int r1 = query[0] - 1;
        int c1 = query[1] - 1;
        int r2 = query[2] - 1;
        int c2 = query[3] - 1;

        int tmp = graph[r1][c1];
        int min = tmp;

        for (int r = r1; r < r2; r++) {
            graph[r][c1] = graph[r + 1][c1];
            if (min>graph[r][c1]) min=graph[r][c1];
        }

        for (int c = c1; c < c2; c++) {
            graph[r2][c] = graph[r2][c + 1];
            if (min>graph[r2][c]) min=graph[r2][c];
        }

        for (int r = r2; r > r1; r--) {
            graph[r][c2] = graph[r - 1][c2];
            if (min>graph[r][c2]) min=graph[r][c2];
        }

        for (int c = c2; c > c1 + 1; c--) {
            graph[r1][c] = graph[r1][c - 1];
            if (min>graph[r1][c]) min=graph[r1][c];
        }

        graph[r1][c1 + 1] = tmp;


        return min;
    }

}
