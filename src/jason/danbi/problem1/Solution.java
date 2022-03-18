package jason.danbi.problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int solution(int n, int[] v) {
        int answer = -1;


        int[] min= new int[n];
        List<int[]> v_list= new ArrayList<>();
        for(int i=0;i< n;i++){
            v_list.add(new int[]{i, v[i]});
        }
        Collections.sort(v_list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]<o2[1]) return -1;
                else if(o1[1]>o2[1]) return 1;
                else return 0;
            }
        });

        int v_next=0;
        int m_next=0;
        while(m_next<n){
            int v_idx= v_list.get(v_next)[0];
            int v_value=v_list.get(v_next)[1];

            if(m_next<v_idx){
                min[m_next]= v_value;
                m_next++;
            }
            else if(m_next==v_idx){
                min[m_next]= v_value;
                m_next++;
                v_next++;
            }
            else{
                v_next++;
            }

        }

        for(int i=0; i<n-1;i++){
            int gap= v[i]-min[i+1];
            if(answer<gap) answer=gap;

        }


        return answer;
    }
}
