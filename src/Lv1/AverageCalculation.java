package Lv1;

public class AverageCalculation {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;

        // 배열의 합계 계산
        for (int value : arr) {
            sum += value;
        }

        // 배열의 길이가 0이 아닐 경우 평균 계산
        if (arr.length > 0) {
            answer = (double) sum / arr.length;
        }

        return answer;
    }
}
