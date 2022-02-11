package jason.programmers.problem92334;


import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {


        Map<String, Set<String>> reportersOfTargetMap = new HashMap<>();
        Map<String, Integer> indexOfIdMap = new HashMap<>();
        int[] answer = new int[id_list.length];
        //초기화
        for (int i = 0; i < id_list.length; i++) {
            reportersOfTargetMap.put(id_list[i], new HashSet<>());
            indexOfIdMap.put(id_list[i], i);
        }

        for (int i = 0; i < report.length; i++) {
            String[] r = report[i].split(" ");
            String reporter = r[0];
            String target = r[1];
            reportersOfTargetMap.get(target).add(reporter);
        }

        for (int i = 0; i < id_list.length; i++) {
            String targetId = id_list[i];
            Set<String> reporters = reportersOfTargetMap.get(targetId);
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    Integer idx = indexOfIdMap.get(reporter);
                    answer[idx] += 1;
                }
            }
        }

        return answer;
    }
}
