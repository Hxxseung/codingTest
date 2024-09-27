package baekjoon;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String y = sc.next();
        int result = 0;

        sc.close();

        for(int i=0; i<x; i++) {
            result += Integer.parseInt(y.substring(i, i+1));    //y.substring을 통해 문자열 y에서 i번째 문자만 추출
                                                                //substring method => 첫 번째 인덱스(i)에서 시작하여 두 번째 인덱스(i + 1) 바로 앞까지의 부분 문자열을 반환
                                                                //result => i번째만 반환
                                                                //ex) 12345입력 => (y.substring(2,3))은 "3"을 반환 <- 1(0)2(1)3(2)4(3)5(4)이므로 2번째 위치인 "3"반환
        }
        System.out.println(result);
    }
}
