package teori;

import java.util.Scanner;

abstract class Manusia {

    String nama;

    Manusia(String nama) {
        this.nama = nama;
    }

    abstract void bersuara();

    abstract void berorasi();

}

class Mahasiswa extends Manusia {

    Mahasiswa(String nama) {
        super(nama);
    }

    @Override
    void bersuara() {
        System.out.println(nama + ": Hidup mahasiswa!");
    }

    @Override
    void berorasi() {
        System.out.println(nama + ": Hidup jok... Get out!");
    }
}

public class tugas_4 {

    static Scanner sc = new java.util.Scanner(System.in);

    static void looping() {
        for (int a = 1; a < 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                double hasil = (double) ((a * a) + (b * b) + 1) / (a * b);
                System.out.printf("a: %d, b: %d, hasil: %.4f%n", a, b, hasil);
            }
        }
    }

    static void tigaLooping() {
        System.out.println("For loop");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("\nWhile loop");
        int num = 0;
        while (num != 8) {
            System.out.println(num);
            num += 2;
        }

        System.out.println("\nDo-while loop");
        int input;
        do {
            System.out.print("Masukkan angka (0=berhenti): ");
            input = sc.nextInt();
        } while (input != 0);
    }

    public static void main(String[] args) {
        // looping();
        // tigaLooping();

        Mahasiswa agus = new Mahasiswa("agus");
        agus.bersuara();
        agus.berorasi();

        sc.close();
    }
}
