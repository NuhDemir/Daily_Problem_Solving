package day_1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tam sayı girin: "); // Kullanıcıdan bir tam sayı girmesini ister.
        int sayi = scanner.nextInt();

        // Negatif sayı kontrolü
        if (sayi < 0) {
            System.out.println("Sayı pozitif bir tam sayı olmalıdır.");
        }
        // 0 veya 1 için faktöriyel 1'dir.
        else if (sayi == 0 || sayi == 1) {
            System.out.println(sayi + " sayısının faktöriyeli 1'dir.");
        }
        // Pozitif sayıların faktöriyelini hesapla ve ekrana yazdır.
        else {
            long faktoriyel = faktoriyelHesapla(sayi);

            // Faktoriyel değeri kontrolü
            if (faktoriyel <= 0)
                System.out.println(sayi + " sayısının faktöriyeli sınırları aşıyor.");
            else
                System.out.println(sayi + " sayısının faktöriyeli " + faktoriyel + " dir.");
        }
    }

    // Faktöriyel hesaplama metodu
    public static long faktoriyelHesapla(int n) {
        long faktoriyel = 1;

        // Faktöriyel hesaplama döngüsü
        for (int i = 1; i <= n; i++)
            faktoriyel *= i;

        return faktoriyel;
    }
}
