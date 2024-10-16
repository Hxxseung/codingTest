package baekjoon.recursion;

import java.util.Scanner;

public class Fibonacci5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        int[] fib = new int[21];
        fib[1] = 1;
        if(n == 1) {
            return fib[1];
        }else if(n == 0 ){
            return fib[0];
        }
        return fib[n] = fib(n-1) + fib(n-2);
    }
}
