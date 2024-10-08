import java.util.Scanner;

public class pemilihan2Percobaan225 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);

        String menu, member;
        double harga = 0, total_bayar, diskon = 0;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("Kopi");
        System.out.println("Teh");
        System.out.println("Roti");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan menu yang dipilih = ");
        menu = input25.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input25.nextLine();
        System.out.println("-------------------------------------");

        if (menu.equalsIgnoreCase("Kopi")) {
            harga = 12000;
            System.out.println("Harga Kopi = Rp " + harga);
        } else if (menu.equalsIgnoreCase("Teh")) {
            harga = 7000;
            System.out.println("Harga Teh = Rp " + harga);
        } else if (menu.equalsIgnoreCase("Roti")) {
            harga = 20000;
            System.out.println("Harga Roti = Rp " + harga);
        } else {
            System.out.println("Masukkan pilihan menu dengan benar.");
            return;
        }

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10; 
            System.out.println("Anda adalah member. Besar diskon 10%.");
        } else if (!member.equalsIgnoreCase("n")) {
            System.out.println("Input member tidak valid.");
            return;
        }

        total_bayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon = Rp " + total_bayar);

        System.out.println("Total bayar akhir = Rp " + total_bayar);
        System.out.println("-------------------------------------");
    }
}
