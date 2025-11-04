package tugas_10;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class MahasiswaTreeSet {

    static Scanner sc = new Scanner(System.in);
    static TreeSet<String> listMahasiswa = new TreeSet<>();

    static void tampil() {
        Iterator<String> i = listMahasiswa.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + ", ");
        }
        System.out.println("");
    }

    static void tambah() {
        sc.nextLine();
        System.out.print("\nMasukkan nama: ");
        String nama = sc.nextLine();
        listMahasiswa.add(nama);
    }

    static void hapus() {
        sc.nextLine();
        System.out.print("\nMasukkan nama: ");
        String nama = sc.nextLine();
        listMahasiswa.remove(nama);
    }

    public static void main(String[] args) {
        System.out.println("=========== Data Mahasiswa ===========");

        boolean play = true;
        while (play) {
            System.out.print("\n1. Tampilkan\t2. Tambah\t3. Hapus\t0. Keluar\n> ");
            int pil = sc.nextInt();
            switch (pil) {
                case 0 ->
                    play = false;
                case 1 ->
                    tampil();
                case 2 ->
                    tambah();
                case 3 ->
                    hapus();
            }
        }

        sc.close();
    }
}
