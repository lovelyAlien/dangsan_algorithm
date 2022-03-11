package jason.programmers.problem17677;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;

        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();
        List<String> gong = new ArrayList<>();
        List<String> haub = new ArrayList<>();


        //소문자로 통일
        str1 = str1.toLowerCase(Locale.ROOT);
        str2 = str2.toLowerCase(Locale.ROOT);


        //두 글자 씩 나눠서 영문자만 집합에 저장
        for (int i = 0; i < str1.length() - 1; i++) {
            char a = str1.charAt(i);
            char b = str1.charAt(i + 1);

            if (a >= 'a' && a <= 'z' && b >= 'a' && b <= 'z') {
                arr1.add(a + "" + b);

            }
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            char a = str2.charAt(i);
            char b = str2.charAt(i + 1);

            if (a >= 'a' && a <= 'z' && b >= 'a' && b <= 'z') {
                arr2.add(a + "" + b);

            }
        }

        //비교 성능을 높이기 위해 정렬
        Collections.sort(arr1);
        Collections.sort(arr2);


        //arr2에 s가 있으면 삭제, 없으면 패스
        for (String s : arr1) {
            if (arr2.remove(s))
                gong.add(s);

            haub.add(s);

        }


        //남은 arr2을 haub에 모두 저장
        haub.addAll(arr2);

        int gong_len = gong.size();
        int haub_len = haub.size();

        //둘다 공집합 일 경우 고려
        if(haub_len==0) return 65536;

        answer = (int) (((double) gong_len / (double) haub_len) * 65536);

        return answer;


    }
}
