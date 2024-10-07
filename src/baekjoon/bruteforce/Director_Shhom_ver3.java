package baekjoon.bruteforce;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Director_Shhom_ver3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int num = 666;
        int count = 0;

        while (count < n) {
            if (Check666(num)) {
                count++;
            }
            num++;
        }

        System.out.println(num - 1);
    }

    private static boolean Check666(int number) {
        return String.valueOf(number).contains("666");
    }
}
//Baekjoon 1436 : memory : 85464KB / Time : 252ms