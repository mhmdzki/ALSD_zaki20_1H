package JOBSHEET5.bubbleSelectionInsertion;
import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        DaftarmahasiswaBerprestasi20 list = new DaftarmahasiswaBerprestasi20();
        Mahasiswa20 m1 = new Mahasiswa20("Nusa", 2017, 25, 3);
        Mahasiswa20 m2 = new Mahasiswa20("rara", 2012, 19, 4);
        Mahasiswa20 m3 = new Mahasiswa20("Dompu", 2018, 19, 3.5);
        Mahasiswa20 m4 = new Mahasiswa20("Abdul", 2017, 23, 2);
        Mahasiswa20 m5 = new Mahasiswa20("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting : ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selestionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionSort();
        list.tampil();
    }
}
