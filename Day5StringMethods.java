public class Day5StringMethods {
    public static void main(String[] args) {

        String str = "  Hello Java Programming  ";
        String str2 = "hello java programming";

        // length()
        System.out.println("Length: " + str.length());

        // charAt()
        System.out.println("Character at index 1: " + str.charAt(1));

        // toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // equals()
        System.out.println("Equals: " + str.equals(str2));

        // equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(str2));

        // contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // startsWith()
        System.out.println("Starts With 'Hello': " + str.trim().startsWith("Hello"));

        // endsWith()
        System.out.println("Ends With 'Programming': " + str.trim().endsWith("Programming"));

        // indexOf()
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // lastIndexOf()
        System.out.println("Last Index of 'a': " + str.lastIndexOf("a"));

        // compareTo()
        System.out.println("Compare To: " + str.trim().compareTo(str2));

        // compareToIgnoreCase()
        System.out.println("Compare To Ignore Case: "
                + str.trim().compareToIgnoreCase(str2));

        // substring()
        System.out.println("Substring: " + str.trim().substring(6, 10));

        // replace()
        System.out.println("Replace: " + str.replace("Java", "Python"));

        // trim()
        System.out.println("Trim: '" + str.trim() + "'");

        // split()
        String[] words = str.trim().split(" ");

        System.out.println("Split:");
        for (String word : words) {
            System.out.println(word);
        }

        // concat()
        System.out.println("Concat: " + str.trim().concat(" Course"));

        // isEmpty()
        String emptyString = "";
        System.out.println("Is Empty: " + emptyString.isEmpty());

        // valueOf()
        int number = 100;
        String numberString = String.valueOf(number);
        System.out.println("Value Of: " + numberString);
    }
}