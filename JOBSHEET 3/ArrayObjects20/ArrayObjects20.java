public class ArrayObjects20 {
    
    public static void main(String[] args) {
        PersegiPanjang20[] ppArrray  = new PersegiPanjang20[3];

        ppArrray[0] = new PersegiPanjang20();
        ppArrray[0].panjang = 110;
        ppArrray[0].lebar = 30;

        ppArrray[1] = new PersegiPanjang20();
        ppArrray[1].panjang = 80;
        ppArrray[1].lebar = 40;

        ppArrray[2] = new PersegiPanjang20();
        ppArrray[2].panjang = 100;
        ppArrray[2].lebar = 20;

        System.out.println("Persegi panjang ke-0, panjang: " + ppArrray[0].panjang + ", lebar: " + ppArrray[0].lebar);
        System.out.println("Persegi panjang ke-1, panjang: " + ppArrray[1].panjang + ", lebar: " + ppArrray[1].lebar);
        System.out.println("Persegi panjang ke-2, panjang: " + ppArrray[2].panjang + ", lebar: " + ppArrray[2].lebar);
    }
}