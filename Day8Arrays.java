
public class Day8Arrays {

    public static void main(String[] args) {

        // // Arrays of objects 
        // // Defintion :
        // //
        // // Array is a collection of elements of the same data type
        // // stored under a single variable name.
        /*
      Example:
          int[] marks = {79, 74, 86, 99, 100};
         
          Important:
          Array index starts from 0.
         
          Steps:
          1. Declare the array.
          2. Initialize the array.
          3. Access the elements using index. 
         */
        // // 1. ACCESS ARRAY ELEMENTS :
        // // Accessing means retrieving a particular value from an array using its index number.
        int[] marks = {79, 74, 76, 70, 72};

        System.out.println("--- STUDENT MARKS ---");

        System.out.println("Tamil - " + marks[0]);
        System.out.println("English - " + marks[1]);
        System.out.println("Maths - " + marks[2]);
        System.out.println("Science - " + marks[3]);
        System.out.println("Social - " + marks[4]);

        System.out.println("");

        // // 2. CHANGE ARRAY ELEMENT
        // // We can change an array element by assigning a new value to a particular index.
        System.out.println("--- CHANGE ARRAY ELEMENT ---");

        System.out.println("Tamil - " + marks[0]);
        marks[0] = 100;
        System.out.println("Updated Tamil - " + marks[0]);

        System.out.println("English - " + marks[1]);
        marks[0] = 90;
        System.out.println("Updated English - " + marks[0]);

        System.out.println("Maths - " + marks[2]);
        marks[0] = 95;
        System.out.println("Updated Maths - " + marks[0]);

        System.out.println("Science - " + marks[3]);
        marks[0] = 92;
        System.out.println("Updated Science - " + marks[0]);

        System.out.println("Social - " + marks[4]);
        marks[0] = 99;
        System.out.println("Updated Social - " + marks[0]);
        System.out.println();

        // // 3. ARRAY LENGTH
        // // length gives the total number of elements present in an array.
        System.out.println("-- ARRAY LENGTH --");

        System.out.println("STUDENT MARKS : " + marks.length);
        System.out.println();

        // // 4. ARRAY USING FOR LOOP
        // // A for loop can be used to access all elements of an array one by one.
        System.out.println("-- ARRAY USING FOR LOOP --");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark -" + marks[i]);
        }
        System.out.println();

        // // 5. STRING ARRAY
        // // A String array is an array used to store multiple String values.
        System.out.println("-- STRING ARRAY --");

        // String[] names = {"KAVIYARASAN M", "NISHANTH SK", "GIRITHARAN S" };
        // for (int i = 0; i < names.length; i++) {
        //     System.out.println(names[i]);
        // }
        // System.out.println();
        // // 
        // // 6. ENHANCED FOR LOOP
        // // Enhanced for loop, also called for-each loop, is used to access each element directly.
        System.out.println("-- ENHANCED FOR LOOP --");

        int[] numbers = {
            10, 20, 30,
            40, 50, 60
        };

        for (int Numbers : numbers) {
            System.out.println(Numbers);
        }
        System.out.println();

        // // 7. SUM OF ARRAY ELEMENTS
        // // Sum means adding all the elements present in an array.
        System.out.println("-- SUM OF ARRAY ELEMENTS --");

        int[] sumNumbers = {
            10, 20, 30, 40, 50,
            60, 70, 80, 90, 100
        };

        int sum = 0;

        for (int i = 0; i < sumNumbers.length; i++) {
            sum = sum + sumNumbers[i];
        }

        System.out.println("SUM = " + sum);

        System.out.println();

        // // 8. AVERAGE OF ARRAY
        // // Average is the total sum of elements divided by the number of elements.
        System.out.println("-- AVERAGE OF ARRAY --");

        int[] studentMarks = {
            80, 90, 70, 85, 75
        };

        int total = 0;

        for (int i = 0; i < studentMarks.length; i++) {
            total = total + studentMarks[i];
        }

        double average = (double) total / studentMarks.length;

        System.out.println("SUM = " + total);
        System.out.println("AVERAGE = " + average);

        System.out.println();

        // // 9. FIND LARGEST NUMBER
        // // Largest number means finding the maximum value present in an array.
        System.out.println("-- FIND LARGEST NUMBER --");

        int[] largestNumbers = {
            25, 80, 45, 95, 30
        };

        int largest = largestNumbers[0];

        for (int i = 1; i < largestNumbers.length; i++) {

            if (largestNumbers[i] > largest) {
                largest = largestNumbers[i];
            }
        }

        System.out.println("Largest = " + largest);

        System.out.println();

        // // 10. FIND SMALLEST NUMBER
        // // Smallest number means finding the minimum value present in an array.
        System.out.println("-- FIND SMALLEST NUMBER --");

        int[] smallestNumbers = {
            35, 25, 80, 15, 95, 5, 1
        };

        int smallest = smallestNumbers[0];

        for (int i = 1; i < smallestNumbers.length; i++) {

            if (smallestNumbers[i] < smallest) {
                smallest = smallestNumbers[i];
            }
        }

        System.out.println("Smallest = " + smallest);

        System.out.println();

        // // 11. EVEN AND ODD NUMBERS
        // // Even number is a number divisible by 2.
        // // Odd number is a number not divisible by 2.
        System.out.println("-- EVEN AND ODD NUMBERS --");

        int[] evenOddNumbers = {
            10, 15, 25, 30
        };

        for (int i = 0; i < evenOddNumbers.length; i++) {

            if (evenOddNumbers[i] % 2 == 0) {

                System.out.println(
                        evenOddNumbers[i] + " - Even Number"
                );

            } else {

                System.out.println(
                        evenOddNumbers[i] + " - Odd Number"
                );
            }
        }

        System.out.println();

        // // 12. 2D ARRAY
        // // A 2D array is an array containing rows and columns.
        // // It is also called a matrix.
        // // 
        // System.out.println("-- 2D ARRAY --");
        int[][] twoDNumbers = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // for (int i = 0; i < twoDNumbers.length; i++) {
        //     for (int j = 0; j < twoDNumbers[i].length; j++) {
        //         System.out.print(twoDNumbers[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();
        // // 
        // // 13. ACCESS 2D ARRAY ELEMENT
        // // A 2D array element is accessed using row index and column index.
        System.out.println("-- ACCESS 2D ARRAY ELEMENT --");

        System.out.println(
                "Numbers = " + twoDNumbers[1][1]
        );
        System.out.println();

        // // 14. CHANGE 2D ARRAY ELEMENT
        // // We can update a 2D array element by assigning a new value using row and column indexes.
        System.out.println("-- CHANGE 2D ARRAY ELEMENT --");

        System.out.println(
                "Before Change : " + twoDNumbers[1][1]
        );

        twoDNumbers[1][1] = 500;

        System.out.println(
                "After Change  : " + twoDNumbers[1][1]
        );

        System.out.println();

        // // 15. PRINT UPDATED 2D ARRAY
        // // Nested for loop is used to print all elements of a 2D array.
        // System.out.println("-- UPDATED 2D ARRAY --");

        // for (int i = 0; i < twoDNumbers.length; i++) {

        //     for (int j = 0; j < twoDNumbers[i].length; j++) {

        //         System.out.print(twoDNumbers[i][j] + " ");
        //     }

        //     System.out.println();
        // }

    }
}
