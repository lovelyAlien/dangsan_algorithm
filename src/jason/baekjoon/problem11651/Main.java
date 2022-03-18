package jason.baekjoon.problem11651;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        int tc=sc.nextInt();
        List<int[]> xy_list=new ArrayList<>();
        for( int i=0;i<tc;i++){
            int x= sc.nextInt();
            int y= sc.nextInt();

            xy_list.add(new int[]{x,y} );

        }

        Collections.sort(xy_list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                if(o1[1]!=o2[1]){
                    return Integer.compare(o1[1], o2[1]);
                }

                else{
                    return Integer.compare(o1[0],o2[0]);
                }

            }
        });

        for(int i=0;i<xy_list.size();i++){
            System.out.println(xy_list.get(i)[0]+" "+ xy_list.get(i)[1]);
        }
    }
}
