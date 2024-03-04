import java.util.Scanner;

public class Buku21 {

    String judul, pengarang;
    int halaman, stok, harga, total, jumlahBeli;
    double hargaDiskon, bayar;

    public Buku21 (String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("judul: " + judul);
        System.out.println("pengarang: " + pengarang);
        System.out.println("halaman: " + halaman);
        System.out.println("stok: " + stok);
        System.out.println("harga: Rp " + harga);
            
    }

    public void terjual(int jml) {
        if(jml < stok){
        stok -=jml;
        }else if (stok == 0) {
            System.out.println("stok habis");
        }else if (jml > stok) {
            System.out.println("stok tidak tersedia");
        }
    }

    int hitungTotal(int jml) {
        jumlahBeli = jml;
        total = harga * jml;
        return total;
    }

    double hitungDiskon() {
        if (total > 15000) {
            hargaDiskon = total * 0.12;
        }else if (total > 75000 && total < 150000) {
            hargaDiskon = total * 0.5;
        }else if (total < 75000) {
            hargaDiskon = total * 0;
        }
        return hargaDiskon;
    }

    double hitungTotalBayar() {
        bayar = total - hargaDiskon;
        return bayar;
    }

    void restock(int jml){
        stok +=jml;
    }
    int gantiHarga(int hrg) {
        harga = hrg;
        return harga;
    }    

    public Buku21() {

    }
}