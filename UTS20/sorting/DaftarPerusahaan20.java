package UTS20.sorting;

public class DaftarPerusahaan20 {
    Perusahaan20 listPrshn[] = new Perusahaan20[17];
    int idx;

    void tambah (Perusahaan20 p) {
        if (idx < listPrshn.length) {
            listPrshn[idx] = p;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil () {
        for (Perusahaan20 p : listPrshn) {
            p.tampil();
            System.out.println("------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listPrshn.length; i++) {
            for (int j = 1; j < listPrshn.length; j++) {
                if (listPrshn[j].keuntungan > listPrshn[j-1].keuntungan) {
                    Perusahaan20 tmp = listPrshn[j];
                    listPrshn[j] = listPrshn[j-1];
                    listPrshn[j-1] = tmp;
                }
            }
        }
    }

    void selestionSort() {
        for (int i = 0; i < listPrshn.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < listPrshn.length; j++) {
                if (listPrshn[j].keuntungan < listPrshn[idxMin].keuntungan) {
                    idxMin = j;
                }
            }
            Perusahaan20 tmp = listPrshn[idxMin];
            listPrshn[idxMin] = listPrshn[i];
            listPrshn[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listPrshn.length; i++) {
            Perusahaan20 temp = listPrshn[i];
            int j = i;
            while (j > 0 && listPrshn[j-1].keuntungan < temp.keuntungan) {
                listPrshn[j] = listPrshn[j-1];
                j--;
            }
            listPrshn[j] = temp;
        }
    }
}