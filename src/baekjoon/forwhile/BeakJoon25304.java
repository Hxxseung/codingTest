package baekjoon.forwhile;

import java.util.Scanner;

public class BeakJoon25304 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a * b;
        }
        if( X == sum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
//문제를 잘 읽자.. 대소문자 확인하자..