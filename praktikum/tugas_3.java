
import java.util.Scanner;

public class tugas_3 {

    static Scanner sc = new Scanner(System.in);

    public static void hitungSegitiga() {
        System.out.print("Masukkan alas: ");
        int var_alas = sc.nextInt();

        System.out.print("Masukkan tinggi: ");
        int var_tinggi = sc.nextInt();

        double rumus_luas;
        rumus_luas = (double) (var_alas * var_tinggi) / 2;
        System.out.println("Luas Segitiga:" + rumus_luas);
    }

    public static void main(String[] args) {
        hitungSegitiga();
        sc.close();
    }
}
