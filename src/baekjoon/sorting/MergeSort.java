package baekjoon.sorting;

import java.util.Arrays;

public class MergeSort {

    static int[] arr;
    static int[] temp;

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + Arrays.toString(arr));
        Merge_Sort.merge_sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public class Merge_Sort {

        private static int[] sorted;        // 합치는 과정에서 정렬하여 원소를 담을 임시배열

        public static void merge_sort(int[] a) {

            sorted = new int[a.length];
            merge_sort(a, 0, a.length - 1);
            sorted = null;
        }

        // Bottom-Up 방식 구현
        private static void merge_sort(int[] a, int left, int right) {

            /*
             * 1 - 2 - 4 - 8 - ... 식으로 1부터 서브리스트를 나누는 기준을 두 배씩 늘린다.
             */
            for (int size = 1; size <= right; size += size) {
                System.out.println("size = " + size);
                for (int l = 0; l <= right - size; l += (2 * size)) {
                    System.out.println("반복 회수 : " + (right - size));
                    System.out.println("l = " + l);
                    int low = l;
                    int mid = l + size - 1;
                    System.out.println("mid : " + mid);
                    System.out.println("두번째 중첩 반복문 size : " + size);
                    int high = Math.min(l + (2 * size) - 1, right);
                    merge(a, low, mid, high);        // 병합작업
                }
            }

        }

        /**
         * 합칠 부분리스트는 a배열의 left ~ right 까지이다.
         *
         * @param a     정렬할 배열
         * @param left  배열의 시작점
         * @param mid   배열의 중간점
         * @param right 배열의 끝 점
         */
        private static void merge(int[] a, int left, int mid, int right) {
            int l = left;        // 왼쪽 부분리스트 시작점
            int r = mid + 1;    // 오른쪽 부분리스트의 시작점
            int idx = left;        // 채워넣을 배열의 인덱스

            while (l <= mid && r <= right) {

                if (a[l] <= a[r]) {
                    sorted[idx] = a[l];
                    idx++;
                    l++;
                } else {
                    sorted[idx] = a[r];
                    System.out.println("sorted = " + sorted[idx]);
                    idx++;
                    r++;
                }
            }
            if (l > mid) {
                while (r <= right) {
                    sorted[idx] = a[r];
                    idx++;
                    r++;
                }
            } else {
                while (l <= mid) {
                    sorted[idx] = a[l];
                    idx++;
                    l++;
                }
            }
            for (int i = left; i <= right; i++) {

                a[i] = sorted[i];
                System.out.println(i + " 번째 반복 " + "a의 인덱스 : " + a[i]);
                System.out.println(Arrays.toString(a));
            }
        }
    }
}