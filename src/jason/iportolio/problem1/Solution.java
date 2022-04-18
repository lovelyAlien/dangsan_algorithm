package jason.iportolio.problem1;

class Solution {
    public int solution(int n) {
        int answer = 1;
        boolean[] visited= new boolean[n+1];

        for(int i=2;i<=n;i++){
            if(!visited[i]){
                visited[i]=true;
                for(int j=i+i;j<=n;j+=i){
                    if(!visited[j]){
                        answer+=1;
                        visited[j]=true;
                    }
                }
            }
        }

        return answer;
    }
}
