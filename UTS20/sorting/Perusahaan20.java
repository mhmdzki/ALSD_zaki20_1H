package UTS20.sorting;

public class Perusahaan20 {
    String perusahaanKe;
    int keuntungan;

    Perusahaan20 (String p, int k) {
        perusahaanKe = p;
        keuntungan = k;
    }

    void tampil () {
        System.out.println("Perusahaan ke- = " + perusahaanKe);
        System.out.println("keuntungan = " + keuntungan);
    }
}