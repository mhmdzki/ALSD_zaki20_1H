import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        League league = new League();

        // Memperbarui hasil pertandingan Pekan 1 (7-8 Januari)
        league.updateResult("Palembang Bank Sumsel Babel", "Surabaya Bhayangkara Samator", 1, 3);
        league.updateResult("Kudus Sukun Badak", "Bogor LaVani", 1, 3);
        league.updateResult("Jakarta BNI 46", "Jakarta Pertamina Pertamax", 0, 3);
        league.updateResult("Kudus Sukun Badak", "Surabaya Bhayangkara Samator", 1, 3);

        // Memperbarui hasil pertandingan Pekan 2 (14-16 Januari)
        league.updateResult("Surabaya Bhayangkara Samator", "Jakarta BNI 46", 2, 3);
        league.updateResult("Palembang Bank Sumsel Babel", "Jakarta Pertamina Pertamax", 1, 3);
        league.updateResult("Bogor LaVani", "Jakarta Pertamina Pertamax", 1, 3);

        // Memperbarui hasil pertandingan Pekan 3 (21-23 Januari)
        league.updateResult("Kudus Sukun Badak", "Jakarta Pertamina Pertamax", 3, 0);
        league.updateResult("Surabaya Bhayangkara Samator", "Bogor LaVani", 3, 2);

        // Menampilkan klasemen
        league.displayStandings();

        // Menghitung dan menampilkan penghargaan
        league.setAwards();
        league.displayAwards();
    }
}