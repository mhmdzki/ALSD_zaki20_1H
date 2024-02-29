package JOBSHEET3;

import java.util.Scanner;

public class mainMhs20 {
    public static void main(String[] args) {
        Mahasiswa20[] Mhs = new Mahasiswa20[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < Mhs.length; i++) {
            Mhs[i] = new Mahasiswa20();
            System.out.println("Masukkan data Mahasiswa ke- :" + (i+1));
            System.out.print("Masukkan nama : ");
            Mhs[i].Nama = sc.nextLine();
            System.out.print("Masukkan NIM : ");
            Mhs[i].Nim = sc.nextInt();

            sc.nextLine();
            
            System.out.print("Masukkan jenis kelamin : ");
            Mhs[i].jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            Mhs[i].IPK = sc.nextDouble();

            sc.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("data Mahasiswa ke- " + (i+1));
            System.out.println("Nama : " + Mhs[i].Nama);
            System.out.println("Nim : " + Mhs[i].Nim);
            System.out.println("Jenis kelamin : " + Mhs[i].jenisKelamin);
            System.out.println("IPK : " + Mhs[i].IPK);
        }

        Mahasiswa20 jumlah = new Mahasiswa20();
        double rata2 = jumlah.hitungRata2(Mhs);
        System.out.println("Rata-rata IPK Mahasiswa : " + rata2);
        double juara = jumlah.cariRank1(Mhs);
        System.out.println("Rank 1 Mahasiswa : " + juara);
    }
}
