package JOBSHEET5.src;

public class Mahasiswa20 {
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa20 (String n, int t, int u, double i) {
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    void tampil () {
        System.out.println("Nama = " + nama);
        System.out.println("Tahun Masuk = " + thnMasuk);
        System.out.println("umur = " + umur);
        System.out.println("IPK = " + ipk);
    }
}