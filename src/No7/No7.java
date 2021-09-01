package No7;

import java.util.Stack;

public class No7 {

    public static class SQueue {

        Stack<Integer> source;

        Stack<Integer> target;

        public SQueue() {
            this.source = new Stack<>();
            this.target = new Stack<>();
        }

        public void push(int data) {
            source.push(data);
        }

        public int pop() {
            if (target.isEmpty() && source.isEmpty()) {
                return -1;
            }
            if (target.isEmpty()) {
                // 队列先入先出
                while (!source.isEmpty()) {
                    target.push(source.pop());
                }
            }
            return target.pop();
        }

    }

    public static void main(String[] args) {
        SQueue sQueue = new SQueue();
        sQueue.push(1);
        sQueue.push(2);
        System.out.println(sQueue.pop());
        sQueue.push(3);
        System.out.println(sQueue.pop());
        sQueue.push(4);
        System.out.println(sQueue.pop());
        sQueue.push(5);
        sQueue.push(7);
        sQueue.push(8);
        sQueue.push(9);
        System.out.println(sQueue.pop());
        System.out.println(sQueue.pop());
        System.out.println(sQueue.pop());
        System.out.println(sQueue.pop());
        System.out.println(sQueue.pop());
    }
}
