package baekjoon.sorting;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class SortingNum2_MergeSort {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 리스트 초기화
        ArrayList<Integer> list = new ArrayList<>();

        // 입력값 리스트에 추가
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        // 병합 정렬 호출
        mergeSort(list, 0, list.size() - 1);

        // 정렬된 리스트 출력
        for (int value : list) {
            sb.append(value).append('\n');
        }
        System.out.print(sb);
    }

    // 병합 정렬 메서드
    public static void mergeSort(ArrayList<Integer> list, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // 재귀적으로 왼쪽과 오른쪽 정렬
            mergeSort(list, left, mid);
            mergeSort(list, mid + 1, right);

            // 정렬된 부분 병합
            merge(list, left, mid, right);
        }
    }

    // 병합 메서드
    public static void merge(ArrayList<Integer> list, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // 왼쪽과 오른쪽 서브 배열 생성
        ArrayList<Integer> leftArray = new ArrayList<>(n1);
        ArrayList<Integer> rightArray = new ArrayList<>(n2);

        for (int i = 0; i < n1; i++) {
            leftArray.add(list.get(left + i));
        }
        for (int j = 0; j < n2; j++) {
            rightArray.add(list.get(mid + 1 + j));
        }

        // 병합 과정
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray.get(i) <= rightArray.get(j)) {
                list.set(k, leftArray.get(i));
                i++;
            } else {
                list.set(k, rightArray.get(j));
                j++;
            }
            k++;
        }

        // 남은 요소들 복사
        while (i < n1) {
            list.set(k, leftArray.get(i));
            i++;
            k++;
        }
        while (j < n2) {
            list.set(k, rightArray.get(j));
            j++;
            k++;
        }
    }
}

//BeakJoon 2751 : memory : 299676 KB /Time : 1524 ms