package JOBSHEET4.BruteForceDivideConquer20.Per1;

import java.util.Scanner;

public class MainFaktorial20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        Faktorial20[] fk = new Faktorial20[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial20();
            System.out.println("Masukkan nilai data ke-" + (i+1) + ":");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah "
            + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DEVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Devide and Conquer adalah "
            + fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("------------------------------------------------------------------------");
    }
}