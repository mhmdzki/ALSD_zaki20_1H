package JOBSHEET3;

import java.lang.Math;

public class Kerucut20 {
    int rusuk;
    int sisiMiring;

    Kerucut20(int r, int t) {
        this.rusuk = r;
        this.sisiMiring = t;
    }

    double luasPermukaan() {
        return Math.PI * this.rusuk * (this.rusuk + sisiMiring);
    }

    double volume() {
        return (1.0 / 3.0) * Math.PI * this.rusuk * this.rusuk * (Math.sqrt(Math.pow(this.rusuk, 2) + Math.pow(this.sisiMiring, 2)));
    }
}
