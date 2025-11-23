package praktikum.tugas_11;

import java.util.Scanner;

public class MahasiswaSingleLinkedList {

    static Scanner sc = new Scanner(System.in);

    class Node {

        String data;
        Node next;

        public Node(String data) {
            this.data = data;
        }

    }

    Node first;

    public MahasiswaSingleLinkedList() {
        first = null;
    }

    static Node split(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast != null) {
                slow = slow.next;
            }
        }
        Node temp = slow.next;
        slow.next = null;
        return temp;
    }

    static Node merge(Node first, Node second, Boolean asc) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }

        Boolean compare = asc ? first.data.compareTo(second.data) < 0 : first.data.compareTo(second.data) > 0;
        if (compare) {
            first.next = merge(first.next, second, asc);
            return first;
        } else {
            second.next = merge(first, second.next, asc);
            return second;
        }
    }

    static Node mergeSort(Node head, boolean asc) {
        if (head == null || head.next == null) {
            return head;
        }
        Node second = split(head);
        head = mergeSort(head, asc);
        second = mergeSort(second, asc);
        return merge(head, second, asc);
    }

    public Node copy(Node head) {
        Node copyHead = null;
        Node copyTail = null;
        Node cur = head;

        while (cur != null) {
            Node newNode = new Node(cur.data);
            if (copyHead == null) {
                copyHead = newNode;
                copyTail = newNode;
            } else {
                if (copyTail != null) {
                    copyTail.next = newNode;
                }
                copyTail = newNode;
            }
            cur = cur.next;
        }

        return copyHead;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void tambah(String data) {
        Node node, help;
        node = new Node(data);
        node.next = null;
        if (isEmpty()) {
            first = node;
            first.next = null;
        } else {
            help = first;
            while (help.next != null) {
                help = help.next;
            }
            help.next = node;
        }
    }

    public void tampil(Boolean asc) {
        Node copyFirst = copy(first);
        Node current = mergeSort(copyFirst, asc);
        if (current == null) {
            System.out.println("Kosong!");
        } else {
            while (current != null) {
                System.out.println("- " + current.data);
                current = current.next;
            }
            System.out.println();
        }
    }

    public void cari(String target) {
        Node current = first;
        while (current != null) {
            if (current.data.equals(target)) {
                System.out.println("Ketemu: " + current.data);
                return;
            }
            current = current.next;
        }
        System.out.println("Tidak ketemu");
    }

    public static void main(String[] args) {
        System.out.println("=========== Data Mahasiswa ===========");

        MahasiswaSingleLinkedList linkedList = new MahasiswaSingleLinkedList();

        boolean play = true;
        while (play) {
            System.out.print("\n1. Tambah\t2. Tampil\t3. Cari \t0. Keluar\n> ");
            int pil = sc.nextInt();
            switch (pil) {
                case 0 ->
                    play = false;
                case 1 -> {
                    sc.nextLine();
                    System.out.print("\nMasukkan nama: ");
                    String nama = sc.nextLine();
                    linkedList.tambah(nama);
                }
                case 2 -> {
                    sc.nextLine();
                    System.out.print("\nPengurutan (asc/desc): ");
                    String order = sc.nextLine();
                    linkedList.tampil("asc".equals(order));
                }
                case 3 -> {
                    sc.nextLine();
                    System.out.print("\nMasukkan nama: ");
                    String nama = sc.nextLine();
                    linkedList.cari(nama);
                }
            }
        }

        sc.close();

    }

}
