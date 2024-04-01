package JOBSHEET6.TestSearching20;

public class PencarianBuku20 {
    Buku20 listBk[] = new Buku20[5];
    int idx;

    void tambah (Buku20 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah penuh!");
        }
    }

    void tampil () {
        for (Buku20 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j] != null && listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisi (int x, int pos) {
        if (pos!= -1) {
            System.out.println("data : " + x + "ditemukan pada indeks " + pos);
        } else {
            System.out.println("'data " + x +  "tidak ditemukan");
        }
    }
}
