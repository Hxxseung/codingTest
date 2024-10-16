package baekjoon.recursion;

import java.util.Scanner;

public class factorial2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }

    public static long factorial(int num){  // int로 자료형을 둘 경우 20!구할 때 처리 할 수 없어 음수 값으로 나오게 된다.
        if( num <= 0 ){ //범위 주의  num == 0 은 불가능 함.
            return 1;
        }

        return num * factorial(num - 1);

    }
}


