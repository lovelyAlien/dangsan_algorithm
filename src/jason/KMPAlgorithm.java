package jason;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KMPAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] strArr = str.toCharArray();
        String sub = sc.nextLine();
        char[] subArr = sub.toCharArray();


        int[] table = makeTable(subArr);

        System.out.println(Arrays.toString(table));
        List<Integer> answer = new ArrayList<>();
        solution(strArr, subArr, table, answer);


    }

    private static List<Integer> solution(char[] strArr, char[] subArr, int[] table, List<Integer> answer) {

        int j = 0;
        for (int i = 0; i < strArr.length; i++) {
            while (strArr[i] != subArr[j] && j > 0) {
                j = table[j - 1];
            }

            if (strArr[i] == subArr[j]) {
                if (j == subArr.length - 1) {
                    answer.add(i - j);
                    j = table[j];
                } else
                    ++j;

            }


        }

        System.out.println(answer.toString());
        return answer;

    }

    private static int[] makeTable(char[] subArr) {

        int len = subArr.length;

        int[] table = new int[len];

        int j = 0;

        for (int i = 1; i < len; i++) {


            while (j > 0 && subArr[i] != subArr[j]) {
                j = table[j - 1];
            }
            if (subArr[i] == subArr[j]) {
                table[i] = ++j;
            }


        }

        return table;


    }


}
