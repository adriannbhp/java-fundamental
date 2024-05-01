public class SwitchStatement {
    public static void main(String[] args) {
        /* Switch Statement
       - Kadang kita hanya menggunakan kondisi sederhana di if statement,
         seperti hanya menggunakan perbandingan ==
       - Swich adalah statement percabangan yang sama dengan if, namun lebih
         sederhana cara pembuatannya
       - Kondisi di switch statement hanya untuk perbandingan ==
        */

        /* Kode program dibawah ini adalah contoh penggunaan struktur kontrol switch dalam bahasa pemrograman
        Java. Struktur kontrol switch digunakan untuk membuat keputusan berdasarkan nilai variabel tertentu.
        Dalam kasus ini, nilai variabel yang dinilai adalah string "A". Kode program ini juga memperlihatkan
        beberapa peningkatan sintaksis yang diperkenalkan dalam versi Java terbaru (Java 12+).
        Berikut adalah penjelasan rinci tentang kode program tersebut:
        */

        var nilai = "A";

        /* Penggunaan switch Tanpa Penggunaan Arrow (Sebelum Java 12): */
        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin Anda salah jurusan");
        }

        /* Dalam blok ini, nilai variabel nilai dievaluasi. Jika nilainya adalah "A", program mencetak
        "Wow, Anda Lulus Dengan Baik". Jika nilainya adalah "B" atau "C", program mencetak "Nilai Anda
        Cukup Baik". Jika nilainya adalah "D", program mencetak "Anda tidak lulus". Jika nilainya tidak
        cocok dengan kasus mana pun, program mencetak "Mungkin Anda salah jurusan". */

        /* Switch Lambda menggunakan Arrow (->) (Java 12+):
           - Di Java versi 12+, diperkenalkan switch expression dengan lambda
           - Ini lebih mempermudah saat penggunaan switch expression karena kita
             tidak perlu lagi menggunakan kata kunci break
        */
        switch (nilai) {
            case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Muungkin Anda Salah Jurusan");
            }
        }
        /* Dalam blok ini, struktur switch menggunakan syntax arrow (->) untuk menggantikan kata kunci
        case dan break. Ini memungkinkan penulisan yang lebih ringkas dan bersih. */

        /* Switch Lambda Tanpa yield */
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Muungkin Anda Salah Jurusan";
            }
        }
        /* Dalam blok ini, struktur switch menggunakan syntax arrow (->) untuk menggantikan kata kunci case
         dan break. Ini memungkinkan penulisan yang lebih ringkas dan bersih. */

        System.out.println(ucapan);

        /* Penggunaan yield (Java 13+):
           - Di Java 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata kunci yield untu
             mengembalikan nilai pada switch statement
           - Ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement
        */
        String ucapann;
        ucapann = switch (nilai) {
            case "A":
                yield "Wow, Anda Lulus Dengan Baik";
            case "B", "C":
                yield "Nilai Anda Cukup Baik";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Muungkin Anda Salah Jurusan";
        };

        /* Dalam blok ini, switch menghasilkan nilai berdasarkan kasus yang sesuai. Penggunaan yield d
        igunakan untuk mengembalikan nilai dari blok switch. Dalam kasus ini, variabel ucapan akan diisi
        dengan nilai yang dihasilkan oleh switch. */

        System.out.println(ucapann);
    }
}
