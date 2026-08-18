public class Day7ExceptionHandling {

    public static void main(String[] args) {

        // 1. ArithmeticException
        try {
            int a = 10;
            int b = 0;

            int answer = a / b;

            System.out.println(answer);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero");
        }
        finally {
            System.out.println("Arithmetic Program Completed");
        }


        // 2. ArrayIndexOutOfBoundsException
        int[] marks = {80, 90, 100, 100, 100};

        try {
            System.out.println(marks[0]);
            System.out.println(marks[1]);
            System.out.println(marks[2]);
            System.out.println(marks[3]);
            System.out.println(marks[4]);
            System.out.println(marks[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array Index");
        }


        // 3. NullPointerException
        try {
            String name = getName();

            System.out.println(name.length());
        }
        catch (NullPointerException e) {
            System.out.println("String is NULL Value");
        }


        // 4. NumberFormatException
        try {
            String check = "ABC";

            int number = Integer.parseInt(check);

            System.out.println(number);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid Number");
        }


        // 5. StringIndexOutOfBoundsException
        try {
            String name = "Java";

            System.out.println(name.charAt(10));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid String Index");
        }


        System.out.println("Program Completed");
    }


    // Method returns null
    public static String getName() {
        return null;
    }
}