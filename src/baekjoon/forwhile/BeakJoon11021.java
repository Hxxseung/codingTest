package baekjoon.forwhile;

import java.util.Scanner;

public class BeakJoon11021 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for (int i = 1; i <= a; i++) {
            int c = in.nextInt();
            int d = in.nextInt();

            System.out.println("Case #" + i + ": " + (c + d));
        }

        in.close();
    }
}