package collection_revision;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
//
//        Queue<Integer> queue=new LinkedList<>();
//
//       // queue.add(20)// true/false (it may throws an exception)
//        queue.offer(100);//true /false
//        queue.offer(200);
//        queue.offer(300);
//        queue.offer(400);
//        System.out.println(queue);
//
//        queue.poll();
//        System.out.println(queue);
//        queue.poll();
//        System.out.println(queue);
//        System.out.println(queue.peek());


      //  Queue<Integer> queue=new PriorityQueue<>();
        Queue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder());
        // queue.add(20)// true/false (it may throws an exception)

        queue.offer(300);
        queue.offer(400);
        queue.offer(100);//true /false
        queue.offer(110);
        queue.offer(200);
        queue.offer(55);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

    }
}
