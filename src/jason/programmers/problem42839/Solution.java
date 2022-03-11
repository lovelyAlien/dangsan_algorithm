package jason.programmers.problem42839;

import java.util.HashSet;
import java.util.Iterator;


class Solution {

    static int answer = 0;

    static HashSet<Integer> numbersSet = new HashSet<>();

    public int solution(String numbers) {
        int len = numbers.length();





        dfs("", numbers);

        Iterator<Integer> it = numbersSet.iterator();

        while (it.hasNext()) {
            int number = it.next();
            if (isPrime(number))
                answer++;
        }

        return answer;
    }

    static public void dfs(String comb, String others) {
        if (!comb.equals("")) numbersSet.add(Integer.valueOf(comb));
        for (int i = 0; i < others.length(); i++)
            dfs(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));

    }

    static public boolean isPrime(int num){
        if(num==1 || num==0) return false;

        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }


}


