package jason.danbi.problem3;

import java.util.ArrayList;
import java.util.List;

class Solution {
    static int answer=0;
    public int solution(int N, int[][] relation, String[] dirname) {


        List<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0;i<N;i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0;i<relation.length;i++){
            int parent=relation[i][0];
            int child= relation[i][1];

            graph.get(parent-1).add(child-1);
        }

        dfs(0, dirname[0].length(), graph, dirname);
        return answer;
    }

    static void dfs(int node, int max, List<ArrayList<Integer>> graph, String[] dirname){
        if(graph.get(node).isEmpty()){
            if(max>answer) answer=max;
            return;
        }

        for(int i=0;i<graph.get(node).size();i++){
            int n_node= graph.get(node).get(i);
            int n_len= dirname[n_node].length();
            dfs(n_node,max+1+n_len, graph, dirname);
        }
    }
}
