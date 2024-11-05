package baekjoon.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BeakJoon3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> remainders = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            remainders.add(n % 42);
        }

        System.out.println(remainders.size());
    }
}
