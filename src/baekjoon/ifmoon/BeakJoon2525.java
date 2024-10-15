package baekjoon.ifmoon;

import java.util.Scanner;

public class BeakJoon2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        int min =  a * 60  + b ;
        min += c;
        int hour = (min / 60) % 24;
        int minute = min % 60;
        System.out.println(hour + " " + minute);
    }
}
//시간 자동 계산(분단위) , 디지털 시계를 사용자한테 보여줌
//필요한 시간이 분 단위로 주어졌을 때  오븐구이가 끝나는 시각 계산 프로그램
//첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다.
// (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)