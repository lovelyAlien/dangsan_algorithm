package jason;

import java.util.Scanner;

public class SubStringSearchAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] strArr=str.toCharArray();
        String sub= sc.nextLine();
        char[] subArr=sub.toCharArray();

        int answer= solution(strArr, subArr);

        System.out.println(answer);


    }

    private static int solution(char[] strArr, char[] subArr) {
        for(int i=0;i<strArr.length-subArr.length+1;i++){
            int tmp=i;
            boolean flag=true;

            for(int j=0;j<subArr.length;j++){
                if(subArr[j]==strArr[tmp])
                    tmp++;

                else{
                    flag=false;
                    break;
                }


            }

            if(flag) return i;

        }
        return -1;
    }
}
