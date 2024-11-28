package baekjoon.deepending1;

import java.util.Scanner;

public class BeakJoon3003 {
    public static void main(String[] args) {
        int[] originchess = {1, 1, 2, 2, 2, 8};
        int[] findchess = new int[6];
        int[] needchess = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 6; i++) {
            findchess[i] = sc.nextInt();
        }

        for(int i = 0; i < 6; i++) {
            needchess[i] = originchess[i] - findchess[i];
        }

        for(int i = 0; i < 6; i++) {
            System.out.print(needchess[i] + " ");
        }
    }
}
