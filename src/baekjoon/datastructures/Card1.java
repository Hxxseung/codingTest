package baekjoon.datastructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> que = new LinkedList<>();    //정수형 Queue생성

        for (int i = 1; i < n+1; i++) {
            que.add(i); //큐에 1부터 n+1까 정수를 큐에 추가
        }
        while(que.size()!=1){   //큐의 크기 1이 될 때까지 반복
            int s = que.poll(); //poll => 맨앞의 카드를 꺼내면서 제거, 제거한 값을 s에 저장
            System.out.print(s+" ");
            int qu = que.poll();    //큐에서 다음 카드를 꺼낸 후, 꺼낸 값을 qu에 저장
            que.add(qu);    //qu에 저장한 값을 que에 다시 추가하여 맨 뒤에 저장되게 함.
        }
        System.out.print(que.poll());
    }
}
