package JOBSHEET5.bubbleSelectionInsertion.tugas;
import java.util.Scanner;

public class MainHotel20 {

    public static void main(String[] args) {
        HotelService20 listRooms = new HotelService20();
        Hotel20 h1 = new Hotel20("Melati","Malang", 500000, (byte) 5);
        Hotel20 h2 = new Hotel20("Mawar","Malang", 300000,  (byte) 3);
        Hotel20 h3 = new Hotel20("Anggrek","Malang", 400000, (byte)  4);
        Hotel20 h4 = new Hotel20("Dahlia","Malang", 225000, (byte)  2);
        Hotel20 h5 = new Hotel20("kaktus","Malang", 150000, (byte)  1);

        listRooms.tambah(h1);
        listRooms.tambah(h2);
        listRooms.tambah(h3);
        listRooms.tambah(h4);
        listRooms.tambah(h5);

        System.out.println("Data hotel sebelum sorting : ");
        listRooms.tmpl();

        System.out.println("Data hotel setelah sorting desc berdasarkan harga");
        listRooms.bbleSort2();
        listRooms.tmpl();

        System.out.println("Data hotel setelah sorting asc berdasarkan harga");
        listRooms.slstnSort2();
        listRooms.tmpl();

        System.out.println("Data hotel setelah sorting desc berdasarkan bintang");
        listRooms.bbleSort();
        listRooms.tmpl();

        System.out.println("Data hotel setelah sorting asc berdasarkan bintang");
        listRooms.slstnSort();
        listRooms.tmpl();

    }
}
