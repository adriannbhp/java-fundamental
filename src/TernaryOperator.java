public class TernaryOperator {
    public static void main(String[] args) {
        /* Ternary Operator
           - Ternary Operator adalah operator sederhana dari if statement
           - Ternary operator terdiri dari kondisi yang dievaluasi, jika menghasilkan true
             maka nilai pertama diambil, jika false, maka nilai kedua diambil
        */

        // Tanpa Ternary Operator
        var nilai = 75;
        var absen = 74;
//        String ucapan;
//
//        if (nilai >= 75 && absen >= 75) {
//            ucapan = "Selamat Anda Lulus";
//        } else {
//            ucapan = "Anda Tidak Lulus";
//        }
//
//        System.out.println(ucapan);

        //  Menggunakan Ternary Operator
        String ucapan = nilai >= 75 && absen >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";

        System.out.println(ucapan);
    }
}