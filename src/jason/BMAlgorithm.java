package jason;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BMAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] strArr = str.toCharArray();
        String sub = sc.nextLine();
        char[] subArr = sub.toCharArray();
        int[] skip=initSkip(subArr);


        List<Integer> answer= new ArrayList<>();
        solution(strArr, subArr,answer,skip);


    }

    private static int[] initSkip(char[] subArr) {
        int[] skip=new int[27];
        for(int i=0; i<27;i++){
            skip[i]=-1;
        }

        for(int i=subArr.length-1;i>=0;i--){
            if(skip[i]==-1)
                skip[(int)subArr[i]-(int)'A']=subArr.length-1-i;
        }
        return skip;
    }

    private static List<Integer> solution(char[] strArr, char[] subArr, List<Integer> answer, int[] skip) {
        int i=subArr.length-1;
        int j=subArr.length-1;

        while(i<strArr.length){
            if(j==-1){
                j=subArr.length-1;
                i=i+subArr.length+1;

            }

            if(strArr[i]==subArr[j]){
                i=i-1;
                j=j-1;
            }
            else{
                int gap=skip[(int)strArr[i]];

            }
        }
        return null;

    }
}
