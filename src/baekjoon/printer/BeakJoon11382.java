package baekjoon.printer;

import java.util.Scanner;

public class BeakJoon11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        System.out.println(a+b+c);
    }
}

//int 형으로 풀리지 않는 문제다. int 형으로 풀 경우 런타임 에러가 난다.