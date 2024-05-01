public class ForLoop {
    public static void main(String[] args) {

        /* For Loop
           - For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan
           - Blok kode yg terdapat didalam for akan selalu diulangi selama kondisi for terpenuhi
        */

        /* Sintak Perulangan For
           for(init statement; kondisi; post statement){
            // block perulangan
           }

           - Init statement akan dieksekusi hanya sekali di awal sebelum perulangan
           - Kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan,
             jika false perulangan akan berhenti
           - Post statement akan dieksekusi setiap kali diakhir perulangan
           - Init statement, Kondisi dan Post Statement tidak wajib diisi, jika Kondisi tidak diisi, berarti
             kondisi selalu bernilai true
        */

        /* Perulangan Tanpa Henti menggunaan for
           - Jika tidak menggunakan init statement
           - Tidak menggunakan kondisi */

//        for (;;) {
//            System.out.println("Perulangan Tanpa Henti"); // Stuck/Deadlock
//        }

        // Perulangan Dengan Kondisi
//        var counter = 1;

//        for (; counter <= 10;) {
//            System.out.println("Perulangan ke-" + counter);
//            counter++;
//        }
//        System.out.println(counter); // Output : 11 karena sudah tidak memenuhi kondisi

        // Perulangan Dengan Kondisi;
        for (var counter = 1; counter <= 10;) {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }

        // For Dengan Post Statement
        for (var counter = 1; counter <= 10; counter++) {
            System.out.println("Perulangan ke-" + counter);
        }
    }
}
