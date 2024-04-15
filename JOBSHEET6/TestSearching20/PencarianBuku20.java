package JOBSHEET6.TestSearching20;

public class PencarianBuku20 {
    Buku20[] listBk = new Buku20[5];
    int idx;

    void tambahBuku(Buku20 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!");
        }
    }

    void tampilDataBuku() {
        for (Buku20 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            } else if (listBk[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    public void tampilPosisi(int x, int pos) {
        if (pos!= -1){
            System.out.println("data : " + x + "ditemukan pada indeks " + pos);
        } else {
            System.out.println("data : " + x + "tidak ditemukan");
        }
    }

    void TampilData (int x, int pos) {
        if (pos!= -1) {
            System.out.println("Kode Buku : " + x);
            System.out.println("Judul : " + listBk[pos].judul);
            System.out.println("Tahun Terbit : "+ listBk[pos].tahunTerbit);
            System.out.println("Pengarang : " + listBk[pos].pengarang);
            System.out.println("Stok : " + listBk[pos].stok);
        } else {
            System.out.println("Data " + x + "tidak ditemukan!!");
        }
    }

    public Buku20 FindBuku(int cari) {
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                posisi = i;
                break;
            }
        }
        return listBk[posisi];
    }
}
