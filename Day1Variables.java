class Day1Variables {

    public static void main(String[] args) {

        // // 1. Variable and Its Types:
        // // A variable is a named memory location used to store data in a Java program.

        System.out.println("Welcome to Java Programming!");

        // // 2. Types of Variables:
        // // 
        // // Type       | Declared                       | Belongs To
        // // ----------------------------------------------------------------
        // // Local      | Inside method/block            | Method/Block
        // // Instance   | Inside class, outside method   | Object
        // // Static     | Inside class with static       | Class
        
        // NAMING CONVENTIONS 
        // 1. CamelCase Example:
        // First word starts with lowercase.
        // Next words start with uppercase.
        String studentName = "Kaviyarasan";
        System.out.println("Student Name: " + studentName);

        // 2. PascalCase Example:
        // Each word starts with uppercase.
        // Mainly used for Class and Interface names.
        // Example:
        int accountNumber = 12345;
        System.out.println("Account Number: " + accountNumber);

        double balance = 50000.50;
        System.out.println("Balance: " + balance);

        // 3. SnakeCase Example:
        // Words are separated using underscore (_).
        // Example:
        String student_name = "Kaviyarasan";
        System.out.println("Student Name: " + student_name);

        int student_age = 22;
        System.out.println("Student Age: " + student_age);

        // 4. DollarCase Example:
        // $ can be used in Java identifiers.
        int $salary = 25000;
        System.out.println("Salary: " + $salary);

        // 5. UnderscoreCase Example:
        // _ can be used in Java identifiers.
        int _number = 1000;
        System.out.println("Number: " + _number);

    }
}
