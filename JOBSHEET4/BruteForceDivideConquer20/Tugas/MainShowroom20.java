package JOBSHEET4.BruteForceDivideConquer20.Tugas;

import java.util.Scanner;

public class MainShowroom20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mobil : ");
        int x = sc.nextInt();
        Showroom20 variant = new Showroom20(x);

        System.out.println("================================");

        System.out.print("Apa yang ingin Anda hitung?(1 = Acceleration tertinggi, 2 = Acceleration terendah, 3 = Rata-rata power) : ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("=============================================");
                System.out.println("Menghitung akselerasi tertinggi dari mobil-mobil yang telah diinput");

                for (int i = 0; i < x; i++) {
                    System.out.print("Masukkan akselerasi untuk mobil ke-" + (i + 1) + " : ");
                    variant.accel[i] = sc.nextInt();
                }

                variant.accel(variant.accel, 0, variant.accel.length - 1);
                System.out.println("Akselerasi tertinggi adalah : " + variant.accel[variant.accel.length-1]);
                
                break;
                
                case 2:
                System.out.println("=============================================");
                System.out.println("Menghitung rata-rata power dari mobil-mobil yang telah diinput");
                
                for (int i = 0; i < x; i++) {
                    System.out.print("Masukkan power untuk mobil ke-" + (i + 1) + " : ");
                    variant.accel[i] = sc.nextInt();
                }

                variant.accel(variant.accel, 0, variant.accel.length - 1);
                System.out.println("Akselerasi terendah adalah : " + variant.accel[0]);

                break;

            case 3:
                System.out.println("=============================================");
                System.out.println("Menghitung rata-rata power dari mobil-mobil yang telah diinput");

                for (int i = 0; i < x; i++) {
                    System.out.print("Masukkan power untuk mobil ke-" + (i + 1) + " : ");
                    variant.power[i] = sc.nextDouble();
                }
                System.out
                        .println("Rata-rata power dari mobil-mobil tersebut adalah : " + variant.rerata(variant.power));

                break;
        }

        sc.close();
    }
}
