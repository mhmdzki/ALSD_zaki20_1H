public class BukuMain21 {
        public static void main(String[] args) {
    
        Buku21 bk1 = new Buku21();
            
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
    
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        
        Buku21 bk2 = new Buku21("Self Reward", "Mahera Ayesha",160, 29,59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku21 bk3 = new Buku21("M Zaki", "Muhammad Zaki",280, 59,80000);
        bk3.terjual(20);
        bk3.tampilInformasi();
    }
}
