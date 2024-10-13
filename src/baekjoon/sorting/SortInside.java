package baekjoon.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortInside {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] sort = input.toCharArray();
        Arrays.sort(sort);

        sb.append(sort);
        sb.reverse();
        System.out.println(sb);
    }
}
