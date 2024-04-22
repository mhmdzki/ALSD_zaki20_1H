package UTS20.sorting.searching;
import java.util.Scanner;

public class PerusahaanMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianPerusahaan data = new PencarianPerusahaan();
        int jumPrshn = 16;

        System.out.println("=======================================");
        System.out.println("Masukkan nama perusahaan secara urut : ");
        for (int i = 0; i < jumPrshn; i++){
            System.out.println("=======================================");
            System.out.print("Perusahaan ke-     \t: ");
            String perusahaanKe = s.nextLine();
            System.out.print("keuntungan    \t: ");
            int keuntungan = s1.nextInt();

            Perusahaan m = new Perusahaan(perusahaanKe, keuntungan);
            data.tambahPerusahaan(m);
        }

        System.out.println("=======================================");

        System.out.println("Data keselutruhan Perusahaan : ");
        data.tampilDataPerusahaan();

        System.out.println("=======================================");
        System.out.println("Pencarian Data : ");
        System.out.println("=======================================");
        System.out.println("Masukkan urutan perusahaan : ");
        int cari = s.nextInt();

        System.out.println("=======================================");
        System.out.println("menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);

        System.out.println("=======================================");
        System.out.println("menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumPrshn -1);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}