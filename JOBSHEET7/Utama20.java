package JOBSHEET7;
import java.util.Scanner;
public class Utama20 {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Gudang20 gudang = new Gudang20(7);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Lihat barang teratas");
            System.out.println("4. Tampilkan tumpukan barang");
            System.out.println("5. Tampilkan barang terbawah");
            System.out.println("6. Cari barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = s.nextInt();
            s.nextLine();

            switch (pilihan) {
                case 1:
                System.out.print("Masukan kode barang: ");
                int kode = s.nextInt();
                s.nextLine();
                System.out.print("Masukan nama barang: ");
                String nama = s.nextLine();
                System.out.print("Masukan nama kategori: ");
                String kategori = s.nextLine();
                Barang20 barangBaru = new Barang20(kode, nama, kategori);
                gudang.tambahBarang(barangBaru);
                break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3 :
                    gudang.lihatBarangTeratas();
                    break;
                case 4:
                    gudang.tampilkanBarang();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Masukkan kode barang yang ingin dicari: ");
                    int keyword = s.nextInt();
                    gudang.cariBarang(keyword);
                    break;  
                case 7:
                    System.out.println("Terimakasih telah menggunakan program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}

