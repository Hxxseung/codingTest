package baekjoon.sorting;

import java.util.Scanner;

public class RepresentativeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int sum = 0;
        int center = 0;
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length-1;  i++) {
            for (int j = 0; j < arr.length -1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        center = arr[2];
        System.out.println(sum / arr.length);
        System.out.println(center);
    }
}


//BeakJoon 2587 : memory : 17636 KB / Time : 168 ms