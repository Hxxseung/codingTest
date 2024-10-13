package baekjoon.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AlignCoordinates2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] e1, int[] e2) {
                if (e1[1] == e2[1]) {
                    return e1[0] - e2[0];
                } else
                    return e1[1] - e2[1];
            }
        });
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }
}

//BeakJoon 11651 : memory : 190812 KB / Time : 1876 ms