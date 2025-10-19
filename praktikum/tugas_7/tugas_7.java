package tugas_7;

import java.util.Scanner;

class Queue {

    static class Node {

        String data;
        Node next;

        Node(String newdata) {
            data = newdata;
            next = null;
        }
    }

    Node front = null, rear = null;

    public void enqueue(String value) {
        Node newNode = new Node(value);

        if (front == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }

        rear = newNode;
        rear.next = front;
    }

    public String dequeue() {
        if (front == null) {
            return "";
        }

        String value;
        if (front == rear) {
            value = front.data;
            front = rear = null;
        } else {
            Node temp = front;
            value = temp.data;
            front = front.next;
            rear.next = front;
        }

        return value;
    }

    public void print() {
        Node curr = front;

        if (curr != null) {
            System.out.println("---- Order ----");
            do {
                System.out.println("- " + curr.data);
                curr = curr.next;
            } while (curr != front);
            System.out.println("---------------");
        }

    }
}

public class tugas_7 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Queue q = new Queue();

        System.out.println("===== Order Kopi =====");

        boolean play = true;
        while (play) {
            System.err.print("Pilih operasi\n1. Tambah pesanan\n2. Terima pesanan\nPilih: ");
            int operation = sc.nextInt();

            switch (operation) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Masukkan menu kopi: ");
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
