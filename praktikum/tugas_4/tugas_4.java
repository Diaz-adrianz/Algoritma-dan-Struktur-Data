package tugas_4;

import java.util.Scanner;

public class tugas_4 {

    static Scanner sc = new Scanner(System.in);

    public static void cekNilaiMahasiswa() {
        System.out.print("Masukkan nilai Anda (dalam angka): ");
        float nilaiAngka = sc.nextFloat();
        String nilaiHuruf;

        if (nilaiAngka >= 85) {
            nilaiHuruf = "A";
        } else if (nilaiAngka >= 75) {
            nilaiHuruf = "AB";
        } else if (nilaiAngka >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAngka >= 50) {
            nilaiHuruf = "BC";
        } else if (nilaiAngka >= 35) {
            nilaiHuruf = "C";
        } else if (nilaiAngka >= 20) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "D";
        }

        System.out.println("Nilai Anda adalah " + nilaiHuruf);
    }

    public static void main(String[] args) {
        cekNilaiMahasiswa();

        sc.close();
    }
}
