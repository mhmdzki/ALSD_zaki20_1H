import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilSetara, totNil = 0, ipSMT = 0;
        int sks = 18;
        String nilHuruf;
        String [][] mataKuliah = new String[8][2];
        double [][] angka = new double[8][2];
        double [] nilaiAngka = new double[8];


        for (int i = 0; i < 8; i++) {
            System.out.print("Mata Kuliah : ");
            String matkul = sc.nextLine();
            mataKuliah[i][0] = matkul;

            System.out.print("Bobot SKS : ");
            double bobotSKS = sc.nextDouble();
            angka[i][0] = bobotSKS;

            sc.nextLine();
        }

        System.out.println("===============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");

        for (int i = 0; i < 8; i++) {
            System.out.printf("%-2s %-37s %s", "masukkan nilai Angka untuk MK", mataKuliah[i][0], ": ");
            double nilai = sc.nextDouble();
            nilaiAngka [i] = nilai;

            if (nilaiAngka[i] >= 81) {
                nilHuruf = "A";
                nilSetara = 4;
            }else if (nilaiAngka[i] >= 74) {
                nilHuruf = "B+";
                nilSetara = 3.5;
            } else if (nilaiAngka[i] >= 66) {
                nilHuruf = "B";
                nilSetara = 3;
            } else if (nilaiAngka[i] >= 61) {
                nilHuruf = "C+";
                nilSetara = 2.5;
            } else if (nilaiAngka[i] >= 51) {
                nilHuruf = "C";
                nilSetara = 2;
            } else if (nilaiAngka[i] >= 40) {
                nilHuruf = "D";
                nilSetara = 1;
            } else {
                nilHuruf = "E";
                nilSetara = 0;
            }

            mataKuliah[i][1] = nilHuruf;
            angka[i][1] = nilSetara;
            
        }

        System.out.println("======================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("======================");

        System.out.printf("%-40s %-14s %-14s %s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < 8; i++) {
            System.out.printf("%-40s %-19s %-13s %s\n", mataKuliah[i][0], nilaiAngka[i], mataKuliah[i][1], angka[i][1]);
        }

        for (int i = 0; i < 8; i++) {
            totNil += angka[i][1] * angka[i][0];
        }

        ipSMT = totNil / sks;

        System.out.println("======================");
        System.out.printf("IP : %.2f%n", ipSMT);
    }
}