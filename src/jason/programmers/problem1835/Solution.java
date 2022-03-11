package jason.programmers.problem1835;

class Solution {
    static int answer;
    static char[] names = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
    static char[] result = {'0', '0', '0', '0', '0', '0', '0', '0'};


    static int searchIndex(char p) {
        for (int i = 0; i < 8; i++) {
            if (result[i] == p)
                return i;
        }
        return (-1);
    }


    static boolean validate(String condition) {


        //피연사자, 연산자
        char p1 = condition.charAt(0);
        char p2 = condition.charAt(2);
        char op = condition.charAt(3);
        int wall = condition.charAt(4) - 48;
        int gap = searchIndex(p1) - searchIndex(p2);
        if (gap < 0)    // 거리 값이 음수면 양수로 변환
            gap *= -1;
        //조건 확인
        if (op == '=' && gap - 1 == wall)
            return true;
        else if (op == '<' && gap - 1 < wall)
            return true;

        else if (op == '>' && gap - 1 > wall)
            return true;

        return false;
    }


    static void dfs(int cnt, int n, String[] data) {

        if (cnt == 8) {
            for (int i = 0; i < n; i++) {
                if (!validate(data[i]))
                    return;
            }
            answer += 1;
            return;

        }

        for (int i = 0; i < 8; i++) {

            if (searchIndex(names[i]) == -1) { //중복 검사
                result[cnt] = names[i];
                dfs(cnt + 1, n, data);
                result[cnt] = '0';
            }

        }


    }


    public int solution(int n, String[] data) {
        answer = 0;
        dfs(0, n, data);
        return answer;
    }


}
