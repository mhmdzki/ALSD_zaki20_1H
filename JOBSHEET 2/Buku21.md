 Pertanyaan 
1. Sebutkan dua karakteristik class atau object! 
2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class 
Buku? Sebutkan apa saja atributnya! 
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya! 
4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut 
sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)! 
5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int? 
6. Commit dan push kode program ke Github

Jawaban
1. Inheritance dan Encapsulation
2. Class Buku memiliki 5 atribut, yaitu:
    1. judul (String): untuk menyimpan judul buku.
    2. pengarang (String): untuk menyimpan nama pengarang buku.
    3. halaman (int): untuk menyimpan jumlah halaman buku.
    4. stok (int): untuk menyimpan jumlah stok buku yang tersedia.
    5. harga (int): untuk menyimpan harga buku.
3. Class Buku memiliki 4 method, yaitu:
    1. tampilInformasi(): Method ini digunakan untuk menampilkan informasi judul, pengarang, halaman, stok, dan harga buku.
    2. terjual(int jml): Method ini digunakan untuk mengurangi jumlah stok buku berdasarkan jumlah buku yang terjual.
    3. restock(int jml): Method ini digunakan untuk menambah jumlah stok buku berdasarkan jumlah buku yang restock.
    4. gantiHarga(int hrg): Method ini digunakan untuk mengganti harga buku dengan harga baru.
4. import java.util.Scanner;

public class Buku21 {

    public static void main(String[] args) {
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
            if (stok > 0) {
            stok -= jml;
            System.out.println(jml + buku telah terjual.);
            } else {
            System.out.println(Tidak dapat melakukan penjualan, stok buku kosong.);
            }
        }
        void restock(int jml);{
            stok +=jml;
        }
        void gantiHarga(int hrg);{
            harga = hrg;
        }
    }
}

5. Karena parameter tersebut digunakan untuk menentukan jumlah buku yang akan ditambhakan ke stok.
6. -