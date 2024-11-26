package baekjoon.string;

import java.util.Scanner;

public class BeakJoon2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int n = sc.nextInt();
        int m = sc.nextInt();

        sb1.append(n);
        sb2.append(m);
        sb1.reverse();
        sb2.reverse();

        int reversedN = Integer.parseInt(sb1.toString());
        int reversedM = Integer.parseInt(sb2.toString());

        System.out.println(Math.max(reversedN, reversedM));
    }
}
