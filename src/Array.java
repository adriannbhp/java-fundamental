public class Array {
    public static void main(String[] args) {

        /* Tipe Data Array
           - Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
           - Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat
        */

        /* 1. Pendefinisian Array:*/
        String[] stringArray;
        stringArray = new String[3]; // Baris ini mendefinisikan sebuah array stringArray yang dapat menyimpan 3 elemen bertipe String.

        /* 2. Inisialisasi Elemen Array:*/
        stringArray[0] = "Adrian";
        stringArray[1] = "Bimo";
        stringArray[2] = "Hernawan Pratama";
        /* Elemen-elemen array diisi dengan nilai "Adrian", "Bimo", dan "Hernawan Pratama". */

        /*3. Akses dan Modifikasi Elemen Array:*/
        System.out.println(stringArray[0]); // Output : Adrian
        System.out.println(stringArray[1]); // Output : Bimo
        System.out.println(stringArray[2]); // Output : Hernawan Pratama

        stringArray[0] = "Naizar";

        System.out.println(stringArray[0]); // Output : Naizar
        /* Elemen-elemen array diakses dan dicetak menggunakan pernyataan System.out.println(). Nilai elemen
          pertama diubah menjadi "Budi" dan kemudian dicetak lagi.
        */

        String[] stringArray2 = new String[3];

        /* 4. Inisialisasi Array Bersamaan dengan Pendefinisian:
        */
        String[] namaNama = {
                "Adrian", "Bimo", "Hernawan Pratama"
        };
        /* Array namaNama dibuat dan diisi dengan nilai "Adrian", "Bimo", dan "Hernawan Pratama" sekaligus pada saat
           pendefinisian.
        */
        namaNama[0] = null; // Array namaNama bukan tipe data primitif sehingga bisa dibuat null
        System.out.println(namaNama[0]); // Output : null

        // Array Initializer
        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        System.out.println(arrayInt[1]); // Output : 2

        /* Operasi di Array
           - array[index]           = Mengambil data di array
           - array[index] = value   = Mengubah data di array
           - array.lenght           = Mengambil panjang array
        */

        long[] arrayLong = {
                10L, 20L, 30L
        };

        // Mengubah data array index ke 0
        arrayLong[0] = 15;

        System.out.println(arrayLong[0]); // Output : 15
        System.out.println(arrayLong.length); // Output : 3

        // Array di dalam Array (Nested Array)
        String[][] members = {
                {"Adrian Bimo", "Hernawan Pratama"},
                {"Naizar", "Putra Herlino"},
                {"Jack", "Miller"}
        };

        System.out.println(members[0]);
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
        System.out.println(members[2][0]);
    }
}
