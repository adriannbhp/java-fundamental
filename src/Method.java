public class Method {
    /* Method
   - Method adalah block kode program yang akan berjalan saat kita panggil
   - Sebelumnya kita sudah menggunakan method println() untuk menampilkan
     tulisan di console
   - Untuk membuat method di Java, kita bisa menggunakan kata kunci void,
     lalu diikuti dengan nama method, kurung() dan diakhiri dengan block
   - Kita bisa memanggil method dengan menggunakan nama method lalu diikuti
     dengan kurung ()
   - Di bahasa pemrograman lain, Method juga disebut dengan Function
*/
    public static void main(String[] args) {
        // Memanggil Method
        sayHelloWorld();
    }

    // Mmebuat Method
    static void sayHelloWorld(){
        System.out.println("Hello World1");
        System.out.println("Hello World2");
        System.out.println("Hello World3");
    }
}
