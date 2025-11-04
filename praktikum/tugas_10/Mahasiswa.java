package tugas_10;

import java.util.*;

class Mahasiswa {

    String nim;
    String nama;
    String jurusan;
    int angkatan;

    public Mahasiswa(String nim, String nama, String jurusan, int angkatan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Mahasiswa)) {
            return false;
        }
        Mahasiswa m = (Mahasiswa) o;
        return nim.equals(m.nim) && jurusan.equals(m.jurusan); // Only compare NIM
    }

    @Override
    public int hashCode() {
        return Objects.hash(nim); // Must match equals field
    }

    @Override
    public String toString() {
        return nama + " (" + nim + ", " + jurusan + ", " + angkatan + ")";
    }

    public static void main(String[] args) {
        Set<Mahasiswa> data = new HashSet<>();

        data.add(new Mahasiswa("231001", "Andi", "Informatika", 2023));
        data.add(new Mahasiswa("231002", "Budi", "Sistem Informasi", 2023));
        data.add(new Mahasiswa("231001", "Andi Putra", "Informatika", 2023)); // duplicate NIM

        for (Mahasiswa m : data) {
            System.out.println(m);
        }
    }
}
