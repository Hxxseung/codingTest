package Lv1;

import java.util.Scanner;

public class OddAndEven {
    public String OddAndEven(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }
}
