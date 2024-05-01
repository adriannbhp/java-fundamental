public class MethodOverloading {
    /* Method Overloading
       - Method overloading adalah kemampuan membuat method dengan nama yang
         sama lebih dari sekali.
       - Namun ada ketentuannya, yaitu data parameter di method tsb harus
         berbeda-beda, entah jumlah atau tipe data parameternya
       - Jika da yang sama, maka program Java kita akan error
    */
    public static void main(String[] args) {

    sayHello();
    sayHello("Adrian");
    sayHello("Adrian", "Bimo H.P");

    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
