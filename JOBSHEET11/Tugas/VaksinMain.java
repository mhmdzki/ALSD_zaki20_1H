package JOBSHEET11.Tugas;
import java.util.Scanner;

public class VaksinMain {
    public static void main(String[] args) throws Exception {
    //array menu
  

    //instance scanner
    Scanner input = new Scanner(System.in);
    vaksin vk = new vaksin ();

    //main menu 
    int pilih = -1;
    while (pilih != 4) {
        vk.menu();
        System.out.print("Input menu : ");
        pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan data penerima vaksin");
                    System.out.println("-----------------------------");
                    System.out.println("Nomor antrian : ");
                    int antrian = input.nextInt();
                    System.out.println("Nama Penerima  : ");
                    input.nextLine();
                    String penerima = input.nextLine();
                    vk.add(antrian, penerima);
                    
                break;
                case 2:
                vk.remove(); 
                    break;
                case 3:
                vk.print();
                break;
            }
        }  
    }
}
