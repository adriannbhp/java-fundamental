public class MethodReturnValue {
    /* Method Return Value
       - Secara default, method itu tidak menghasilkan value apapun, namun jika kita ingin,
         kita bisa membuat sebuah method mengembalikan nilai
       - Agar method bisa menghasilkan value, kita harus mengubah kata kunci void dengan tipe data
         yang dihasilkan
       - Dan di dalam block method, untuk menghasilkan nilai tsb, kita harus menggunakan kata kunci
         return, lalu diikuti dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan
         di method
       - Di Java, kita hanya bisa menghasilkan 1 data di sebuah method, tidak bisa lebih dari satu
    */
    public static void main(String[] args) {

        System.out.println("METHOD sum");
        // Method sum
        var result1 = sum(100, 100); // Memanggil method sum dengan parameter
        System.out.println(result1); // Mencetak hasil dari method sum

        System.out.println(sum(200, 200)); // Memanggil method sum dan mencetak hasil dari method sum

        System.out.println("METHOD hitung");
        // Method hitung
        System.out.println(hitung(200, "+", + 200));
        System.out.println(hitung(100, "-", 50));

        System.out.println("METHOD hitungValue");

        // Method hitungValue
        System.out.println(hitungValue(200, "+", + 200));
        System.out.println(hitungValue(100, "-", 50));
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }

    static int hitungValue(int value1, String operasi, int value2) {
        if (operasi.equals("+")) {
            return value1 + value2;
        } else if (operasi.equals("-")) {
            return value1 - value2;
        } else {
            return 0;
        }
    }
}