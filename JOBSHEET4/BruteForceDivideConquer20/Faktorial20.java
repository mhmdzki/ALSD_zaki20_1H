package JOBSHEET4.BruteForceDivideConquer20;

public class Faktorial20 {
    public int nilai;

    int faktorialBF (int n) {
        int fakto = 1;
        for (int i = 1; i <=n; i++){
            fakto = fakto * 1;
        }
        return fakto;
    }
    int faktorialDC (int n) {
        if (n==1){
            return 1;
        }
        else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}