package UTS20.sorting;
import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        DaftarPerusahaan20 list = new DaftarPerusahaan20();
        Perusahaan20 p1 = new Perusahaan20("0", 18);
        Perusahaan20 p2 = new Perusahaan20("1", 14);
        Perusahaan20 p3 = new Perusahaan20("2", 26);
        Perusahaan20 p4 = new Perusahaan20("3", 50);
        Perusahaan20 p5 = new Perusahaan20("4", 29);
        Perusahaan20 p6 = new Perusahaan20("5", 2);
        Perusahaan20 p7 = new Perusahaan20("6", 24);
        Perusahaan20 p8 = new Perusahaan20("7", 2);
        Perusahaan20 p9 = new Perusahaan20("8", 22);
        Perusahaan20 p10 = new Perusahaan20("9", 19);
        Perusahaan20 p11 = new Perusahaan20("10", 14);
        Perusahaan20 p12 = new Perusahaan20("11", 32);
        Perusahaan20 p13 = new Perusahaan20("12", 35);
        Perusahaan20 p14 = new Perusahaan20("13", 1);
        Perusahaan20 p15 = new Perusahaan20("14", 1);
        Perusahaan20 p16 = new Perusahaan20("15", 34);
        Perusahaan20 p17 = new Perusahaan20("16", 15);

        list.tambah(p1);
        list.tambah(p2);
        list.tambah(p3);
        list.tambah(p4);
        list.tambah(p5);
        list.tambah(p6);
        list.tambah(p7);
        list.tambah(p8);
        list.tambah(p9);
        list.tambah(p10);
        list.tambah(p11);
        list.tambah(p12);
        list.tambah(p13);
        list.tambah(p14);
        list.tambah(p15);
        list.tambah(p16);
        list.tambah(p17);


        System.out.println("Data keuntungan perusahaan sebelum sorting : ");
        list.tampil();

        System.out.println("Data keuntungan perusahaan setelah sorting desc berdasarkan prsentase yang di dapatkan");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data keuntungan perusahaan setelah sorting asc berdasarkan prsentase yang di dapatkan");
        list.selestionSort();
        list.tampil();

        System.out.println("Data keuntungan perusahaan setelah sorting asc berdasarkan prsentase yang di dapatkan");
        list.insertionSort();
        list.tampil();
    }
}
