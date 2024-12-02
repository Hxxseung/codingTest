package baekjoon.deepending1;

import java.util.Scanner;

public class BeakJoon10988 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String origin = sc.nextLine();
        sb.append(origin);
        String reverse = String.valueOf(sb.reverse());
        if (origin.equals(reverse)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
