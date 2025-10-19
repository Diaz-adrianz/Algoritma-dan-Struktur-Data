package teori;

import java.util.Scanner;

public class tugas_7 {

    static Scanner sc = new Scanner(System.in);

    static class CircularQueue {

        private final int[] arr;
        private int front;
        private int size;
        private final int capacity;

        public CircularQueue(int cap) {
            capacity = cap;
            arr = new int[capacity];
            front = 0;
            size = 0;
        }

        public void enqueue(int x) {
            if (size == capacity) {
                System.out.println("Antrian penuh!");
                return;
            }
            int rear = (front + size) % capacity;
            arr[rear] = x;
            size++;
        }

        public int dequeue() {
            if (size == 0) {
                System.out.println("Antrian kosong");
                return -1;
            }
            int res = arr[front];
            front = (front + 1) % capacity;
            size--;
            return res;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public void print() {
            if (!isEmpty()) {
                System.out.print("Antrian: ");
                for (int i = 0; i < size; i++) {
                    int idx = (front + i) % capacity;
                    System.out.print(arr[idx] + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);

        boolean play = true;
        while (play) {
            System.err.print("Enqueue/dequeue/quit (1/2/0): ");
            int operation = sc.nextInt();

            switch (operation) {
                case 1 -> {
                    System.out.print("Masukkan angka: ");
                    int n = sc.nextInt();
                    q.enqueue(n);
                }
                case 2 ->
                    q.dequeue();
                case 0 ->
                    play = false;
            }

            q.print();
            System.out.print("\n");
        }

        sc.close();
    }
}
