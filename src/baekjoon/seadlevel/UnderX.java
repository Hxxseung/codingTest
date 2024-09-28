package baekjoon.seadlevel;

import java.util.Scanner;
import java.util.Random;

public class UnderX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < X){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
