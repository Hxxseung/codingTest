package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SortingNum2_test {
    private static int[] temp; // 임시 배열: 병합 결과를 저장하기 위한 임시 배열

    // 두 배열을 병합하는 메소드
    private static void merge(int[] arr, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i]; // 임시 배열에 데이터 복사
        }

        int i = left; // 왼쪽 배열의 인덱스
        int j = mid + 1; // 오른쪽 배열의 인덱스
        int k = left; // 결과 배열의 인덱스

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
            }
        }

        // 왼쪽 배열의 나머지 부분 복사 (필요한 경우)
        while (i <= mid) {
            arr[k++] = temp[i++];
        }
        while (j <= mid) {
            arr[k++] = temp[j++];
        }
        // 오른쪽 배열의 나머지 부분은 이미 결과 배열에 포함되어 있으므로 복사할 필요 없음

    }

    // 병합 정렬을 수행하는 메소드
    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid); // 왼쪽 부분 정렬
            mergeSort(arr, mid + 1, right); // 오른쪽 부분 정렬

            merge(arr, left, mid, right); // 두 부분을 병합
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력할 숫자의 개수 N 읽기
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        temp = new int[N]; // 임시 배열 초기화

        // N개의 숫자 입력
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        // 병합 정렬 수행
        mergeSort(numbers, 0, N - 1);

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            sb.append(number).append("\n");
        }
        System.out.print(sb);
    }
}

//BeakJoon 2751 : memory : 102964 KB /Time : 796 ms