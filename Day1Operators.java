
class Day1Operators {

    public static void main(String[] args) {

        // JAVA OPERATORS
        // Operators are symbols used to perform operations
        // on variables and values.
        
        // 1. ARITHMETIC OPERATORS
        // Arithmetic operators are used to perform
        // mathematical calculations.
        //
        // +  Addition
        // -  Subtraction
        // *  Multiplication
        // /  Division
        // %  Modulus / Remainder
        int a = 20;
        int b = 10;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // 2. ASSIGNMENT OPERATORS
        // Assignment operators are used to assign
        // or update values in variables.
        //
        // =   Assignment
        // +=  Add and assign
        // -=  Subtract and assign
        // *=  Multiply and assign
        // /=  Divide and assign
        // %=  Modulus and assign
        int x = 10;
        System.out.println("Initial Value: " + x);

        x += 5;
        System.out.println("After += : " + x);

        x -= 2;
        System.out.println("After -= : " + x);

        x *= 2;
        System.out.println("After *= : " + x);

        x /= 2;
        System.out.println("After /= : " + x);

        x %= 3;
        System.out.println("After %= : " + x);

        // 3. RELATIONAL OPERATORS
        // Relational operators are used to compare
        // two values.
        //
        // Result will be true or false.
        //
        // ==  Equal to
        // !=  Not equal to
        // >   Greater than
        // <   Less than
        // >=  Greater than or equal to
        // <=  Less than or equal to
        int num1 = 20;
        int num2 = 10;

        System.out.println("Equal: " + (num1 == num2));
        System.out.println("Not Equal: " + (num1 != num2));
        System.out.println("Greater Than: " + (num1 > num2));
        System.out.println("Less Than: " + (num1 < num2));
        System.out.println("Greater Than or Equal: " + (num1 >= num2));
        System.out.println("Less Than or Equal: " + (num1 <= num2));

        // 4. LOGICAL OPERATORS
        // Logical operators are used to combine conditions.
        //
        // &&  Logical AND
        // ||  Logical OR
        // !   Logical NOT
        int age = 22;
        boolean Id = true;

        System.out.println("AND: " + (age >= 18 && Id));
        System.out.println("OR: " + (age >= 18 || Id));
        System.out.println("NOT: " + (!Id));

        // 5. UNARY OPERATORS
        // Unary operators work with only one operand.
        //
        // ++  Increment
        // --  Decrement
        // +   Positive
        // -   Negative
        // !   Logical NOT
        //
        // Pre-Increment  → ++value
        // Post-Increment → value++
        // Pre-Decrement  → --value
        // Post-Decrement → value--
        int value = 10;

        // Original Value
        System.out.println("Value: " + value);

        // Pre-Increment
        // First increment the value, then use it.
        System.out.println("Pre-Increment: " + (++value));

        // Post-Increment
        // First use the value, then increment it.
        System.out.println("Post-Increment: " + (value++));

        // Pre-Decrement
        // First decrement the value, then use it.
        System.out.println("Pre-Decrement: " + (--value));

        // Post-Decrement
        // First use the value, then decrement it.
        System.out.println("Post-Decrement: " + (value--));

        

    }
}
