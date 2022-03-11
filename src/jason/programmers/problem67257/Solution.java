package jason.programmers.problem67257;

import java.util.ArrayList;
import java.util.List;

class Solution {
    static List<Long> numArr = new ArrayList<>();
    static List<Character> opArr = new ArrayList<>();
    static boolean[] visited = new boolean[3];
    static Character[] op = {'*', '+', '-'};
    static long answer = 0;

    public long solution(String expression) {


        String numChar = "";
        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);
            if (ch >= '0' && ch <= '9') {
                numChar += ch;
            } else {
                numArr.add(Long.parseLong(numChar));
                opArr.add(ch);
                numChar = "";
            }
        }
        numArr.add(Long.parseLong(numChar));


        //연산자, 피연산자 집합 생성
        //우선순위 설정


        dfs(0, new char[3]);

        return answer;
    }

    static public void dfs(int cnt, char[] p) {
        if (cnt == 3) {
            List<Long> copyOfNumArr = new ArrayList<>(numArr);
            List<Character> copyOfOpArr = new ArrayList<>(opArr);

            for (int i = 0; i < 3; i++)
                for (int j = 0; j < copyOfOpArr.size(); j++) {
                    if (p[i] == copyOfOpArr.get(j)) {

                        long num1= copyOfNumArr.remove(j);
                        long num2= copyOfNumArr.remove(j);
                        long num3= calc(num1, num2, p[i]);
                        copyOfNumArr.add(j, num3);
                        copyOfOpArr.remove(j);
                        j--;
                    }
                }

            answer = Math.max(Math.abs(copyOfNumArr.get(0)), answer);

        }

        for (int i = 0; i < 3; i++) {
            if (!visited[i]) {
                visited[i] = true;
                p[cnt] = op[i];
                dfs(cnt + 1, p);
                visited[i] = false;
            }
        }

    }


    static public Long calc(long num1, long num2, char op) {
        if (op == '*')
            return num1 * num2;

        else if (op == '+')
            return num1 + num2;

        else
            return num1 - num2;
    }
}
