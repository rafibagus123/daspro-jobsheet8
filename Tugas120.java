import java.util.Scanner;

public class Tugas120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int totalNilai = 0;

        for (int i = 1; i <= n; i++) {
            char h = '1';
            for (int j = 1; j <= i; j++) {
                System.out.print(h + " ");
                h++;
            }
            System.out.println();
            totalNilai += i;
        }
        System.out.println("Total angka tercetak: " + totalNilai);
    }
}
