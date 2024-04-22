package UTS20.sorting.searching;

import UTS20.sorting.Perusahaan20;

public class Perusahaan {
    String perusahaanKe;
    int keuntungan, idx;
    Perusahaan20 lisPrshn[] = new Perusahaan20[16];

    Perusahaan (String perusahaanKe, int kentungan) {
        this.perusahaanKe = perusahaanKe;
        this.keuntungan = kentungan;
    }

    public void tampilData() {
        System.out.println("==================================");
        System.out.println("Perusahaan ke- = " + perusahaanKe);
        System.out.println("keuntungan = " + keuntungan);
    }
}
