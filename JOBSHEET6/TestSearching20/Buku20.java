package JOBSHEET6.TestSearching20;

public class Buku20 {
    int kodeBuku, tahunTerbit, stok, idx;
    String judul, pengarang;
    Buku20 lisBuku20[] = new Buku20[5];

    Buku20(int kodeBuku, String judul, int tahunTerbit, String pengarang, int stok) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    public void tampilDataBuku() {
        System.out.println("==================================");
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul Buku : " + judul);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Stok : " + stok);
    }
}
