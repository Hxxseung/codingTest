package baekjoon.bruteforce;

import java.util.Scanner;

public class Director_Shhom_ver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int Num = 666;
        int count = 1;

        while( count != n){
            Num++;
            if(String.valueOf(Num).contains("666")){
                count++;
            }
        }
        System.out.println(Num);
    }
}

//Baekjoon 1436 : memory : 89112KB / Time : 324ms