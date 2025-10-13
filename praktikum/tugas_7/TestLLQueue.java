package tugas_7;

class QueueLinkedList<T> {

    private class Node {

        T item;
        Node next;

        Node(T t) {
            item = t;
            next = null;
        }

        @Override
        public String toString() {
            return item.toString();
        }
    }

    private Node first, last;

    QueueLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(T t) {
        Node oldLast = last;
        last = new Node(t);
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }

        if (first == last) {
            T t = (T) first.item;
            first = last = null;
            return t;
        }

        T t = (T) first.item;
        first = first.next;
        return t;
    }

    @Override
    public String toString() {
        if (first == null) {
            return null;
        }

        if (first == last) {
            return first.item.toString();
        }

        StringBuilder sb = new StringBuilder();
        Node cur = first;
        while (cur != last) {
            sb.append(cur.item.toString()).append(" ");
            cur = cur.next;
        }
        sb.append(last.item.toString());
        return sb.toString();
    }
}

public class TestLLQueue {

    public static void main(String[] args) {
        QueueLinkedList<Integer> q = new QueueLinkedList<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.toString());
        q.dequeue();
        System.out.println(q.toString());
        q.dequeue();
        System.out.println(q.toString());
    }

}
