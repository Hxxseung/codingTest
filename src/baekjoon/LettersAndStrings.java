package baekjoon;

import java.util.Scanner;

public class LettersAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letters = sc.next();
        int num = sc.nextInt()-1;                   // charAt()이 0번째 부터 시작하기 때문에 입려받는 정수 num에 -1

        System.out.println(letters.charAt(num));    // charAt(num) = > num번째 String을 반환해줌
    }
}
//단어와 정수가 주어졌을 때,단어의 S번째 글자를 출력하는 프로그램을 작성하시오.


