package Lv0;

import java.util.Scanner;

public class printTurnstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = new String[str.length()];
        for(int i = 0; i < str.length(); i++) {
            String ch = String.valueOf(str.charAt(i));
            arr[i] = ch;
        }
        for(int i = 0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
