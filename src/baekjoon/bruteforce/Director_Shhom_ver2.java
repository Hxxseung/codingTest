package baekjoon.bruteforce;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Director_Shhom_ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int num = 666;
        int count = 1;
        while( count != n) {
            num ++;
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}
// Beakjoon 1436 : memory : 89112KB / Time : 272ms