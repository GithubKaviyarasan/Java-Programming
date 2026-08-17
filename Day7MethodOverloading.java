public class Day7MethodOverloading {

    // i. Without Arguments, Without Return Type
    static void display() {
        System.out.println("Hello Java Programming");
    }

    // ii. With Arguments, Without Return Type
    static void display(String fname, String lname, int pin) {
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("PIN: " + pin);
    }

    // iii. Without Arguments, With Return Type
    static int getNumber() {
        return 100;
    }

    // iv. With Arguments, With Return Type
    static int addNumbers(int a, int b) {
        return a + b;
    }

    // Vote Eligible - if...else
    static void voteEligible(int age) {

        if (age >= 18) {
            System.out.println("Eligible for Vote");
        } else {
            System.out.println("Not Eligible for Vote");
        }
    }

    // v. Method Overloading - int
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // vi. Method Overloading - double
    static double add(double a, double b, double c) {
        return a + b + c;
    }

    // vii. Method Overloading - int
    static int add(int a, int b) {
        return a + b;
    }

    // Method Overloading - double
    static double add(double a, double b) {
        return a + b;
    }

    // Method Overloading - String
    static String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {

        // i. Without Arguments, Without Return Type
        display();

        System.out.println();

        // ii. With Arguments, Without Return Type
        display("Kavi", "Kaviyarsan", 606207);

        System.out.println();

        // iii. Without Arguments, With Return Type
        int number = getNumber();
        System.out.println("Returned Number: " + number);

        System.out.println();

        // iv. With Arguments, With Return Type
        int result = addNumbers(10, 20);
        System.out.println("Addition: " + result);

        System.out.println();

        // Vote Eligible
        voteEligible(20);

        System.out.println();

        // v. Method Overloading - int with 3 arguments
        int intResult = add(10, 20, 30);
        System.out.println("Integer 3 Arguments: " + intResult);

        // vi. Method Overloading - double with 3 arguments
        double doubleResult = add(10.5, 20.5, 30.5);
        System.out.println("Double 3 Arguments: " + doubleResult);

        System.out.println();

        // vii. Method Overloading - int
        int intAdd = add(10, 20);
        System.out.println("Integer Addition: " + intAdd);

        // Method Overloading - double
        double doubleAdd = add(10.5, 20.5);
        System.out.println("Double Addition: " + doubleAdd);

        // Method Overloading - String
        String stringAdd = add("Java ", "Programming");
        System.out.println("String Addition: " + stringAdd);
    }
}