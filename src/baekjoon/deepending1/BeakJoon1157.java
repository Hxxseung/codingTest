package baekjoon.deepending1;

import java.util.Scanner;

public class BeakJoon1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        a = a.toUpperCase();

        int[] count = new int[26];
        int max = 0;
        char res = 0;
        int check = 0;

        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 65]++;
            if (max < count[a.charAt(i) - 65]) {
                max = count[a.charAt(i) - 65];
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (max == count[i]) {
                check++;
                if (check > 1) {
                    res = '?';
                } else {
                    res = (char) (i + 65);
                }
            }

        }

        System.out.println(res);

    }

}