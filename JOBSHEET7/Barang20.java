package JOBSHEET7;
public class Barang20 {

    int kode;
    String nama;
    String kategori;

    public Barang20(int kode, String nama, String kategori) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
    }

    public void tampilDataBarang() {
        System.out.print("kode     : " + kode);
        System.out.print("nama     : " + nama);
        System.out.print("kategori : " + kategori);
    }
}
