import java.util.Scanner;
public class Pemilihan2Percobaan125 {
public static void main(String[] args) {
    Scanner inputAbsen = new Scanner(System.in);
    System.out.println("Masukan tahun: ");
    int tahun = inputAbsen.nextInt();
    if ((tahun % 4) == 0) {
        if((tahun % 100) != 0);
        System.out.println("Tahun Kabisat. ");
    } else
    System.out.println("Bukan Tahun Kabisat");
    inputAbsen.close();
}
}