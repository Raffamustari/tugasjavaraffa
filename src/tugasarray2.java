import java.util.Scanner;
public class tugasarray2{




    public static void main(String[] args) {
     
        String[][] daftarBuah = {
                {"buah apel", "35000"},
                {"buah jeruk", "50000"},
                {"buah mangga", "25000"},
                {"buah duku", "15000"},
                {"buah semangka", "20000"}
        };

        Scanner input = new Scanner(System.in);

      
        while (true) {
          
            System.out.println("Menu:");
            System.out.println("1. Beli Buah");
            System.out.println("2. Lihat Struk");
            System.out.println("3. Keluar");
            System.out.print("Apa yang akan kamu lakukan: ");

         
            int pilihan = input.nextInt();

            if (pilihan == 1) {
              
                System.out.println("Daftar Buah:");
                for (int i = 0; i < daftarBuah.length; i++) {
                    System.out.println((i + 1) + ". " + daftarBuah[i][0] + " (Rp" + daftarBuah[i][1] + ")");
                }

                System.out.print("Pilih buah (nomor): ");
                int nomorBuah = input.nextInt() - 1; 
                System.out.print("Jumlah: ");
                int jumlah = input.nextInt();

                
                System.out.println("Anda telah memilih " + jumlah + " " + daftarBuah[nomorBuah][0]);
            } else if (pilihan == 2) {
             
                System.out.println("Struk Belanja (sementara):");
              
            } else if (pilihan == 3) {
             
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
            
        }
    }
}

    


