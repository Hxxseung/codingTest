package Lv0;
import java.util.Scanner;
public class printSpecialchar {
    public static void main(String[] args) {
        int[] num ={33, 64, 35, 36, 37, 94, 38, 42, 40, 92, 39, 34, 60, 62, 63, 58, 59};

        for(int i = 0; i<num.length; i++){
            System.out.print((char)(num[i]));
        }
    }
}

