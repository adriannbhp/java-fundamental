public class MethodVariableArguments {
    /* Method Variable Argument
       - Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti
       - Biasanya, agar bisa seperti ini, kita akan menggunan Array sebagai parameter
         di method tersebut
       - Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data
         yang berisi jumlah tak tentu, bisa nol atau lebih
       - Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir
         parameter
    */
    public static void main(String[] args) {

     int[] values = {80, 50, 50,50, 80};
     sayCongrats("Adrian", values);

     sayCongrats("Naizar", 80, 89, 75, 80);
    }

    // Tanpa Variable Argument
//    static void sayCongrats(String name, int[] values) {
//        var total = 0;
//        for (var value : values){
//            total += value;
//        }
//        var finalValue = total / values.length;
//
//        if (finalValue > 70) {
//            System.out.println("Selamat " + name + ", Anda Lulus");
//        } else {
//            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
//        }
//    }

    // Dengan Variable Argument
    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue > 70) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
