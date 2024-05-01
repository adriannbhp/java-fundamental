public class ForEach {
    public static void main(String[] args) {

        String[] names = {
                "Adrian", "Bimo", "Hernawan", "Pratama",
                "Naizar", "Putra", "Herlino"
        };

        System.out.println("Tanpa For Each");

        // Tanpa For Each
        for (var i = 0; i < names.length; i++) {
//            System.out.println(i); // Output : 1 2 3 4 5
            System.out.println(names[i]);
        }

        System.out.println("Menggunakan For Each");
        // Menggunakan For Each
        for (var name : names) {
            System.out.println(name);
        }
    }
}
