package baekjoon.printer;

import java.util.Scanner;

public class QQ {

    public void mark(String str){
        System.out.println(str + "??!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QQ qq = new QQ();
        String str = sc.nextLine();
        qq.mark(str);
    }
}
