package uts;

import java.util.Scanner;

public class NilaiSiswa {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nama;
        int nilai;
        char hm;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan nilai: ");
        nilai = sc.nextInt();

        if (nilai >= 80) {
            hm = 'A';
        } else if (nilai >= 70) {
            hm = 'B';
        } else if (nilai >= 60) {
            hm = 'C';
        } else if (nilai >= 50) {
            hm = 'D';
        } else {
            hm = 'E';
        }

        System.out.println("\nNama\t\t: " + nama);
        System.out.println("Nilai\t\t: " + nilai);
        System.out.println("Huruf mutu\t: " + hm);

        sc.close();
    }

}
