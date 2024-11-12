package programmers.lv1;

public class AverageCalculation {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;

        for (int value : arr) { //for - each문을 통해 arr배열을 value에 할당
            sum += value;
        }


        if (arr.length > 0) {  // 배열의 길이가 0이 아닐 경우 평균 계산
            answer = (double) sum / arr.length;
        }

        return answer;
    }
}
