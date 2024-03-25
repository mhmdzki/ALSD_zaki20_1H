package JOBSHEET5.bubbleSelectionInsertion.tugas;

public class HotelService20 {
    Hotel20 rooms[] = new Hotel20[5];
    int idx;

    void tambah (Hotel20 h) {
        if (idx < rooms.length) {
            rooms[idx] = h;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil () {
        for (Hotel20 h : rooms) {
            h.tampil();
            System.out.println("------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[j-1].bintang) {
                    Hotel20 tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }

    void selestionSort() {
        for (int i = 0; i < rooms.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].bintang < rooms[idxMin].bintang) {
                    idxMin = j;
                }
            }
            Hotel20 tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
