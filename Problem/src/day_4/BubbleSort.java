package day_4;

/*
Bubble Sort Algoritması

Açıklama:
Bubble Sort, en basit sıralama algoritmalarından biridir. Bu algoritma,
diziyi tekrar tekrar üzerinden geçerek yan yana olan elemanları karşılaştırır
ve gerektiğinde yer değiştirir. Bu işlem, dizi sıralı hale gelene kadar devam eder.

Adım Adım İşleyiş:
1. Dizinin başından sonuna kadar ilerleyerek her bir elemanı bir sonrakisi ile karşılaştırır.
2. Eğer bir eleman bir sonrakinden büyükse, bu iki elemanın yerlerini değiştirir.
3. Bu işlemi dizi tamamen sıralanana kadar (hiçbir yer değiştirme yapılmayana kadar) tekrarlar.

Faydaları:
- Basit ve anlaşılır bir algoritmadır.
- Küçük veri kümeleri için uygundur.
- Diğer daha karmaşık algoritmaların temelini anlamak için kullanışlıdır.

Yararı:
- Eğitim ve öğretim amacıyla, algoritma mantığını anlamak için kullanılır.
- Kod yazımı ve mantık yürütme açısından başlangıç seviyesindekiler için idealdir.

Kullanım Alanları:
- Daha karmaşık sıralama algoritmalarının temellerini anlamak için eğitimde kullanılır.
- Küçük veri kümeleri veya neredeyse sıralı diziler için pratik bir çözümdür.

Çalışma Süresi:
- En kötü durumda (dizi tamamen ters sıralı ise) O(n^2) zaman karmaşıklığına sahiptir.
- Ortalama durumda O(n^2) zaman karmaşıklığına sahiptir.
- En iyi durumda (dizi zaten sıralı ise) O(n) zaman karmaşıklığına sahiptir.

Çalışma Mekanizması:
- Bubble Sort, sıralama işlemi sırasında bir bayrak kullanarak dizinin sıralı olup olmadığını takip eder.
- Eğer bir tur boyunca hiç yer değiştirme yapılmazsa, dizi sıralı kabul edilir ve algoritma sona erer.
- Bu nedenle, Bubble Sort'un en iyi durumdaki performansı oldukça iyidir, çünkü bir turda sıralı olduğu tespit edilebilir.
*/


// BubbleSort sınıfı, InplaceSort arayüzünü uygular ve inplace sıralama sağlar.
public class BubbleSort implements InplaceSort {

    @Override
    public void sort(int[] values) {
        // sort metodu, dizi elemanlarını bubble sort algoritması kullanarak sıralar.
        BubbleSort.bubbleSort(values);
    }

    // bubbleSort metodu, verilen diziyi bubble sort algoritması kullanarak sıralar.
    private static void bubbleSort(int[] arr) {
        if (arr == null) {
            // Eğer dizi null ise, hiçbir işlem yapılmaz.
            return;
        }

        boolean sorted; // Dizinin sıralı olup olmadığını takip etmek için bir bayrak.

        do {
            sorted = true; // Başlangıçta dizinin sıralı olduğunu varsayıyoruz.
            for (int i = 1; i < arr.length; i++) {
                // Dizinin her bir elemanını, bir önceki eleman ile karşılaştır.
                if (arr[i] < arr[i - 1]) {
                    // Eğer mevcut eleman, bir önceki elemandan küçükse, yer değiştir.
                    swap(arr, i - 1, i);
                    sorted = false; // Yer değiştirme yapıldığı için dizi sıralı değil.
                }
            }
        } while (!sorted); // Tüm dizi sıralı olana kadar döngü devam eder.
    }

    // swap metodu, verilen iki indeksin değerlerini yer değiştirir.
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i]; // İlk elemanı geçici bir değişkende sakla.
        arr[i] = arr[j]; // İkinci elemanı, ilk elemanın yerine koy.
        arr[j] = temp; // Geçici değişkendeki ilk elemanı, ikinci elemanın yerine koy.
    }

    // Ana metot, programın başlangıç noktasıdır.
    public static void main(String[] args) {
        // Sıralanacak örnek bir dizi oluşturulur.
        int[] array = {10, 4, 6, 8, 13, 2, 3};
        // BubbleSort sınıfından bir nesne oluşturulur.
        BubbleSort sorter = new BubbleSort();
        // Oluşturulan dizi, bubble sort algoritması kullanılarak sıralanır.
        sorter.sort(array);
        // Sıralanmış dizi ekrana yazdırılır.
        System.out.println(java.util.Arrays.toString(array));
    }
}