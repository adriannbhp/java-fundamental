public class DoWhileLoop {
    public static void main(String[] args) {

        /* Do While Loop
           - Do While Loop adalah perulangan yang mirip dengan while
           - Perbedaannya hanya pada pengecekan kondisi
           - Pengecekan kondisi di while loop dilakukan di awal sebelum
             perulangan dilakukan, sedangkan di do while loop dilakukan
             setelah perulangan dilakukan
           - Oleh karena itu dalam do while loop, minimal pasti sekali
             perulangan dilakukan walaupun kondisi tidak bernilai true
        */

        var counter = 200;

        do {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        } while ( counter <= 10);
    }
}
