public class Continue {
    public static void main(String[] args) {

        // Memulai loop untuk mengiterasi dari 1 hingga 100
        for (int counter = 1; counter <= 100; counter++) {
            /* Di sini, % adalah operator modulus yang mengembalikan sisa dari pembagian dua bilangan.
              Jadi, jika counter % 2 sama dengan 0, itu berarti counter adalah bilangan genap, karena
              bilangan genap habis dibagi dua tanpa sisa. */
            if(counter % 2 == 0){
                /* Jika kondisi tersebut terpenuhi (nilai counter adalah bilangan genap), maka pernyataan
                   continue akan dieksekusi. Pernyataan continue menginstruksikan program untuk melanjutkan
                   ke iterasi berikutnya dalam loop tanpa menjalankan bagian kode di bawahnya dalam blok perulangan.
                   Dengan kata lain, ketika nilai counter adalah bilangan genap, baris-baris kode setelah pernyataan
                   continue dalam blok perulangan tidak akan dieksekusi, dan loop akan melanjutkan ke iterasi berikutnya.*/
                continue;
            }

            /* - seleksi kondisi if (counter % 2 == 1) digunakan untuk memeriksa apakah nilai dari variabel counter adalah bilangan ganjil.
               - Di sini, % adalah operator modulus yang mengembalikan sisa dari pembagian dua bilangan. Jadi, jika counter % 2 sama dengan 0,
                 itu berarti counter adalah bilangan genap, karena bilangan genap habis dibagi dua tanpa sisa. */
//            if(counter % 2 == 1){
//                /* Jika kondisi tersebut terpenuhi (nilai counter adalah bilangan genap), maka pernyataan
//                   continue akan dieksekusi. Pernyataan continue menginstruksikan program untuk melanjutkan
//                   ke iterasi berikutnya dalam loop tanpa menjalankan bagian kode di bawahnya dalam blok perulangan.
//                   Dengan kata lain, ketika nilai counter adalah bilangan genap, baris-baris kode setelah pernyataan
//                   continue dalam blok perulangan tidak akan dieksekusi, dan loop akan melanjutkan ke iterasi berikutnya.*/
//                continue;
//            }
            System.out.println("Perulangan ke-" + counter);
        }
    }
}
