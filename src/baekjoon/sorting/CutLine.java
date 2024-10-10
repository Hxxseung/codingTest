package baekjoon.sorting;

import java.util.Scanner;

public class CutLine {
    public static void main(String[] args) {
        int temp = 0;
        int cutscore = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //응시인원
        int k = sc.nextInt();   //수상인원
        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  //배열에 점수 대입
        }

        for (int i = 0; i < arr.length-1;  i++) {   //버블 정렬
            for (int j = 0; j < arr.length -1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        cutscore = arr.length - k ;
        System.out.println(arr[cutscore]);
    }
}

//BeakJoon 25305 : memory : 21224 KB / Time : 236 ms
