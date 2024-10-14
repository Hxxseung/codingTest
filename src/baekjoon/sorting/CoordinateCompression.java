package baekjoon.sorting;

import java.util.Scanner;

public class CoordinateCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] comp = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
            comp[i] = count;
        }

        for(int i = 0; i < n; i++){
            System.out.print(comp[i] + " ");
        }

    }
}
