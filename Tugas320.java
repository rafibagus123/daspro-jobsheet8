import java.util.Scanner;

public class Tugas320 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;
        System.out.println("==============================");

        do {
            System.out.print("\nMasukkan jumlah toko : ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Toko tidak valid (minimal 1), Masukkan jumlah toko lagi.");
            }

        } while (jumlahToko < 1);

        int tokoBerapa = 1;
        int totalBarangSeluruh = 0;
        int tokoBarangTerbanyak = -1;
        int barangTerbanyak = 0;

        while (tokoBerapa <= jumlahToko) {
            int totalBarangToko = 0;
            int jumlahPelanggan;
            do {
                System.out.print("\nMasukkan jumlah pelanggan toko ke " + tokoBerapa + ": ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Pelanggan tidak valid, masukkan jumlah pelanggan lagi: ");
                }
            } while (jumlahPelanggan < 0);

            int barang;

            for (int i = 1; i <= jumlahPelanggan; i++) {

                do {

                    System.out.print("Masukkan barang pelanggan ke " + i + ": ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("Barang tidak valid, masukkan jumlah barang lagi: ");

                    }

                } while (barang < 0);
                totalBarangToko += barang;
                totalBarangSeluruh += barang;
            }
            Thread.sleep(500);
            
            System.out.println("\nTotal barang: " + totalBarangToko);
            if (tokoBarangTerbanyak == -1 || totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoBarangTerbanyak = tokoBerapa;
            }
            tokoBerapa++;
            
        }
        Thread.sleep(1000);

        System.out.println("\n==============================");
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruh);
        System.out.println("Toko dengan barang terbanyak : " + tokoBarangTerbanyak);
        sc.close();
    }
}
