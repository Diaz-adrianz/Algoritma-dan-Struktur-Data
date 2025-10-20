package uts;

import java.util.Scanner;

public class QueueBimbingan {

    static class CircularQueue {

        private final String[] arr;
        private int front;
        private int size;
        private final int capacity;

        public CircularQueue(int cap) {
            capacity = cap;
            arr = new String[capacity];
            front = 0;
            size = 0;
        }

        public void enqueue(String x) {
            if (size == capacity) {
                System.out.println("Antrian penuh!");
                return;
            }
            int rear = (front + size) % capacity;
            arr[rear] = x;
            size++;
        }

        public String dequeue() {
            if (size == 0) {
                System.out.println("Antrian kosong");
                return "";
            }
            String res = arr[front];
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
                    System.out.print(arr[idx] + ", ");
                }
            }

            System.out.println();
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);

        System.out.println("===== Antrian Bimbingan Tugas Akhir =====");

        boolean play = true;
        while (play) {
            System.err.print("Pilih operasi\n1. Tambah mahasiswa\n2. Panggil mahasiswa\n0. Keluar\nPilih: ");
            int operation = sc.nextInt();

            switch (operation) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Masukkan nama: ");
                    String n = sc.nextLine();
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
