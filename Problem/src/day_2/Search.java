package day_2;
import java.util.Scanner;

// Linear Search (Doğrusal Arama) sınıfı
class LinearSearch {
    // Bu fonksiyon, arr[] içindeki x elemanının indeksini döndürür
    static int search(int arr[], int n, int x) {
        int steps = 0; // Adım sayısını takip etmek için değişken
        for (int i = 0; i < n; i++) {
            steps++; // Her döngü adımında adım sayısını artır
            if (arr[i] == x)
                // Elemanı bulduğumuzda, adım sayısını da döndür
                return i;
        }
        // Eleman bulunamazsa, -1 döndür
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizi boyutunu ve elemanlarını al
        System.out.print("Dizi boyutunu girin: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Kullanıcıdan aramak istediği sayıyı al
        System.out.print("Aramak istediğiniz sayıyı girin: ");
        int x = scanner.nextInt();

        // Arama işlemini yap ve sonuçları al
        int index = search(arr, n, x);
        if (index == -1)
            System.out.println("Eleman dizide bulunamadı.");
        else
            System.out.println("Eleman " + index + " indeksinde bulundu.");

        scanner.close();
    }
}

// Binary Search (İkili Arama) sınıfı
class BinarySearch {
    // İkili arama algoritması: arr[l..r] aralığında x'i arar
    int binarySearch(int arr[], int l, int r, int x) {
        int steps = 0; // Adım sayısını takip etmek için değişken
        while (l <= r) {
            steps++;
            int mid = l + (r - l) / 2;

            // Eğer x, orta elemanda ise
            if (arr[mid] == x)
                return mid;

            // Eğer x, orta elemandan küçükse, sol alt diziye bak
            if (arr[mid] > x)
                r = mid - 1;
                // Aksi halde, sağ alt diziye bak
            else
                l = mid + 1;
        }
        // Eleman bulunamazsa, -1 döndür
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sıralı dizi ve aramak istediği elemanı al
        System.out.print("Dizi boyutunu girin: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Sıralı dizi elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Aramak istediğiniz sayıyı girin: ");
        int x = scanner.nextInt();

        BinarySearch ob = new BinarySearch();
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Eleman dizide bulunamadı.");
        else
            System.out.println("Eleman " + result + " indeksinde bulundu.");

        scanner.close();
    }
}
