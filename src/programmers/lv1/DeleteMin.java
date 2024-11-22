package programmers.lv1;

public class DeleteMin {
    class Solution {
        public int[] solution(int[] arr) {
            if(arr.length == 1){
                int[] answer = {-1};
                return answer;
            }


            int min = arr[0]; //변수 초기화
            int[] answer = new int[arr.length -1]; //새로운 배열 생성

            for(int i=0; i<arr.length; i++){
                min = Math.min(min,arr[i]); //최솟값계산
            }

            int idx = 0;

            for(int i=0; i<arr.length; i++){
                if(min == arr[i]){
                    continue;   //최솟값이면 건너뜀
                }else{
                    answer[idx++] = arr[i]; //최솟값이 아니라면 answer 배열에 추가함
                }
            }

            return answer;
        }
    }
}
