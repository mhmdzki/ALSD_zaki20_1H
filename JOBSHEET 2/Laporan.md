# Laporan Praktikum 2

## Percobaan 1: Deklarasi class, Atribut dan method

Kode Program
<img src= "image.png" >

Hasil Running
<img src= "image-1.png">

 Pertanyaan
1. Sebutkan dua karakteristik class atau object!
2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class 
Buku? Sebutkan apa saja atributnya!
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya! 
4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut 
sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)! 
5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int? 
6. Commit dan push kode program ke Github

Jawaban
1. Inheritance dan Encapsulation
2. Class Buku memiliki 5 atribut, yaitu:
    1. judul (String): untuk menyimpan judul buku.
    2. pengarang (String): untuk menyimpan nama pengarang buku.
    3. halaman (int): untuk menyimpan jumlah halaman buku.
    4. stok (int): untuk menyimpan jumlah stok buku yang tersedia.
    5. harga (int): untuk menyimpan harga buku.
3. Class Buku memiliki 4 method, yaitu:
    1. tampilInformasi(): Method ini digunakan untuk menampilkan informasi judul, pengarang, halaman, stok, dan harga buku.
    2. terjual(int jml): Method ini digunakan untuk mengurangi jumlah stok buku berdasarkan jumlah buku yang terjual.
    3. restock(int jml): Method ini digunakan untuk menambah jumlah stok buku berdasarkan jumlah buku yang restock.
    4. gantiHarga(int hrg): Method ini digunakan untuk mengganti harga buku dengan harga baru.
4. <img src= "image-2.png">

5. Karena parameter tersebut digunakan untuk menentukan jumlah buku yang akan ditambhakan ke stok.
6. -

## Percobaan 2:  Instansiasi Object, serta Mengakses Atribut dan Method

Kode Program
<img src= "image-3.png">

Hasil Running
<img src= "image-4.png">

Pertanyaan
1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi!
Apa nama object yang dihasilkan? 
2. Bagaimana cara mengakses atribut dan method dari suatu objek? 
3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?

Jawaban
1. kode program yang digunakan untuk proses instansiasi adalah Buku21 bk1 = new Buku21();, dan nama object yang dihasilkan adalah 'bk1'
2. cara mengakses atribut dan method dari suatu objek adalah dengan menggunakan nama objek yang telah diinstansiasi dan operator titik (.) yang digunakan untuk mengakses atribut dan method dari objek tersebut
3. pemanggilan method tampilInformasi() pertama dan kedua berbeda karena  terdapat perubahan nilai pada atribut 'stok' dan 'harga' setelah method 'terjual()' dan gantiHarga()' dipanggil.

## Percobaan 3: Membuat Konstruktor

Kode Program
<img src= "image-5.png">
<img src= "image-6.png">

Hasil Running
<img src= "image-7.png">

Pertanyaan
1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk 
mendeklarasikan konstruktor berparameter!
2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?  
3. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana 
hasilnya? Jelaskan mengapa hasilnya demikian!
4. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses 
secara berurutan? Jelaskan alasannya!
5. Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor berparameter dari class Buku! 
6. Commit dan push kode program ke Github

Jawaban
1. <img src= "image-8.png">
2. kode tersebut membuat object baru berupa bk2 dari kelas Buku21, dan nilai atributnya diisi langsung saat pembuatan objectmenggunakan konstruktor berparameter
3. kode akan eror dan tidak bisa di run, karena konstruktor default diperlukan untuk inisialisasi objek
4. tidak, karena ada beberapa alasan yaitu:
    A. Method dalam sebuah class bersifat independen satu sama lain.
    B. Method hanya menjalankan fungsionalitas yang telah didefinisikan di dalamnya. Method tidak saling tergantung satu sama lain.
    D. Urutan eksekusi method tergantung pada desain program dan logika bisnis yang ingin diimplementasikan.
    D. Urutannya tidak harus sesuai deklarasi method di dalam class.
    E. urutan pemanggilan method bersifat fleksibel dan tergantung logically program yang ingin dibuat.
5. <img src= "image-9.png">
6. -

## Latihan Praktikum

1. Membuat sistem pada class Buku21 dengan menambah 3 method seperti foto class diagaram dibawah
<img src= "image-10.png">

Jawaban

Menambah beberapa method dalam Buku21 dengan perincian
1. <img src= "image-11.png">
2. <img src= "image-12.png">
3. <img src= "image-13.png">

Sehingga menghasilkan output seperti berikut
<img src= "image-14.png">

2. Buat program berdasarkan class diagram berikut ini!
<img src= "image-15.png">

Jawaban

Kode program Dragon21 Dan DragonMain21

<img src= "P2 Dragon alsd.png">
<img src= "P2 DragonMain alsd.png">

Output

<img src= "image-16.png">

Penjelasan

Dragon21.java
Dragon21.java adalah kelas yang berisi logic untuk objek Dragon. Terdapat variabel untuk posisi X dan Y, width dan height arena, serta method untuk menggerakkan dragon ke kiri, kanan, atas, bawah. Juga terdapat method untuk mendeteksi collision dan print posisi dragon.

DragonMain21.java
DragonMain21.java adalah kelas Main program yang menginisiasi objek Dragon21 dan memanggil method-methodnya. Terdapat game loop untuk terus menerima input pengguna untuk menggerakkan dragon. Loop akan berhenti jika dragon collision terdeteksi.

Dragon21.java berisi logic untuk objek dragon, sedangkan DragonMain21.java adalah driver class untuk menjalankan program game sederhana dengan memanggil objek Dragon21.

Kedua kelas saling berhubungan karena DragonMain21 membuat objek Dragon21 dan memanggil method-methodnya untuk menggerakkan dragon dan mencetak posisinya. Dragon21 sendiri mengimplementasikan logic pergerakan dragon.