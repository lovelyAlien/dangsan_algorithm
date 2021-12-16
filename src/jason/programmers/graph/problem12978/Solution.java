package jason.programmers.graph.problem12978;

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    static final int INF = 500001;

    class Edge implements Comparable<Edge> {

        int to, weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge e) {
            return this.weight - e.weight;
        }
    }

    private void dijkstra(int N, PriorityQueue<Edge> pq, int[][] graph, int[] dist) {
        while (!pq.isEmpty()) {

            Edge edge = pq.poll();
            int cur = edge.to;
            int weight = edge.weight;

            for (int i = 1; i <= N; i++) {
                if (dist[cur] + graph[cur][i] < dist[i]) {
                    dist[i] = weight + graph[cur][i];
                    pq.offer(new Edge(i, dist[i]));
                }
            }

        }
    }

    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        int[] dist = new int[N + 1];

        Arrays.fill(dist, INF);

        int[][] graph = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) continue;
                graph[i][j] = INF;
            }
        }


        //그래프 가중치 세팅


        for (int i = 0; i < road.length; i++) {
            int n1 = road[i][0];
            int n2 = road[i][1];
            int d = road[i][2];
            if(d<graph[n1][n2]){
                graph[n1][n2] = d;
                graph[n2][n1] = d;
            }

        }


        //1->1 최단거리는 0
        dist[1] = 0;


        //큐에 넣는다.
        pq.offer(new Edge(1, 0));

        dijkstra(N, pq, graph, dist);


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        for (int i = 1; i <= N; i++) {

            if (dist[i] <= K) {
                System.out.println(i);
                answer++;
            }

        }


        return answer;
    }
}
