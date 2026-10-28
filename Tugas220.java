import java.util.Scanner;

public class Tugas220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Masukkan nilai n (min 3) = ");
            n = sc.nextInt();
            if (n < 3) {
                System.out.println("Masukkan n lagi");
            }
        } while (n < 3);

        int totalNilai = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
                totalNilai += i * j;
            }
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka: " + totalNilai);
        sc.close();
    }
}
