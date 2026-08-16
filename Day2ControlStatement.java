 class Day2ControlStatement {
    public static void main(String[] args) {

        // // 1. If statement :
        // // ---------------
        // // Syntax:
        // // if (condition) {
        // //     // code to be executed if the condition is true
        // // }

        // // Student Pass or Fail Check :
        // int mark = 60;

        // if (mark >= 50) {
        //     System.out.println("Pass");
        // }

        // if (mark < 50) {
        //     System.out.println("Fail");
        // }

        // // 2. If-else statement :
        // // -----------------
        // // Syntax:
        // // if (condition) {
        // //     // code to be executed if the condition is true
        // // } else {
        // //     // code to be executed if the condition is false
        // // }

        // // i. Vote Eligibility Check :
        // int age = 20;

        // if (age >= 18) {
        //     System.out.println("Eligible to Vote");
        // } else {
        //     System.out.println("Not Eligible to Vote");
        // }

        // // ii. Student Pass or Fail Check :
        // int mark = 65;

        // if (mark >= 50) {
        //     System.out.println("Pass");
        // } else {
        //     System.out.println("Fail");
        // }

        // // iii. Find Odd or Even Number :
        // int num = 10;

        // if (num % 2 == 0) {
        //     System.out.println("Even Number");
        // } else {
        //     System.out.println("Odd Number");
        // }

        // // iv. Vowel or Consonant Check :
        // char ch = 'a';

        // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //     System.out.println("Vowel");
        // } else {
        //     System.out.println("Consonant");
        // }

        // // v. Find Largest of Two Numbers :
        // int a = 25;
        // int b = 40;

        // if (a > b) {
        //     System.out.println(a + " is the largest");
        // } else {
        //     System.out.println(b + " is the largest");
        // }

        // // 3. Ladder if-else statement :
        // // ----------------------
        // // Syntax:
        // // if (condition1) {
        // //     // code to be executed if condition1 is true
        // // } else if (condition2) {
        // //     // code to be executed if condition2 is true
        // // } else {
        // //     // code to be executed if both conditions are false
        // // }

        // // i. Find the biggest Value among three numbers :
        // int a = 30;
        // int b = 50;
        // int c = 40;

        // if (a > b && a > c) {
        //     System.out.println(a + " A is the biggest Value");
        // } else if (b > a && b > c) {
        //     System.out.println(b + " B is the biggest Value");
        // } else {
        //     System.out.println(c + " C is the biggest Value");
        // }

        // // ii. Pasive or Negative or Zero Check :
        // int num = -10;

        // if (num > 0) {
        //     System.out.println("Positive Number");
        // } else if (num < 0) {
        //     System.out.println("Negative Number");
        // } else {
        //     System.out.println("Zero");
        // }

        // // iii. Largest of four Numbers :
        //  int a = 10;
        // int b = 25;
        // int c = 15;
        // int d = 20;

        // if (a > b && a > c && a > d) {
        //     System.out.println("A is Largest");
        // } else if (b > a && b > c && b > d) {
        //     System.out.println("B is Largest");
        // } else if (c > a && c > b && c > d) {
        //     System.out.println("C is Largest");
        // } else {
        //     System.out.println("D is Largest");
        // }

        // // iv. Grade Check :
        //  int mark = 85;

        // if (mark >= 90) {
        //     System.out.println("A Grade");
        // } else if (mark >= 80) {
        //     System.out.println("B Grade");
        // } else if (mark >= 70) {
        //     System.out.println("C Grade");
        // } else if (mark >= 60) {
        //     System.out.println("D Grade");
        // } else if (mark >= 50) {
        //     System.out.println("E Grade");
        // } else {
        //     System.out.println("Fail");
        // }

        // // v. Elactricity Bill Calculation :
        // int units = 250;
        // double bill;

        // if (units <= 100) {
        //     bill = units * 1.50;
        // } else if (units <= 200) {
        //     bill = (100 * 1.50) + ((units - 100) * 2.00);
        // } else if (units <= 300) {
        //     bill = (100 * 1.50) + (100 * 2.00) + ((units - 200) * 3.00);
        // } else {
        //     bill = (100 * 1.50) + (100 * 2.00) + (100 * 3.00)
        //             + ((units - 300) * 5.00);
        // }

        // System.out.println("Units = " + units);
        // System.out.println("EB Bill = ₹" + bill);

       
        // // 4. Nested if-else statement :
        // // ----------------------
        // // Syntax:
        // // if (condition1) {
        // //     if (condition2) {
        // //         // code to be executed if both conditions are true
        // //     } else {
        // //         // code to be executed if condition1 is true and condition2 is false
        // //     }
        // // } else {
        // //     // code to be executed if condition1 is false
        // // }

        // // i. Find the biggest Value among three numbers :
        // int a = 30;
        // int b = 50;
        // int c = 40;

        // if (a > b) {
        //     if (a > c) {
        //         System.out.println(a + " is Largest");
        //     } else {
        //         System.out.println(c + " is Largest");
        //     }
        // } else {
        //     if (b > c) {
        //         System.out.println(b + " is Largest");
        //     } else {
        //         System.out.println(c + " is Largest");
        //     }
        // }

        // // i. Vote Eligibility Check :
        // int age = 20;
        // String country = "Indian";

        // if (age >= 18) {
        //     if (country.equals("Indian")) {
        //         System.out.println("Eligible to Vote");
        //     } else {
        //         System.out.println("Not Eligible - Indian Citizen Required");
        //     }
        // } else {
        //     System.out.println("Not Eligible - Age must be 18 or above");
        // }


        // // 4. Ternary Operator :
        // // ----------------------
        // // Syntax:
        // // variable = (condition) ? expression1 : expression2;

        // // i.Student Pass or Fail Check :
        // int mark = 65;

        // String result = (mark >= 50) ? "Pass" : "Fail";
        // System.out.println("Student Result = " + result);
    
        // // ii. Find Largest of Two Numbers :
        // int a = 25;
        // int b = 40;

        // int largest = (a > b) ? a : b;

        // System.out.println("Largest = " + largest);

        
        // // 5. Switch Statement :
        // // ----------------------
        // // Syntax:
        // // switch (expression) {
        // //     case value1:
        // //         // code to be executed if expression equals value1
        // //         break;
        // //     case value2:
        // //         // code to be executed if expression equals value2
        // //         break;
        // //    default:
        // //         // code to be executed if expression does not match any case
        // //         break;
        // //   }

        // // i. Simple Calculator using Switch Statement :
        // int a = 10;
        // int b = 5;
        // char operator = '+';

        // switch (operator) {

        //     case '+':
        //         System.out.println("Addition = " + (a + b));
        //         break;

        //     case '-':
        //         System.out.println("Subtraction = " + (a - b));
        //         break;

        //     case '*':
        //         System.out.println("Multiplication = " + (a * b));
        //         break;

        //     case '/':
        //         System.out.println("Division = " + (a / b));
        //         break;

        //     default:
        //         System.out.println("Invalid Operator");
        // }

        // // ii. Day of the Week using Switch Statement :
        // int day = 3;

        // switch (day) {

        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Invalid Day");
        // }



        }
    }
