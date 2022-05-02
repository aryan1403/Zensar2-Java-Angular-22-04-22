package Core_Java;

import java.util.ArrayDeque;
import java.util.Queue;

public class qex {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(10);
        q.offer(34);
        q.offer(56);

        q.poll();

        System.out.println(q.isEmpty());

        q.forEach(System.out::println);
    }
}
