package JOBSHEET3.ArrayBalok20;

public class Segitiga20 {
    public int alas;
    public int tinggi;

    public Segitiga20 (int a, int t) {
        this.alas = a;
        this.tinggi = t;
    }

    public double hitungLuas() {
        return  this.alas * this.tinggi * 0.5;
    }

    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return 2 * sisiMiring + alas;
    }
}
