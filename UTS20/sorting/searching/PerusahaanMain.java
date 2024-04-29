package UTS20.sorting.searching;
import java.util.Scanner;

public class PerusahaanMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianPerusahaan data = new PencarianPerusahaan();
        int jumPrshn = 17;
        PencarianPerusahaan list = new PencarianPerusahaan();
        Perusahaan p1 = new Perusahaan("0", 18);
        Perusahaan p2 = new Perusahaan("1", 14);
        Perusahaan p3 = new Perusahaan("2", 26);
        Perusahaan p4 = new Perusahaan("3", 50);
        Perusahaan p5 = new Perusahaan("4", 29);
        Perusahaan p6 = new Perusahaan("5", 2);
        Perusahaan p7 = new Perusahaan("6", 24);
        Perusahaan p8 = new Perusahaan("7", 2);
        Perusahaan p9 = new Perusahaan("8", 22);
        Perusahaan p10 = new Perusahaan("9", 19);
        Perusahaan p11 = new Perusahaan("10", 14);
        Perusahaan p12 = new Perusahaan("11", 32);
        Perusahaan p13 = new Perusahaan("12", 35);
        Perusahaan p14 = new Perusahaan("13", 1);
        Perusahaan p15 = new Perusahaan("14", 1);
        Perusahaan p16 = new Perusahaan("15", 34);
        Perusahaan p17 = new Perusahaan("16", 15);

        list.tambahPerusahaan(p1);
        list.tambahPerusahaan(p2);
        list.tambahPerusahaan(p3);
        list.tambahPerusahaan(p4);
        list.tambahPerusahaan(p5);
        list.tambahPerusahaan(p6);
        list.tambahPerusahaan(p7);
        list.tambahPerusahaan(p8);
        list.tambahPerusahaan(p9);
        list.tambahPerusahaan(p10);
        list.tambahPerusahaan(p11);
        list.tambahPerusahaan(p12);
        list.tambahPerusahaan(p13);
        list.tambahPerusahaan(p14);
        list.tambahPerusahaan(p15);
        list.tambahPerusahaan(p16);
        list.tambahPerusahaan(p17);
        // System.out.println("=======================================");
        // System.out.println("Masukkan perusahaan secara urut : ");
        // for (int i = 0; i < jumPrshn; i++){
        //     System.out.println("=======================================");
        //     System.out.print("Perusahaan ke-     \t: ");
        //     String perusahaanKe = s.nextLine();
        //     System.out.print("keuntungan    \t: ");
        //     int keuntungan = s1.nextInt();

        //     Perusahaan m = new Perusahaan(perusahaanKe, keuntungan);
        //     data.tambahPerusahaanPerusahaan(m);
        // }

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