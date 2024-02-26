import java.util.Scanner;

public class ArrayObjects20 {
    
    public static void main(String[] args) {
        PersegiPanjang20[] ppArrray  = new PersegiPanjang20[3];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i< 3; i++) {
            ppArrray[i] = new PersegiPanjang20();
            System.out.println("Persegi panjang ke- " + i);
            System.out.print("masukkan panjang: ");
            ppArrray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArrray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke- " + i);
            System.out.println("Panjang: " + ppArrray[i].panjang + ", lebar: " + ppArrray[i].lebar);
        }
    }
}