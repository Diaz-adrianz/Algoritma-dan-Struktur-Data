
import java.util.Scanner;

public class tugas_2 {

    static Scanner sc = new Scanner(System.in);

    public static void cekTahunKabisat() {
        System.out.print("Masukkan tahun: ");
        int tahun = sc.nextInt();

        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println("Tahun kabisat");
        } else {
            System.out.println("Bukan tahun kabisat");
        }
    }

    public static void persamaanKuadrat() {
        System.out.print("Masukkan nilai A: ");
        double A = sc.nextDouble();

        System.out.print("Masukkan nilai B: ");
        double B = sc.nextDouble();

        System.out.print("Masukkan nilai C: ");
        double C = sc.nextDouble();

        double D = B * B - 4 * A * C;

        if (D < 0) {
            double realPart = -B / (2 * A);
            double imagPart = Math.sqrt(-D) / (2 * A);
            System.out.println("X1 = " + realPart + " + " + imagPart + "i");
            System.out.println("X2 = " + realPart + " - " + imagPart + "i");
        } else if (D == 0) {
            double X = -B / (2 * A);
            System.out.println("X1 = X2 = " + X);
        } else {
            double X1 = (-B + Math.sqrt(D)) / (2 * A);
            double X2 = (-B - Math.sqrt(D)) / (2 * A);
            System.out.println("X1 = " + X1);
            System.out.println("X2 = " + X2);
        }

    }

    public static void cekJenisBenda() {
        System.out.print("Masukkan suhu (celcius): ");
        float t = sc.nextFloat();

        if (t < 0) {
            System.out.println("Benda cair");
        } else if (t <= 100) {
            System.out.println("Benda padat");
        } else {
            System.out.println("Benda gas");
        }
    }

    public static void lampuLaluLintas() {
        System.out.print("Masukkan warna: ");
        String warna = sc.nextLine();

        switch (warna) {
            case "Merah" ->
                System.out.print("🛑 Berhenti!");
            case "Kuning" ->
                System.out.print("🟡 Hati-hati!");
            case "Hijau" ->
                System.out.print("🟢 Jalan!");
            default ->
                System.out.print("Warna salah!");
        }
    }

    public static void main(String[] args) {
        // cekTahunKabisat();
        persamaanKuadrat();
        // cekJenisBenda();
        // lampuLaluLintas();
        sc.close();
    }
}
