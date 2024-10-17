package baekjoon.dimensionalarray1;

import java.util.Scanner;

public class BeakJoon10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        for(int i = 0; i < n; i++) {
            if (arr[i] == v) {
                count++;
            }
        }
        System.out.println(count);
    }
}
