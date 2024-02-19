import java.util.Scanner;

public class Buku21 {

        String judul, pengarang;
        int halaman, stok, harga;

        void tampilInformasi() {
            System.out.println("judul: " + judul);
            System.out.println("pengarang: " + pengarang);
            System.out.println("halaman: " + halaman);
            System.out.println("stok: " + stok);
            System.out.println("harga: " + harga);
            
        }
        public void terjual(int jml) {
            stok -=jml;
        }
        void restock(int jml){
            stok +=jml;
        }
        void gantiHarga(int hrg) {
            harga = hrg;
        }    
        public Buku21() {

        }
        public Buku21 (String jud, String pg, int hal, int stok, int har) {
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
        }
}