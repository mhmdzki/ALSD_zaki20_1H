package UTS20.sorting.searching;

public class PencarianPerusahaan {
    Perusahaan[] listPrshn = new Perusahaan[16];
    int idx;

    void tambahPerusahaan(Perusahaan m) {
        if (idx < listPrshn.length) {
            listPrshn[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!");
        }
    }

    void tampilDataPerusahaan() {
        for (Perusahaan m : listPrshn) {
            m.tampilData();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listPrshn.length; j++) {
            if (listPrshn[j].keuntungan == cari) {
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
            if (cari == listPrshn[mid].keuntungan) {
                return (mid);
            } else if (listPrshn[mid].keuntungan > cari) {
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
            System.out.println("Perusahaan ke- : " + x);
            System.out.println("keuntungan : " + listPrshn[pos].keuntungan);
        } else {
            System.out.println("Data " + x + "tidak ditemukan!!");
        }
    }

    public Perusahaan FindBuku(int cari) {
        int posisi = -1;
        for (int i = 0; i < listPrshn.length; i++) {
            if (listPrshn[i].keuntungan == cari) {
                posisi = i;
                break;
            }
        }
        return listPrshn[posisi];
    }
}
