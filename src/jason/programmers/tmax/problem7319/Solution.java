package jason.programmers.tmax.problem7319;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();



        for(int i=1;i<=a;i++){
            StringBuffer str=new StringBuffer();
            for(int j=0;j<i;j++){
                str.append("*");
            }
            System.out.println(str);
        }


    }
}
