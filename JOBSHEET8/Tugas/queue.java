package JOBSHEET8.Tugas;

public class queue {
    Pembeli20 data[];
    int front, rear, size, max;

    public queue(int n) {
        this.max = n;
        data = new Pembeli20[max];
        size = 0;
        this.front = this.rear = -1;
    }

    public boolean isEmpty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if(size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if(!isEmpty()) {
            System.out.println("Antrian paling depan: " + data[this.front].nama + "\nNo Hp\t: " + data[this.front].noHp);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekLast() {
        if(!isEmpty()) {
            System.out.println("Antrian terakhir : " + data[this.rear].nama);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peeking(String cekNama) {
        if(!isEmpty()) {
            for(int i = 0; i < size; i++) {
                if(cekNama.equalsIgnoreCase(data[i].nama)) {
                    System.out.println("Nama\t\t: " + data[i].nama + "\nNo Hp\t: " + data[i].noHp);
                    System.out.println("Anda di posisi antrian ke : " + (i+1));
                } else if (!cekNama.equalsIgnoreCase(data[i].nama)){
                    System.out.println("Antrian tidak ditemukan");
                    break;
                }
            }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while(i < this.size) {
                System.out.println("Nama\t:" + data[i].nama);
                System.out.println("Na HP\t:" + data[i].noHp);
                System.out.println();
                i++;
            }
            System.out.println("Jumlah antrian : " + this.size);
        }
    }


    public void enqueue(Pembeli20 antrian) {
        if(isFull()){
            System.out.println("Antrian penuh");
        } else {
            if(isEmpty()) {
                this.front = this.rear = 0;
            } else {
                if(this.rear == this.max - 1) {
                    this.rear = 0;
                } else {
                    this.rear++;
                }
            }
            data[this.rear] = antrian;
            size++;
        }
    }

    public int dequeue() {

        if(isEmpty()) {
            System.out.println("Antrian kosong");
        } else {

            Pembeli20 temp[] = new Pembeli20[this.max];

            System.out.println("Antrian yang keluar\t: " + data[this.front].nama + "\nNo Hp\t\t: " + data[this.front].noHp);

            for(int i = 0; i < this.max; i++) {
                temp[i] = data[i];
            }

            for(int i = 0; i < this.max; i++) {
                for(int j = i+1; j < this.max; j++) {
                    data[i] = temp[i+1];
                }
            }

            size--;

            if(isEmpty()) {
                this.front = this.rear = -1;
            } else {
                if(this.front == this.max -1) {
                    this.front = 0;
                } else {
                    return this.front;
                }
            }
        }
        return this.front;
    }
}

