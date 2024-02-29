# Laporan Praktikum 3

## Percobaan 1:  Membuat Array dari Object, Mengisi dan Menampilkan

kode Program

> <img src= "image.png">
> <img src= "image-1.png">

Hasil Running

> <img src= "image-12.png">

Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method?Jelaskan!
2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan
konstruktur pada baris program berikut :
> <img src= "ArrayObjects20/image-3.png">
3. Apa yang dimaksud dengan kode berikut ini:
> <img src= "ArrayObjects20/image-4.png">
4. Apa yang dimaksud dengan kode berikut ini:
> <img src= "ArrayObjects20/image-5.png">
5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?

Jawaban
1. Tidak, class yang akan dibuat array of object tidak harus selalu memiliki atribut dan method sekaligus karena:
    - Class yang hanya berisi atribut saja tetap bisa dibuat array of object-nya.
    - Class yang hanya berisi method saja, tanpa ada atribut, juga tetap bisa dibuat array of object-nya
2. Tidak, Karena hal terssebut sudah seharusnya dilakukan ketika instansiasi meskipun tidak memiliki konstruktor
3. Kode yang digunakan untuk melakukan instansiasi objek
4. Kode yang digunakan untuk melakukan deklrasi objek
5. pemisahan ini mengikuti prinsip desain yang baik dalam OOP yaitu pemilahan tugas dan reusability class

## Percobaan 2: Menerima Input Isian Array Menggunakan Looping

Kode Program :

> <img src= "image-2.png">

Hasil Running :

> <img src= "image-3.png">

Pertanyaan
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?
2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!
3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode
dibawah ini akan memunculkan error saat dijalankan. Mengapa?
> <img src= "image-4.png">
4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!
5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan
pada ppArray[i] sekaligus ppArray[0]?Jelaskan 

Jawaban
1. Bisa, karena array of object sama sepert implementasi array
2. PresegiPanjang[][] ppArray = new PresegiPanjang[i][j];
3. Kodenya akan eror dikarenakan tidak ada instansiasi
4. System.out.print("Berapa banyak persegi panjang ? : ");
   int i = sc.nextInt();
   PresegiPanjang[] ppArray = new PresegiPanjang[i];
5. Boleh, karena dalam ppArray[i] berupa looping sehingga instansiasi sebenarnya sudah dilakukan

## Percobaan 3

Kode Program :

> <img src= "image-5.png">
> <img src= "image-9.png">

Hasil Running :

> <img src= "image-8.png">

pertanyaan
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!
2. Jika diketahui terdapat class Segitiga seperti berikut ini:
> <img src= "image-10.png">
   Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t
   yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.
   
3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
   tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan
   library Math pada Java untuk mengkalkulasi sisi miring)
4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing
   atributnya sebagai berikut:
    sgArray ke-0 alas: 10, tinggi: 4
    sgArray ke-1 alas: 20, tinggi: 10
    sgArray ke-2 alas: 15, tinggi: 6
    sgArray ke-3 alas: 25, tinggi: 10
5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method
   hitungLuas() dan hitungKeliling().

Jawaban
1. Bisa, didalam satu class dapat memuat banyk konstuktor, contoh
> <img src= "image-9.png">

2. 
> <img src= "image-11.png">
3. 
> <img src= "image-13.png">
4. 
> <img src= "image-14.png">
5. 
> <img src= "image-15.png">
> <img src= "image-16.png">

# Latihan Praktikum

Pertanyaan

1. Buatlah program yang dapat menghitung luas permukaan dan volume bangun ruang kerucut,
limas segi empat sama sisi, dan bola. Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun
ruang. Buatlah satu main class untuk membuat array of objects yang menginputkan atributatribut yang ada menggunakan konstruktor semua bangun ruang tersebut. Dengan ketentuan,
- Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan
luas permukaan dan volume dari tiap jenis bangun ruang tersebut.
- Pada kerucut, inputan untuk atribut hanya jari-jari dan sisi miring
- Pada limas segi empat sama sisi, inputan untuk atribut hanya panjang sisi alas dan
tinggi limas
- Pada bola, inpuntan untuk atribut hanya jari-jari

2. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama,
nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi
tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika
dimisalkan terdapat 3 data mahasiswa yang tersedia. Contoh output program:

> <img src= "image-17.png">

3. Modifikasi program Latihan no.2 di atas, sehingga bisa digunakan untuk menghitung rata-rata IPK,
serta menampilkan data mahasiswa dengan IPK terbesar! (gunakan method untuk masing-masing
proses tersebut)

Jawaban

1. 
2. 
main 

> <img src= "mainTugas2.png">

class

> <img src= "image-18.png">

Output

> <img src= "image-19.png">

3.
main

> <img src= "image-20.png">

class

> <img src= "image-21.png">

Output

> <img src= "image-22.png">