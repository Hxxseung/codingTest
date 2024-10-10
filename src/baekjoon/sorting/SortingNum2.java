package baekjoon.sorting;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortingNum2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}


//시간 복잡도가 O(nlogn)인 정렬 알고리즘으로 풀 수 있습니다.
//BeakJoon 2751 : memory : 129452 KB /Time : 1312 ms
