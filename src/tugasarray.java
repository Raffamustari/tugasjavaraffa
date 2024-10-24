package minggu5;

import java.util.Scanner;

//tugas 1 
public class tugasarray {
    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);
        System.out.println("masukan jumlah data ;");
        int n = i.nextInt();

        String[] nama = new String[n];
        int[] nilai = new int [n];

        for (int o = 0; o < n; o++){
            System.out.println("mahasiswa ke " + (o+1));
            System.out.print("nama :");
            nama[o] = i.next();
            System.out.print("nilai :");
            nilai[o] = i.nextInt();

        }
        System.out.println("daftar nilai mahasiswa");
        System.out.println();

        int totalnilai = 0;
        

        for (int o = 0; 0<n ; o++){
            System.out.print(o + " " + nama [o] + " " + nilai [o] + " ");
            
            if (nilai[o] >= 60)   {

            System.out.println("lulus");
            
             }else {System.out.println("tidak lulus");

        }
        totalnilai += nilai[o];
    }
        i.close();

        double ratarata = (double) totalnilai / n;

        System.out.println("total nilai = " + totalnilai);
        System.out.println("rata rata = " + ratarata);
       
    }
}
    

