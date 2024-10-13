package baekjoon.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AlignCoordinates {
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
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else
                return e1[0] - e2[0];
        }
    });
    for(int i = 0; i < n; i++) {
        System.out.println(arr[i][0] + " " + arr[i][1]);
    }

    }
}

//BeakJoon 2750 : memory : 191968 KB / Time : 1824 ms


// 점의 개수 n개를 받음 -> 둘째 줄 부터 N개의 줄에 점의 위치가 주어짐. 좌표는 항상 정수 위치가 같은 두 점은 존재하지 않음
// x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램