package JOBSHEET3;

import java.util.Scanner;

public class MainTugas1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen untuk kerucut : ");
        int jmlArray = a.nextInt();

        Kerucut20[] krct = new Kerucut20[jmlArray];

        for(int i = 0; i < jmlArray; i++) {
            System.out.print("Masukkan panjang rusuk : ");
            int r = a.nextInt();
            System.out.print("Masukkan panjang selimut : ");
            int s = b.nextInt();
            krct[i] = new Kerucut20(r, s);
            double luas = krct[i].luasPermukaan();
            System.out.println("Luas permukaan : " + luas);
            double vol = krct[i].volume();
            System.out.println("Volume : " + vol);
        }
        
        System.out.print("Masukkan jumlah elemen untuk bola : ");
        jmlArray = a.nextInt();
        
        Bola20[] bl = new Bola20[jmlArray];
        
        for(int i = 0; i < jmlArray; i++) {
            System.out.print("masukkan panjang rusuk : ");
            int r = a.nextInt();
            bl[i] = new Bola20(r);
            double luas = bl[i].luasPermukaan();
            System.out.println("Luas permukaan : " + luas);
            double vol = bl[i].volume();
            System.out.println("Volume : " + vol);
        }

        System.out.print("Masukkan jumlah elemen untuk limas segiempat sama sisi : ");
        jmlArray = a.nextInt();
        
        LimasSegiEmpat20[] lms = new LimasSegiEmpat20[jmlArray];
        
        for(int i = 0; i < jmlArray; i++) {
            System.out.print("Masukkan panjang sisi : ");
            int s = a.nextInt();
            System.out.print("Masukkan panjang sisi miring : ");
            int sm = b.nextInt();
            lms[i] = new LimasSegiEmpat20(s, sm);
            double luas = lms[i].luasPermukaan();
            System.out.println("Luas permukaan : " + luas);
            double vol = lms[i].volume();
            System.out.println("Volume : " + vol);
        }

        a.close();
        b.close();
    }
}