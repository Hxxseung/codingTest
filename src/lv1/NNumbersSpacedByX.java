package lv1;

public class NNumbersSpacedByX {
    public long[] NNumbersSpacedByX(long x, int n) {
        long[] answer = new long[n];  // 길이가 n인 long 배열을 생성
        for(int i = 0; i < n; i++) {
            answer[i] = x * (i + 1);  // x의 배수를 배열에 저장
        }
        return answer;  // 결과 배열 반환
    }
}
