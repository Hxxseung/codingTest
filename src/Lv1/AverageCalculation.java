package Lv1;

import java.util.Scanner;

public class AverageCalculation {
    public double AverageCalculation(int[] arr) {
        double answer = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            answer = sum / n;
        }

        return answer;
    }
}
//수정중,,
