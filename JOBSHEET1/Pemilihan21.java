import java.util.Scanner;

public class Pemilihan21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS, nilaiAkhir;
        String nilaiHuruf, ketLulus;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==========================");

        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis  : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS   : ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS   : ");
        nilaiUAS = sc.nextDouble();
        
        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("==========================");
            System.out.println("==========================");
            System.out.println("nilai tidak valid");
            System.out.println("==========================");
            System.out.println("==========================");
            return;
        }

        nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
            ketLulus = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
            ketLulus = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
            ketLulus = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
            ketLulus = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
            ketLulus = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
            ketLulus = "MOHON MAAF ANDA TIDAK LULUS";
        } else {
            nilaiHuruf = "E";
            ketLulus = "MOHON MAAF ANDA TIDAK LULUS";
        }

        System.out.println("==========================");
        System.out.println("==========================");
        System.out.println("Nilai akhir : " + nilaiAkhir);
        System.out.println("Nilai huruf : " + nilaiHuruf);
        System.out.println("==========================");
        System.out.println("==========================");
        System.out.println(ketLulus);
        
    }
}