package jason.programmers.problem42746;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {

        StringBuffer answer = new StringBuffer();


        //문자열 치환
        //정렬
        //2개씩 봅아서 앞, 뒤로 합치고, 비교해서 큰 수를 answer에 붙인다.
        String[] numbersToString=new String[numbers.length];

        for(int i=0; i<numbers.length; i++){
            numbersToString[i]=Integer.toString(numbers[i]);
        }

        Arrays.sort(numbersToString, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return (o2+o1).compareTo(o1+o2);
            }
        });

        //주의!
        // String 비교는 ==으로 하면 안된다!
//        if(numbersToString[0]=="0")
//            return "0";

        if(numbersToString[0].equals("0"))
            return "0";

        for(String n: numbersToString){
            answer.append(n);
        }


        return answer.toString();
    }
}
