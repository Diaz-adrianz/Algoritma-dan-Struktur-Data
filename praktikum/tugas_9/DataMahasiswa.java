package tugas_9;

import java.util.ArrayList;
import java.util.Scanner;

class QuickSort {

    private static void swap(String A[], int x, int y) {
        String temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }

    private static int partition(String[] A, int f, int l, boolean asc) {
        String pivot = A[f];
        while (f < l) {
            if (asc) {
                while (f < l && A[f].compareTo(pivot) < 0) {
                    f++;
                }
                while (A[l].compareTo(pivot) > 0) {
                    l--;
                }
            } else {
                while (f < l && A[f].compareTo(pivot) > 0) {
                    f++;
                }
                while (A[l].compareTo(pivot) < 0) {
                    l--;
                }
            }
            if (f < l) {
                swap(A, f, l);
            }
        }
        return l;
    }

    public static void sort(String[] A, int f, int l, boolean asc) {
        if (f >= l) {
            return;
        }
        int pivotIndex = partition(A, f, l, asc);
        sort(A, f, pivotIndex, asc);
        sort(A, pivotIndex + 1, l, asc);
    }

}

class BinarySearch {

    public static String search(String[] A, String target) {
        int first = 0;
        int last = A.length - 1;
        while (first <= last) {
            int middle = (first + last) / 2;
            int cmp = A[middle].compareTo(target);
            if (cmp == 0) {
                return A[middle];
            } else if (cmp < 0) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }
        return null;
    }
}

public class DataMahasiswa {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<String> list = new ArrayList<>();

    static void tambahData() {
        sc.nextLine();
        System.out.print("\nMasukkan nama: ");
        String nama = sc.nextLine();
        list.add(nama);
        System.out.println("✓ Mahasiswa berhasil ditambahkan");
    }

    static void tampilkanData() {
        sc.nextLine();
        System.out.print("\nArah pengurutan (asc/desc): ");
        String order = sc.nextLine();

        ArrayList<String> cpList = new ArrayList<>(list);
        String[] arr = cpList.toArray(String[]::new);
        QuickSort.sort(arr, 0, arr.length - 1, "asc".equals(order));

        for (String item : arr) {
            System.out.println("- " + item);
        }
    }

    static void cariData() {
        sc.nextLine();
        System.out.print("\nMasukkan nama: ");
        String cari = sc.nextLine();

        ArrayList<String> cpList = new ArrayList<>(list);
        String[] arr = cpList.toArray(String[]::new);
        String nama = BinarySearch.search(arr, cari);

        if (nama == null) {
            System.out.println("ⅹ Mahasiswa tidak ditemukan");
        } else {
            System.out.println("✓ Mahasiswa ditemukan: " + nama);
        }

    }

    public static void main(String[] args) {
        System.out.println("=========== Data Mahasiswa ===========");

        boolean play = true;
        while (play) {
            System.out.print("\n1. Tambah data\t2. Tampilkan data\t3. Cari data\t0. Keluar\nPilih > ");
            int pil = sc.nextInt();
            switch (pil) {
                case 0 ->
                    play = false;
                case 1 ->
                    tambahData();
                case 2 ->
                    tampilkanData();
                case 3 ->
                    cariData();
            }
        }

        sc.close();
    }

}
