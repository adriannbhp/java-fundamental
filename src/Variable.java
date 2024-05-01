public class Variable {

    public static void main(String[] args) {

        /* Variable
           - Variable adalah tempat untuk menyimpan data
           - Java adalah bahasa static type, sehingga sebuah variable hanya bisa
             digunakan untuk menyimpan tipe data yang sama, tidak bisa berubah-ubah
             tipe data seperti di bahasa pemrograman PHP atau JavaScript
           - Untuk membuat variable di Java kita bisa menggunakan nama tipe data lalu
             diikuti dengan nama variable nya
           - Nama variable tidak boleh mengandung whitespace(spasi, enter, tab) dan
             tidak boleh seluruhnya number
        */

        int x; //declaration

        x = 123; //assignment

        int y = 234; //initialization

        System.out.println(x + y);

        // Contoh
        String name;
        name = "Adrian Bimo Hernawan Pratama";

        System.out.println(name);

        int age = 21;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Naizar Putra Herlino";
        System.out.println(name);

        /* Kata Kunci Var
           - Sejak versi Java 10, Java mendukung pembuatan variabel dengan kata kunci var
             sehingga kita tidak perlu menyebutkan tipe datanya
           - Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat variable
             kita harus menginisiasi value / nilai dari variable tersebut secara langsung
        */

        // var name; // Error : Karena kata kunci var harus dengan value tidak boleh kosong

        var firstName = "Adrian";
        var middleName = "Bimo";
        var lastName = "Hernawan Pratama";

        firstName = "Adriannz";

        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);

        var umurMahasiswa = 21;
        System.out.println(umurMahasiswa);

        /* Kata Kunci Final
           - Secara default, variable di Java bisa diubah-ubah nilainya
           - Jika kiat ingin membuat sebuah variable yang datanya tidak boleh
             diubah setelah pertama kali dibuat, kita bisa menggunakan kata kunci final
           - Istilah variabel seperti ini, banyak juga yang menyebutnya const/konstan
        */

        final String namaLengkap = "Naizar Putra Herlino";
        var umur = 13;
        var alamat = "Indonesia";

//        namaLengkap = "Siapawe"; // Error : Cannot assign a value to final variable 'namaLengkap'

        System.out.println(namaLengkap);
        System.out.println(umur);
        System.out.println(alamat);
    }
}
