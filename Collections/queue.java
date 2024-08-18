import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
/*offer()
 * poll()
 * peak()
 * size()
 */
import java.util.PriorityQueue;

/*
 * Queue->LinkedList,PriorityQueue,ArrayDeque
 
*LinkedList: Implements a queue as a doubly-linked list.

*PriorityQueue: Implements a priority queue, where elements are 
    ordered based on their natural ordering or a comparator.

*ArrayDeque: Implements a double-ended queue, allowing elements to
    be added or removed from both ends.
 */
public class queue {
    public static void main(String args[]){
//queue
        Queue<String>linked=new LinkedList<String>();
        linked.offer("A");
        linked.offer("B");
        linked.offer("C");
        System.out.println(linked);
        linked.poll();
        System.out.println(linked);
        System.out.println(linked.peek());
        System.out.println("size "+linked.size());
//priority queue
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(4);
        pq.offer(5);
        System.out.println("priority queue "+pq);
        System.out.println(pq.poll());
        System.out.println("priority queue after poll "+pq);


        PriorityQueue<Integer> pq2=new PriorityQueue<>(Comparator.reverseOrder());
        pq2.offer(10);
        pq2.offer(20);
        pq2.offer(30);
        pq2.offer(4);
        pq2.offer(5);
        System.out.println("priority queue reverse order "+pq2);
//arrayDeque
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.offer(20);
        ad.offer(2);
        ad.offerLast(8);
        ad.offerFirst(1);
        System.out.println("array deque"+ad);
        ad.pollLast();
        System.out.println("removed last:"+ad);
        ad.pollFirst();
        System.out.println("removed first:"+ad);

    }
}
