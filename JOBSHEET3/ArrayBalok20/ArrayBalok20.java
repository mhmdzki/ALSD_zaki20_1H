package JOBSHEET3.ArrayBalok20;

public class ArrayBalok20 {
    public static void main(String[] args) {

    for (int i = 0; i < args.length; i++) {
        
    }
        Balok20[] blArray = new Balok20[3];

    blArray[0] = new Balok20(100, 30, 12);
    blArray[1] = new Balok20(120, 40, 15);
    blArray[2] = new Balok20(210, 50, 25);

    for (int i = 0; i < 3; i++) {
        System.out.println("Volume balok ke-" + i + ": " + blArray[i].hitungVolume());
        }
    Segitiga20[] sgArray = new Segitiga20[4];
    sgArray[0] = new Segitiga20(10, 4);
    sgArray[1] = new Segitiga20(20, 10);
    sgArray[2] = new Segitiga20(15, 6);
    sgArray[3] = new Segitiga20(25, 10);

    for (int i = 0; i < 4; i++) {
        double hitungLuas = sgArray[i].hitungLuas();
        double hitungKeliling = sgArray[i].hitungKeliling();
        System.out.println("Segitiga ke- "+ (i+1) + " memiliki luas : " + hitungLuas + " dan keliling : " + hitungKeliling);
        }
    }
}
