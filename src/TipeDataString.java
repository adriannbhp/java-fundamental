public class TipeDataString {
    public static void main(String[] args) {
        /* Tipe Data String
           - Tipe data String adalah tipe data yang berisikan data kumpulan karakter
             atau sederhananya adalah teks
           - Di Java, tipe data String direpresentasikan dengan kata kunci String
           - Untuk membuat String di Java, kita menggunakan karakter "(petik dua) sebelum dan
             sesudah teks nya
           - Default value untuk String adalah null
        */

        String firstName = "Adrian Bimo";
        String lastName = "Hernawan Pratama";

        String fullName = firstName + " " + lastName;

        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println(fullName);
    }
}
