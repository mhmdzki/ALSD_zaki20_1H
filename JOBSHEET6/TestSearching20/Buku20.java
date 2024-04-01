package JOBSHEET6.TestSearching20;

public class Buku20 {
    int kodeBuku;
    int tahunPenerbit;
    int stock;
    String judulBuku;
    String pengarang;

    Buku20 (int kodeBuku, int tahunPenerbit, int stock, String judulBuku, String pengarang) {
        kodeBuku = kodeBuku;
        tahunPenerbit = tahunPenerbit;
        stock = stock;
        judulBuku = judulBuku;
        pengarang = pengarang;
    }
     
    public void tampilDataBuku() {
        System.out.println("=========================");
        System.out.println("Ode Buku :" + kodeBuku);
        System.out.println("Judul Buku :" + judulBuku);
        System.out.println("Tahun Penerbit :" + tahunPenerbit);
        System.out.println("Pengarang ;" + pengarang);
        System.out.println("Stock :" + stock);
    }
}
