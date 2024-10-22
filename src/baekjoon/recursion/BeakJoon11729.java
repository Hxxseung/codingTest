package baekjoon.recursion;

import java.util.Scanner;

public class BeakJoon11729 {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sb.append( (int) (Math.pow(2 , N) - 1 )).append('\n');

        Hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }

    private static void Hanoi(int N, int Start, int Mid, int End) {

        if (N == 1){
            sb.append(Start + " " + End + "\n");
            return;
        }

        Hanoi(N-1, Start, End, Mid);

        sb.append(Start + " " + End + "\n");

        Hanoi(N - 1, Mid, Start, End);
    }
}
