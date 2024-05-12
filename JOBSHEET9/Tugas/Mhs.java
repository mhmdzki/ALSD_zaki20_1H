package JOBSHEET9.Tugas;

public class Mhs {
    int nim;
    String nama;
    Mhs next;

    Mhs(int nim, String nama, Mhs next) {
        this.nim = nim;
        this.nama = nama;
        this.next = next;
    }
}
