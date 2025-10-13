package tugas_6;

import java.util.Scanner;

public class StackBarang {

    static Scanner sc = new Scanner(System.in);

    private final int maxSize;
    private final String[] stack;
    private int top;

    public StackBarang(int s) {
        maxSize = s;
        stack = new String[s];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push() {
        if (isFull()) {
            System.out.println("-- Tumpukan penuh --");
            return;
        }

        sc.nextLine();
        System.out.print("Masukkan nama barang: ");
        String b = sc.nextLine();

        stack[++top] = b;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("-- Tumpukan kosong --");
            return;
        }
        String b = stack[top--];
    }

    public void show() {
        if (!isEmpty()) {
            System.out.println("\n");
            for (int i = top; i >= 0; i--) {
                System.out.println("| " + stack[i] + " |");
            }
            System.out.println("\n");
        }

    }

    public static void main(String[] args) {
        System.out.print("Masukkan maksimal tumpukan: ");
        int s = sc.nextInt();

        StackBarang stackBarang = new StackBarang(s);

        boolean play = true;
        while (play) {
            stackBarang.show();

            System.out.print("Pilihan menu:\n1. Tambah barang\n2. Ambil barang\n0. Keluar\n> ");
            int o = sc.nextInt();

            switch (o) {
                case 1 ->
                    stackBarang.push();
                case 2 ->
                    stackBarang.pop();
                case 0 ->
                    play = false;
                default -> {
                }
            }

        }

        sc.close();

    }
}
