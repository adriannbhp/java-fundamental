public class MethodParameter {

    /* Method Parameter
       - Kita bisa mengirim informasi ke method yang ingin kita panggil
       - Untuk melakukan hal tsb, kita perlu menambahkan parameter atau
         argument di method yg sudah kita buat
       - Cara membuat parameter sama seperti cara membuat variabel
       - Parameter ditempatkan di dalam kurung() di deklarasi method
       - Parameter bisa lebih dari satu, jika lebih dari satu, harus dipisah
         menggunakan tanda koma
    */
    public static void main(String[] args) {
        sayHello("Adrian Bimo", "Hernawan Pratama");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
