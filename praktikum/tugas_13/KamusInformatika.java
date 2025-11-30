package tugas_13;

import java.util.Hashtable;
import java.util.Scanner;

public class KamusInformatika {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=========== Kamus Informatika ===========");

        Hashtable<String, String> kamus = new Hashtable<>();

        kamus.put("Algoritma", "Serangkaian instruksi terdefinisi untuk menyelesaikan masalah.");
        kamus.put("Data", "Fakta atau informasi mentah yang diproses oleh komputer.");
        kamus.put("Variabel", "Lokasi penyimpanan bernama yang nilainya dapat berubah.");
        kamus.put("Kompilator", "Program yang menerjemahkan kode sumber dari bahasa tingkat tinggi ke kode mesin.");
        kamus.put("Debugging", "Proses mencari dan memperbaiki kesalahan dalam kode program.");
        kamus.put("Sistem Operasi (OS)", "Perangkat lunak yang mengelola sumber daya perangkat keras dan perangkat lunak.");
        kamus.put("Kecerdasan Buatan (AI)", "Kemampuan sistem untuk meniru fungsi kognitif manusia, seperti belajar dan memecahkan masalah.");
        kamus.put("Pembelajaran Mesin (ML)", "Bidang AI yang memungkinkan sistem belajar dari data tanpa diprogram secara eksplisit.");
        kamus.put("Enkripsi", "Proses mengonversi informasi menjadi kode untuk mencegah akses tidak sah.");
        kamus.put("Pemrograman Berorientasi Objek (OOP)", "Paradigma pemrograman berdasarkan konsep objek yang berisi data dan kode.");
        kamus.put("API (Application Programming Interface)", "Sekumpulan definisi dan protokol untuk membangun dan mengintegrasikan perangkat lunak aplikasi.");
        kamus.put("Frontend", "Bagian dari aplikasi yang berinteraksi langsung dengan pengguna (antarmuka).");
        kamus.put("Backend", "Bagian dari aplikasi yang mengelola logika server dan database.");
        int pilihan;

        do {
            System.out.print("\n1. Cari \t2. Tambah \t3. Semua \t0. Keluar\n> ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan istilah: ");
                    String cari = scanner.nextLine();
                    String arti = kamus.get(cari);

                    if (arti != null) {
                        System.out.println("Arti: " + arti);
                    } else {
                        System.out.println("Istilah tidak ditemukan.");
                    }
                }
                case 2 -> {
                    System.out.print("Istilah: ");
                    String istilah = scanner.nextLine();
                    System.out.print("Artinya: ");
                    String meaning = scanner.nextLine();

                    kamus.put(istilah, meaning);
                }
                case 3 -> {
                    int no = 1;
                    for (String key : kamus.keySet()) {
                        System.out.println(no + ". " + key + " : " + kamus.get(key));
                        no++;
                    }
                }
            }

        } while (pilihan != 0);

        scanner.close();
    }
}
