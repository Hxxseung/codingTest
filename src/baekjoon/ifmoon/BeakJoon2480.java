package baekjoon.ifmoon;

import java.util.Scanner;

public class BeakJoon2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int temp = 0;
        int coin = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            coin = 10000 + arr[0] * 1000; // 모두 같은 경우
        } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
            coin = 1000 + arr[1] * 100; // 두 개가 같은 경우
        } else {
            coin = arr[2] * 100; // 모두 다른 경우
        }


        System.out.println(coin);

    }
}
/*
같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
 */