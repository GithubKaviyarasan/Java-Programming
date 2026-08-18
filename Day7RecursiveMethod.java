public class Day7RecursiveMethod {

    // Recursive method
    public static int sum(int n) {

        if (n > 0) {
            return n + sum(n - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        // Method calling
        System.out.println("Sum = " + sum(10));

        /*
        Working:

        sum(10)
        = 10 + sum(9)
        = 10 + 9 + sum(8)
        = 10 + 9 + 8 + sum(7)
        = 10 + 9 + 8 + 7 + sum(6)
        = 10 + 9 + 8 + 7 + 6 + sum(5)
        = 10 + 9 + 8 + 7 + 6 + 5 + sum(4)
        = 10 + 9 + 8 + 7 + 6 + 5 + 4 + sum(3)
        = 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + sum(2)
        = 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + sum(1)
        = 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)

        sum(0) = 0

        Therefore:
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
        = 55
        */
    }
}