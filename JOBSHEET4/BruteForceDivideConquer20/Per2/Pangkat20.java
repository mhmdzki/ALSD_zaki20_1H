package JOBSHEET4.BruteForceDivideConquer20.Per2;
import java.util.Scanner;

public class Pangkat20 {
    public int nilai, pangkat;

    Pangkat20 (int angka, int pangkat) {
        this.nilai = angka;
        this.pangkat = pangkat;
    }

    int pangkatBF(int a, int n) {
        int hasil = 1;
        for(int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if (n==0) {
            return 1;
        } else {
            if(n%2 == 1) {
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a);
            } else {
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
            }
        }
    }
}
