package jason.programmers.problem60057;

class Solution {
    public int solution(String s) {
        int answer = s.length();

        for (int i = 1; i <= s.length() / 2; i++) {
            int size = s.length();
            int cp = 0;

            for (; cp + i <= s.length(); ) {
                String unit = s.substring(cp, cp + i);
                int cnt = 0;
                cp += i;
                for (; cp + i <= s.length(); ) {
                    String next = s.substring(cp, cp + i);
                    if (unit.equals(next)) {
                        cnt++;
                        cp += i;
                    } else
                        break;

                }

                if (cnt > 0) {
                    size -= i * cnt;
                    if (cnt + 1 < 10) size += 1;
                    else if (cnt + 1 < 100) size += 2;
                    else if (cnt + 1 < 1000) size += 3;
                    else size += 4;
                }


            }
            if (answer > size) answer = size;
        }

        return answer;
    }
}
