import java.util.Scanner;
public class Pemilihan2Percobaan3_25 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan Kategori : ");
        kategori = input25.nextLine();
        System.out.print("Masukkan Besarnya penghasilan : " );
        penghasilan = input25.nextInt();

        if (kategori.equalsIgnoreCase("Pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else 
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));   
            System.out.println("penghasilan Bersih: " + gajiBersih);

         } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 250000)
                pajak = 0.15;
            else if (penghasilan <= 3500000 )
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("penghasilan bersih: " + gajiBersih);
            }
        else 
            System.out.println("Masukkan kategori salah:");
            input25.close();
        }
    }