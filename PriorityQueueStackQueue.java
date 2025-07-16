import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueStackQueue {

    /**
     * PriorityQueue as a Queue: natural ordering (FIFO by insertion time simulated with counter)
     */
    static class CustomQueue<T> {
        private long counter = 0;
        private PriorityQueue<Element<T>> pq;

        private class Element<E> {
            E item;
            long order;

            public Element(E item, long order) {
                this.item = item;
                this.order = order;
            }
        }

        public CustomQueue() {
            // Comparator to simulate FIFO (lowest order first)
            pq = new PriorityQueue<>(Comparator.comparingLong(e -> e.order));
        }

        public void enqueue(T item) {
            pq.offer(new Element<>(item, counter++));
        }

        public T dequeue() {
            Element<T> elem = pq.poll();
            return elem == null ? null : elem.item;
        }
    }

    /**
     * PriorityQueue as a Stack: reverse order (LIFO by insertion time)
     */
    static class CustomStack<T> {
        private long counter = 0;
        private PriorityQueue<Element<T>> pq;

        private class Element<E> {
            E item;
            long order;

            public Element(E item, long order) {
                this.item = item;
                this.order = order;
            }
        }

        public CustomStack() {
            // Comparator to simulate LIFO (highest order first)
            pq = new PriorityQueue<>((e1, e2) -> Long.compare(e2.order, e1.order));
        }

        public void push(T item) {
            pq.offer(new Element<>(item, counter++));
        }

        public T pop() {
            Element<T> elem = pq.poll();
            return elem == null ? null : elem.item;
        }
    }

    public static void main(String[] args) {
        CustomQueue<String> queue = new CustomQueue<>();
        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");
        System.out.println("Queue dequeue:");
        System.out.println(queue.dequeue()); // first
        System.out.println(queue.dequeue()); // second

        CustomStack<String> stack = new CustomStack<>();
        stack.push("first");
        stack.push("second");
        stack.push("third");
        System.out.println("Stack pop:");
        System.out.println(stack.pop()); // third
        System.out.println(stack.pop()); // second
    }
}
