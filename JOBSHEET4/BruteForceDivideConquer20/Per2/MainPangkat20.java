package JOBSHEET4.BruteForceDivideConquer20.Per2;
import java.util.Scanner;

public class MainPangkat20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        Pangkat20[] png = new Pangkat20[elemen];
        
        for(int i = 0; i < elemen; i++) {
            png[i] = new Pangkat20();
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat: ");
            int pangkat = sc.nextInt();
            png[i].nilai = nilai;
            png[i].pangkat = pangkat;
        }
        System.out.println("\nHasil Pangkat - Brute Force");
        for(int i = 0; i < elemen; i++) {
            System.out.println("Hasil Dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("\nHasil Pangkat - Divide Conquer");
        for(int i = 0; i < elemen; i++) {
            System.out.println("Hasil Dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}