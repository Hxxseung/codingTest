package programmers.lv1;

public class SumNum {
    class Solution {
        public int solution(int[] numbers) {
            int n = numbers.length + 1;
            int totalsum = 45;
            int arraysum = 0;
            int answer = 0;
            for (int num : numbers) {
                arraysum += num;
            }
            answer = totalsum - arraysum;
            return answer;
        }
    }
}
