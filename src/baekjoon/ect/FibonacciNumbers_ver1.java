package baekjoon.ect;

import java.util.Scanner;

public class FibonacciNumbers_ver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fibonacci = new int[46];
        fibonacci[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println(fibonacci[n]);
    }
}


// Beakjoon 2747 : memory : 17696 KB / Time : 172ms