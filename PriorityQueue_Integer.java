import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueue_Integer{
    public static void main(String args[]){
        // LOWEST NUMBER HIGHEST PRIORITY;
        System.out.println("// LOWEST NUMBER HIGHEST PRIORITY;");
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(12);// O(log n)
        pq.add(14);
        pq.add(13);
        pq.add(5);
        pq.add(20);
        pq.add(18);
        pq.add(1);
        pq.offer(50);
        System.out.println(pq.poll());
        System.out.println(pq.remove());// 0(log n)
        System.out.println(pq.peek()); // O(1)
        // HIGHEST NUMBER HIGHEST PRIORITY;
        System.out.println("// HIGHEST NUMBER HIGHEST PRIORITY;");
        PriorityQueue<Integer> pq_=new PriorityQueue<>(Comparator.reverseOrder());
        pq_.add(12);// O(log n)
        pq_.add(14);
        pq_.add(13);
        pq_.add(5);
        pq_.add(20);
        pq_.add(18);
        pq_.add(1);
        pq_.offer(50);
        System.out.println(pq_.poll());
        System.out.println(pq_.remove());// 0(log n)
        System.out.println(pq_.peek()); // O(1)
    }
}