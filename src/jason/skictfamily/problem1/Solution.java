package jason.skictfamily.problem1;

import java.util.*;

class Solution {
    public int solution(int money, int[] costs) {
        int answer = 0;
        List<int[]> costList= new ArrayList<>();
        for(int i=0;i<costs.length;i++){
            if(i==0){
                costList.add(new int[]{1,costs[i]});
            }
            else if(i==1){
                costList.add(new int[]{5,costs[i]});
            }
            else if(i==2){
                costList.add(new int[]{10,costs[i]});
            }
            else if(i==3){
                costList.add(new int[]{50,costs[i]});
            }
            else if(i==4){
                costList.add(new int[]{100,costs[i]});
            }
            else{
                costList.add(new int[]{500,costs[i]});
            }
        }

        Collections.sort(costList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                double o1_ratio=(double)o1[1]/o1[0];
                double o2_ratio=(double)o2[1]/o2[0];
                if(o1_ratio<o2_ratio) return -1;
                else if(o1_ratio>o2_ratio) return 1;
                else return 0;
            }
        });

        for(int i=0;i<costList.size();i++){
            int cost=costList.get(i)[0];
            int r_cost=costList.get(i)[1];
            answer+=(money/cost) * r_cost;
            money=money%cost;


        }


        return answer;
    }
}
