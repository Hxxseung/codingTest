package baekjoon.array;

import java.util.Scanner;

public class BeakJoon10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int j = 0; j < m; j++) {
            int I = sc.nextInt();
            int J = sc.nextInt();

            temp = arr[I - 1];
            arr[I - 1] = arr[J - 1];
            arr[J - 1] = temp;
        }

        sc.close();

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
