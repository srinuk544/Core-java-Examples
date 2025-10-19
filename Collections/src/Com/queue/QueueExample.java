package Com.queue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
      
        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        // Displaying the queue
        System.out.println("Queue: " + queue);

        // Removing elements
        System.out.println("Removed: " + queue.poll()); // Removes "Apple"

        // Checking the front element
        System.out.println("Front: " + queue.peek()); // "Banana"

        // Checking if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
