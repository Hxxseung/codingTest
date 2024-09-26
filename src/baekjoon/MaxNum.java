package baekjoon;

import java.util.Scanner;

public class MaxNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        int max = num[0];      //배열로 초기화
        int count = 0;
        for (int i = 0; i < 9; i++) {
            num[i] = sc.nextInt();
        }
        for(int i = 0 ; i < 9 ; i++){
            if(num[i] > max){
                max = num[i];
                count = i;
            }
        }
        System.out.println(max);
        System.out.println(count+1);    //0부터 시작이므로 1 추가
    }
}


//Q : 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.