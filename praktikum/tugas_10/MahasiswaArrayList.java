package tugas_10;

import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaArrayList {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> listMahasiswa = new ArrayList<>();

    static void tampil() {
        for (String nama : listMahasiswa) {
            System.out.print(nama + ", ");
        }
        System.out.println("\n");
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
