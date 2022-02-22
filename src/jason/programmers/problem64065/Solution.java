package jason.programmers.problem64065;

import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        Set<Integer> elements=new HashSet<>();

        //집합 분리
        s= s.substring(2,s.length()-2);

        String[] setList= s.split("\\},\\{");
        answer=new int[setList.length];
        Arrays.sort(setList, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
//                if(o1.length()<o2.length()) return -1;
//                else if(o1.length()>o2.length()) return 1;
//                else return 0;
                return Integer.compare(o1.length(), o2.length());
            }
        });

        //각 집합, 원소 분리
        //원소 포함 확인
        for(int i=0;i< setList.length;i++){
            String[] tmp=setList[i].split(",");
            for(String t: tmp){
                Integer e=Integer.parseInt(t);
                if(!elements.contains(e)){
                    elements.add(e);
                    answer[i]=e;
                }
            }
        }

        return answer;




    }
}
