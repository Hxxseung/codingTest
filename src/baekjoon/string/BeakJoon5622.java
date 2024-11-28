package baekjoon.string;

import java.util.Scanner;

public class BeakJoon5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        sc.close();

        int count = 0;
        int len = str.length();

        for(int i=0;i<len;i++) {
            switch(str.charAt(i)) {

                case 'A': case 'B': case 'C':
                    count+=3;
                    break;

                case 'D': case 'E': case 'F':
                    count+=4;
                    break;

                case 'G': case 'H': case 'I':
                    count+=5;
                    break;

                case 'J': case 'K': case 'L':
                    count+=6;
                    break;

                case 'M': case 'N': case 'O':
                    count+=7;
                    break;

                case 'P': case 'Q': case 'R': case 'S':
                    count+=8;
                    break;

                case 'T': case 'U': case 'V':
                    count+=9;
                    break;

                case 'W': case 'X': case 'Y': case 'Z':
                    count+=10;
                    break;

            }
        }
        System.out.println(count);
    }
}