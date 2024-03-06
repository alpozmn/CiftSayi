import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı girin:");
        int sayi = scanner.nextInt();

        System.out.println(sayi + " sayısına kadar olan çift sayılar:");

        for (int i = 0; i <= sayi; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
