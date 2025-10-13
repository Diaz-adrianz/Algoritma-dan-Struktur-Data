
import java.util.Scanner;

class tugas_5 {

    static Scanner sc = new Scanner(System.in);

    static void cetakAngka(int angka, int batasAngka) {
        if (angka <= batasAngka) {
            System.out.print(angka + " ");
            cetakAngka(++angka, batasAngka);
        }
    }

    static void cetakSegitigaSiku(int row, int col, int batas) {
        if (row <= batas) {
            if (col <= row) {
                System.out.print("* ");
            }
            if (col == row) {
                System.out.println();
                cetakSegitigaSiku(++row, 1, batas);
            } else {
                cetakSegitigaSiku(row, ++col, batas);
            }
        }
    }

    static int factorialRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursion(n - 1);
        }
    }

    static Integer fibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    static boolean isPalindrom(String kata) {
        int left = 0;
        int right = kata.length() - 1;

        while (left < right) {
            if (kata.charAt(left) != kata.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    static void hanoiTower(int n, char awal, char temp, char akhir) {
        if (n == 1) {
            System.out.println("pindahkan " + n + " dari " + awal + " ke " + akhir);
        } else {
            hanoiTower(n - 1, awal, akhir, temp);
            System.out.println("pindahkan " + n + " dari " + awal + " ke " + akhir);
            hanoiTower(n - 1, temp, awal, akhir);
        }
    }

    static boolean isPrime(int n) {
        return isPrime(n, 2);
    }

    static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return n == 2;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }

        return isPrime(n, i + 1);
    }

    public static void main(String args[]) {
        System.out.println("-------- Cetak Angka --------");
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        System.out.print("Masukkan angka: ");
        int batasAngka = sc.nextInt();
        cetakAngka(angka, batasAngka);

        System.out.println("\n\n-------- Cetak Segitiga Siku --------");
        System.out.print("Masukkan row: ");
        int row = sc.nextInt();
        System.out.print("Masukkan col: ");
        int col = sc.nextInt();
        System.out.print("Masukkan batas: ");
        int batas = sc.nextInt();
        cetakSegitigaSiku(row, col, batas);

        System.out.println("\n\n-------- Faktorial Rekursif --------");
        System.out.print("Masukkan n: ");
        int n = sc.nextInt();
        int factorial = factorialRecursion(n);
        System.out.println(factorial);

        System.out.println("\n\n-------- Fibonacci Rekursif --------");
        System.out.print("Masukkan i: ");
        int i = sc.nextInt();
        int fibonacci = fibonacciRecursion(i);
        System.out.println(fibonacci);

        sc.nextLine();
        System.out.println("\n\n-------- Palindrom --------");
        System.out.print("Masukkan kata: ");
        String kata = sc.nextLine();
        boolean palindrom = isPalindrom(kata);
        System.out.println(palindrom);

        System.out.println("\n\n-------- Hanoi Tower --------");
        System.out.print("Masukkan jumlah piringan: ");
        int disc = sc.nextInt();
        hanoiTower(disc, 'a', 'b', 'c');

        System.out.println("\n\n-------- Bilangan Prima --------");
        System.out.print("Masukkan angka: ");
        int num = sc.nextInt();
        boolean prime = isPrime(num);
        System.out.println(prime);

        System.out.println("\n");
        sc.close();
    }

}
