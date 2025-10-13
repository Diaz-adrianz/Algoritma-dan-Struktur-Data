#include <iostream>
#include <string>
using namespace std;

void soal1()
{
    string nama, keterangan;
    float nilai;

    cout << "Masukkan nama: ";
    cin >> nama;

    cout << "Masukkan nilai: ";
    cin >> nilai;

    if (nilai >= 60)
        keterangan = "Lulus";
    else
        keterangan = "tidak lulus";

    cout << "Halo, " << nama << ". Kamu " << keterangan << endl;
}

void soal2()
{
    int K = 1;

    while (K <= 10)
    {
        cout << "HALO" << endl;
        K += 1;
    }
}

void soal3()
{
    int bilangan, hasil_bagi, sisa_bagi;

    cout << "Masukkan bilangan: ";
    cin >> bilangan;

    hasil_bagi = bilangan / 2;
    sisa_bagi = bilangan - (hasil_bagi * 2);

    if (sisa_bagi == 0)
        cout << "Bilangan genap" << endl;
    else
        cout << "Bilangan ganjil" << endl;
}

void soal4()
{
    int x, y, p, q;

    cout << "Masukkan bilangan X: ";
    cin >> x;
    cout << "Masukkan bilangan Y: ";
    cin >> y;

    p = x + y;

    if (p >= 0)
        q = x * y;
    else
        q = x / y;

    cout << "Hasil: " << q << endl;
}

int main()
{
    soal4();
    return 0;
}
