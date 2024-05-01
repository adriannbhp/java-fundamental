public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        /* Tipe Data Bukan Primitif
           - Tipe data primitif adalah tipe data bawaan didalam bahasa pemrograman.
             Tipe data primitif tidak bisa diubah lagi
           - Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif
             selalu memiliki default value
           - Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki
             default value, dan bisa bernilai null
           - Tipe data bukan primitif bisa memiliki method/function (yang akan dibahas nanti)
           - Di Java, semua tipe data primitif memiliki represntasi tipe data bukan primitif nya
        */

        /* Representasi Tipe Data Primitif
           Tipe Data Primitif       Tipe Data Bukan Primitif
           - byte                   = Byte
           - short                  = Short
           - int                    = Integer
           - long                   = Long
           - float                  = Float
           - double                 = Double
           - char                   = Character
           - boolean                = Boolean

           Default Value
           - Tipe Data Primitif = 0
           - Tipe Data Bukan Primitif = null
        */

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);


        // Konversi dari tipe data primitif ke bukan primitif
        int iniInt = 100;

        Integer iniObject = iniInt;

        System.out.println(iniObject); // Output : 100

        // Konversi beda tipe data
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        System.out.println(iniShort); // Output : 100
        System.out.println(iniLong2); // Output : 100
        System.out.println(iniFloat); // Output : 100.0

        Long amount = 1000000L;

        System.out.println(amount); // Output : 1000000

    }
}
