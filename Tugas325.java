import java.util.Scanner;

public class Tugas325 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
        
        int totalSeluruhBarang = 0;
        int tokoTerbanyak = 0;
        int maxBarangToko = -1;
        
        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("Toko " + i);
            System.out.print("Masukkan jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();
            
            int totalBarangToko = 0;
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("Jumlah barang pelanggan " + j + ": ");
                int barang = sc.nextInt();
                if (barang > 0) {
                    totalBarangToko += barang;
                }
            }
            
            System.out.println("pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);
            totalSeluruhBarang += totalBarangToko;
            
            if (totalBarangToko > maxBarangToko) {
                maxBarangToko = totalBarangToko;
                tokoTerbanyak = i;
            }
        }
        System.out.println("Total barang seluruh toko: " + totalSeluruhBarang);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}