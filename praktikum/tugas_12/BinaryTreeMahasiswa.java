// BinaryTreeMahasiswa.java 
package tugas_12;

import java.util.Scanner;

public class BinaryTreeMahasiswa {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=========== Data Mahasiswa ===========");

        BinaryTree bt = new BinaryTree();

        boolean play = true;
        while (play) {
            System.out.print("\n1. Tambah \t2. Tampil \t3. Cari \t4. Total \t0. Keluar\n> ");
            int pil = sc.nextInt();
            switch (pil) {
                case 0 ->
                    play = false;
                case 1 -> {
                    sc.nextLine();
                    System.out.print("\nMasukkan nama: ");
                    String nama = sc.nextLine();
                    bt.insert(nama);
                }
                case 2 -> {
                    bt.inorder();
                }
                case 3 -> {
                    sc.nextLine();
                    System.out.print("\nMasukkan nama: ");
                    String nama = sc.nextLine();
                    Boolean result = bt.search(nama);
                    System.out.println("Mahasiswa '" + nama + "' " + (result ? "ditemukan" : "tidak ditemukan"));
                }
                case 4 -> {
                    int total = bt.countNodes();
                    System.out.println("Total: " + total);
                }
            }
        }

        sc.close();

    }

}
