package JOBSHEET5.bubbleSelectionInsertion.tugas;

public class HotelService20 {
    Hotel20 listRooms[] = new Hotel20[5];
    int idx;

    void tambah (Hotel20 h) {
        if (idx < listRooms.length) {
            listRooms[idx] = h;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tmpl () {
        for (Hotel20 h : listRooms) {
            h.tampil();
            System.out.println("------------------------------");
        }
    }
void bbleSort2() {
        for (int i = 0; i < listRooms.length; i++) {
            for (int j = 1; j < listRooms.length; j++) {
                if (listRooms[j].harga < listRooms[j-1].harga) {
                    Hotel20 tmp = listRooms[j];
                    listRooms[j] = listRooms[j-1];
                    listRooms[j-1] = tmp;
                }
            }
        }
    }

    void slstnSort2() {
        for (int i = 0; i < listRooms.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < listRooms.length; j++) {
                if (listRooms[j].harga < listRooms[idxMin].harga) {
                    idxMin = j;
                }
            }
            Hotel20 tmp = listRooms[idxMin];
            listRooms[idxMin] = listRooms[i];
            listRooms[i] = tmp;
        }
    }

    void bbleSort() {
        for (int i = 0; i < listRooms.length; i++) {
            for (int j = 1; j < listRooms.length; j++) {
                if (listRooms[j].bintang > listRooms[j-1].bintang) {
                    Hotel20 tmp = listRooms[j];
                    listRooms[j] = listRooms[j-1];
                    listRooms[j-1] = tmp;
                }
            }
        }
    }

    void slstnSort() {
        for (int i = 0; i < listRooms.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < listRooms.length; j++) {
                if (listRooms[j].bintang > listRooms[idxMin].bintang) {
                    idxMin = j;
                }
            }
            Hotel20 tmp = listRooms[idxMin];
            listRooms[idxMin] = listRooms[i];
            listRooms[i] = tmp;
        }
    }
}
