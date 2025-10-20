package uts;

class BangunDatar {

    double luas() {
        return 0;
    }
}

class Lingkaran extends BangunDatar {

    double jari;

    Lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    double luas() {
        return Math.PI * jari * jari;
    }
}

class Persegi extends BangunDatar {

    double panjang, lebar;

    Persegi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double luas() {
        return panjang * lebar;
    }
}

class Segitiga extends BangunDatar {

    double alas, tinggi;

    Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }
}

public class PolymorphismOverriding {

    public static void main(String[] args) {

        BangunDatar lingkaran = new Lingkaran(9);
        System.out.println("Luas lingkaran: " + lingkaran.luas());

        BangunDatar persegi = new Persegi(8, 5);
        System.out.println("Luas persegi: " + persegi.luas());

        BangunDatar segitiga = new Segitiga(7, 5);
        System.out.println("Luas segitiga: " + segitiga.luas());
    }
}
