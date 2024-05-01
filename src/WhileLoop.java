public class WhileLoop {
    public static void main(String[] args) {
        /* While Loop
           - While loop adalah versi perulangan yang lebih sederhana dibanding for loop
           - Di While loop, hanya terdapat kondisi perulangan, tanpa ada init statement
             dan post statement
        */

        var counter = 1;

        while (counter <= 10) {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }
    }
}
