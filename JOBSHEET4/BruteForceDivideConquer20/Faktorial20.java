package JOBSHEET4.BruteForceDivideConquer20;

public class Faktorial20 {
    public int nilai;

    int faktorialBF (int n) {
        int fakto = 1;
        for (int i = n; i > 0; i--){
            fakto *= i;
        }
        return fakto;
    }
    int faktorialDC (int n) {
        if (n==1){
            return 1;
        }
        else {
            return n * faktorialDC(n - 1);
        }
    }
}