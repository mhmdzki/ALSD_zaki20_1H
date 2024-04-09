package JOBSHEET6.TestSearching20;
import java.util.Scanner;

public class BukuMain20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku20 data = new PencarianBuku20();
        int jumBuku = 5;

        System.out.println("=======================================");
        System.out.println("Masukkan data Buku secara urut dari Kode Buku Terkecil : ");
        for (int i = 0; i < jumBuku; i++){
            System.out.println("=======================================");
            System.out.print("Kode Buku     \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku    \t: ");
            String judul = s1.nextLine();
            System.out.print("Tahun Terbit  \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("pengarang     \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stok          \t: ");
            int stok = s.nextInt();

            Buku20 m = new Buku20(kodeBuku, judul, tahunTerbit, pengarang, stok);
            data.tambahBuku(m);
        }

        System.out.println("=======================================");
        // System.out.println("Data keseluruhan Mahasiswa : ");

        System.out.println("=======================================");
        System.out.println("Data keselutruhan Buku : ");
        data.tampilDataBuku();

        System.out.println("=======================================");
        System.out.println("=======================================");
        System.out.println("Pencarian Data : ");
        System.out.println("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);

        System.out.println("=======================================");
        System.out.println("menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku -1);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("=======================================");
        System.out.println("=======================================");
        data.TampilData(cari, posisi);

        Buku20 dataBuku20 = data.FindBuku(cari);
        dataBuku20.tampilDataBuku();
    }
}