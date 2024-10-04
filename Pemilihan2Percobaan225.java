import java.util.Scanner;

public class Pemilihan2Percobaan225 {
    public static void main(String[] args) {
        Scanner inputAbsen = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Roti");
        System.out.println("4. Paket bundling (Kopi + Teh + Roti)");
        System.out.println("------------------------------------");
        System.out.print("Masukan angka dari menu yang dipilih: ");
        int pemilihan_menu = inputAbsen.nextInt();
        inputAbsen.nextLine();  
        System.out.print("Apakah punya member (y/n) ? = ");
        String member = inputAbsen.nextLine();
        System.out.println("-----------------------------------");

        double harga = 0.0;
        double diskon = 0.0;
        double totalBayar = 0.0;
        
        if (pemilihan_menu == 1) {
            harga = 10000;
            System.out.println("Anda memilih: Kopi. Harga = Rp " + harga);
        } else if (pemilihan_menu == 2) {
            harga = 5000;
            System.out.println("Anda memilih: Teh. Harga = Rp " + harga);
        } else if (pemilihan_menu == 3) {
            harga = 7000; 
            System.out.println("Anda memilih: Roti. Harga = Rp " + harga);
        } else if (pemilihan_menu == 4) {
            harga = 20000; 
            System.out.println("Anda memilih: Paket bundling (Kopi + Teh + Roti). Harga = Rp " + harga);
        } else {
            System.out.println("Masukkan pilihan menu dengan benar.");
            return;
        }
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10 * harga;
            System.out.println("Anda adalah member. Besar diskon 10%.");
        } else if (!member.equalsIgnoreCase("n")) {
            System.out.println("Input member tidak valid.");
            return;
        }
        totalBayar = harga - diskon;
        System.out.println("Total bayar setelah diskon: Rp " + totalBayar);
        System.out.println("----------------------------------");
    }
}
