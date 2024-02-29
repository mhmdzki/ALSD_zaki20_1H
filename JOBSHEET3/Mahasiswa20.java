package JOBSHEET3;

public class Mahasiswa20 {
    public String Nama, jenisKelamin;
    public int Nim;
    public double IPK;

    double hitungRata2 (Mahasiswa20[] Mhs) {
        double total = 0;
        for (int i = 0; i < 3; i++) {
            total += Mhs[i].IPK;
        }
        return total/3;
    }
    double cariRank1 (Mahasiswa20[] Mhs) {
        double rank1 = Mhs[0].IPK;
        for (int i = 0; i < 3; i++) {
            if (Mhs[i].IPK > rank1) {
                rank1 = Mhs[i].IPK;
            }
        }
        return rank1;
    }
}
