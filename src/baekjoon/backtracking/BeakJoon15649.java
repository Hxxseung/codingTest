package baekjoon.backtracking;

import java.util.Scanner;

public class BeakJoon15649 {
    static boolean[] visited; // 방문한 숫자를 추적할 배열
    static int[] result; // 결과를 저장할 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        visited = new boolean[N + 1]; // 인덱스 1부터 사용
        result = new int[M]; // 결과 배열

        tracking(N, M, 0); // 백트래킹 시작
    }

    private static void tracking(int N, int M, int depth) {
        if (depth == M) { // M개를 선택했을 때
            for (int i = 0; i < M; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println(); // 줄바꿈
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) { // 방문하지 않은 숫자만 선택
                visited[i] = true; // 방문 표시
                result[depth] = i; // 현재 숫자를 결과 배열에 저장
                tracking(N, M, depth + 1); // 다음 깊이로 재귀 호출
                visited[i] = false; // 백트래킹: 방문 표시 해제
            }
        }
    }
}
