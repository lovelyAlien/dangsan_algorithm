package jason.socar.problem1;

import java.util.*;

public class Solution {
    static ArrayList<ArrayList<int[]>> graph;
    static Set<Integer> answer;

    public int[] solution(int n, int k, int[][] roads) {
        answer= new HashSet<>();
        graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < roads.length; i++) {
            int x = roads[i][0];
            int y = roads[i][1];
            int len = roads[i][2];

            graph.get(x).add(new int[]{y, len});
            graph.get(y).add(new int[]{x, len});
        }

        for (int i = 0; i < graph.get(0).size(); i++) {
            int[] next = graph.get(0).get(i);
            dfs(0, next[0], next[1], k);
        }

//        for(int i=0;i<graph.size();i++){
//            for(int j=0;j<graph.get(i).size();j++){
//                System.out.println(Arrays.toString(graph.get(i).get(j)));
//            }
//        }

        if(answer.isEmpty())
            return new int[]{-1};

        return answer.stream()
                .mapToInt(i->i)
                .toArray();

    }

    static public void dfs(int start, int end, int time, int k) {

        if (time == k) {
            answer.add(end);
        }
        else if(time>k){
            return;
        }
        else{
            for(int i=0;i<graph.get(end).size();i++){
                int[] next=graph.get(end).get(i);
                dfs(start,next[0],next[1]+time, k);
            }
        }
    }


}
