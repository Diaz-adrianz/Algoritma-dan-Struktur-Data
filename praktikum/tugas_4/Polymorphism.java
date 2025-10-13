package tugas_4;

class CetakDataTipe {

    public void CetakData(String Cetak) {
        System.out.println(Cetak);
    }

    public void CetakData(int Cetak) {
        System.out.println(Cetak);
    }

    public void CetakData(double Cetak) {
        System.out.println(Cetak);
    }

    public void CetakData(char Cetak) {
        System.out.println(Cetak);
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        CetakDataTipe data = new CetakDataTipe();

        System.out.print("Cetak Data Tipe String : ");
        data.CetakData("Sumatra");

        System.out.print("Cetak Data Tipe Integer : ");
        data.CetakData(1989);

        System.out.print("Cetak Data Tipe Double : ");
        data.CetakData(16.5 / 2);

        System.out.print("Cetak Data Tipe Char : ");
        data.CetakData('N');
    }
}
