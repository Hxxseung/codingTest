package baekjoon.forwhile;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class BeakJoon15552 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int c = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for( int i = 1; i <= n; i++ ) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            c = a + b;
            list.add(parseInt(String.valueOf(c)));
        }

        for(int value : list){
            sb.append(value).append("\n");
        }
        System.out.println(sb);


    }
}
