package JOBSHEET4.BruteForceDivideConquer20.Per2;
import java.util.Scanner;

public class MainPangkat20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================");
        System.out.print("Masukkan jumlah elemen yang akan dihitung : ");
        int elemen = sc.nextInt();

        Pangkat20[] png = new Pangkat20[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan : ");
            int angka = sc.nextInt();
            System.out.print("Masukkan nilai pangkat : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat20(angka, pangkat);
        }

        System.out.print("Silahkan pilih metode (1 = Brute Force, 2 = Divide and Conquer): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
            System.out.println("\nHasil Pangkat - Brute Force");
            for (int i = 0; i < elemen; i++) {
                System.out.print("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                System.out.println();
            }        
                break;
        
            case 2:
            System.out.println("\nHasil Pangkat - Divide and Conquer");
            for (int i = 0; i < elemen; i++) {
                System.out.print("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                System.out.println();
            }
                break;
        }

        sc.close();
    }
}