package JOBSHEET7;
import java.util.Scanner;

public class Postfixmain20 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        System.out.println("Masukan ekspresi matematika (infix) : ");
        String Q = sc18.nextLine();
        Q = Q.trim();
        Q = Q + ") ";

        int total = Q.length();
        Postfix20 post = new Postfix20(total);
        String p = post.konversi(Q);
        System.out.println("Postfix: " + p);
    }
}
