package baekjoon.seadlevel;

import java.util.Scanner;

public class RepeatPrintPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int arr[] = new int[c];

        for(int i = 0; i < c; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a + b;
        }
        sc.close();

        for(int k : arr){
            System.out.println(k);
        }
    }
}
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.