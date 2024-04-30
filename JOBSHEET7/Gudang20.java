package JOBSHEET7;

public class Gudang20 {
    
    Barang20[] tumpukan;
    int size;
    int top;

    public Gudang20(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang20[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang20 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.print("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang20 ambilBarang() {
        if (!cekKosong()) {
            Barang20 delete = tumpukan[top];
            top--;
            System.out.print("Barang " + delete.nama + "diambil dari Gudang.");
            // System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang20 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang20 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang20 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang20 barangTerbawah = tumpukan[0]; 
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    
    public Barang20 cariBarang(int kode) {
        for (int i = 0; i <= top; i++) {
            if (tumpukan[i].kode == kode) {
                System.out.println("Barang dengan kode " + kode + " ditemukan: " + tumpukan[i].nama);
                return tumpukan[i];
            }
        }
        System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
        return null;
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi20 stack = new StackKonversi20();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
        }
}
 
