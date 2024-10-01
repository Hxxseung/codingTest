package baekjoon.datastructures;

import java.util.Queue;
import java.util.Scanner;

public class Que {

    private int front;
    private int back;

    private  int[] data;

    public Que(int s ) {
        this.front = 0;
        this.back = -1;
        this.data = new int[s];
    }
    public void push(int p) {
        back = back + 1;
        data[back] = p;
    }

    public int pop() {
        if(empty()) {
            return -1;
        }

        return data[front++];

    }
    public boolean empty() {
        return size()==0;
    }
    public int size() {
        return back -front+1;
    }
    public int front() {
        if(empty()){
            return -1;}
        return data[front];
    }
    public int back() {
        if(empty()){
            return -1;}
        return data[back];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        Que queue = new Que(n);

        while(n --> 0 ) {
            String command = sc.next();
            switch (command) {
                case "push":
                    queue.push(sc.nextInt());
                    break;
                case "pop":
                    sb.append(queue.pop()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.empty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(queue.front()).append("\n");
                    break;
                case "back":
                    sb.append(queue.back()).append("\n");
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);


    }

}