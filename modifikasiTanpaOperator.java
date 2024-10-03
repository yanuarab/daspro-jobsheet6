import java.util.Scanner;

public class modifikasiTanpaOperator {
    
    public static void main(String[] args) {
        Scanner inputAbsen = new Scanner(System.in);
        System.out.println("Masukan tahun: ");
        int tahun = inputAbsen.nextInt();

        if ((tahun % 400) == 0) {
            System.out.println("adalah tahun kabisat. ");
        } else {
           if ((tahun % 100) == 0){
             System.out.println("bukan tahun kabisat. ");
        } else {
            if ((tahun % 4) == 0) {
                System.out.println("adalah tahun kabisat. ");
           }
        }
    }
        inputAbsen.close();
    }
}

