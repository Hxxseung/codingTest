package baekjoon.bruteforce;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Director_Shhom_ver4 {

    public static boolean Check666(int num) {
        String strNum = String.valueOf(num);
        for (int i = 0; i <= strNum.length() - 3; i++) {
            if (strNum.charAt(i) == '6' && strNum.charAt(i + 1) == '6' && strNum.charAt(i + 2) == '6') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 666;
        int count = 1;

        while (count != n) {
            num++;
            if (Check666(num)) {
                count++;
            }
        }
        System.out.println(num);
    }
}

// Beakjoon 1436 : memory : 80628KB / Time : 260ms