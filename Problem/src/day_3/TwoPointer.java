package day_3;

// Bu kod, bir dizideki iki sayının toplamının hedef değere eşit olup olmadığını kontrol eden bir algoritmayı içermektedir.
// İki pointer (işaretçi) kullanarak diziyi tarar ve istenilen toplamı bulup bulmadığını kontrol eder.

import java.util.Scanner;

public class TwoPointer {
    public int pointerA;
    public int pointerB;

    // İki sayının toplamının hedef değere eşit olup olmadığını kontrol eden metot
    public boolean twoSum(int[] list, int targetValue) {
        int pointerA = 0; // İlk pointer dizinin başında
        int pointerB = list.length - 1; // İkinci pointer dizinin sonunda

        // Pointerlar çakışmadığı sürece devam eder
        while (pointerA < pointerB) {
            int sum = list[pointerA] + list[pointerB]; // İki pointer'ın gösterdiği elemanların toplamı

            if (sum == targetValue) {
                return true; // Toplam hedef değere eşit ise true döner
            } else if (sum < targetValue) {
                pointerA++; // Toplam hedef değerden küçükse pointerA'yı bir artır
            } else {
                pointerB--; // Toplam hedef değerden büyükse pointerB'yi bir azalt
            }
        }
        return false; // Eğer hiçbir zaman toplam hedef değere eşit olmazsa false döner
    }

    public static void main(String[] args) {
        TwoPointer number = new TwoPointer();
        Scanner sc = new Scanner(System.in);

        // Kullanıcıdan dizi uzunluğunu al
        System.out.println("Dizi uzunluğunu girin:");
        int n = sc.nextInt();

        // Kullanıcıdan dizi elemanlarını al
        int[] list = new int[n];
        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        // Kullanıcıdan hedef değeri al
        System.out.println("Hedef değeri girin:");
        int targetValue = sc.nextInt();

        // Test sonucunu ekrana yazdır
        System.out.println("Hedef Değer " + targetValue + ": " + number.twoSum(list, targetValue)); // Sonucu yazdır
    }
}
