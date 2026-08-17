public class Day6StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello Java");

        System.out.println("Original: " + sb);

        // append()
        sb.append(" Programming");
        System.out.println("Append: " + sb);

        // insert()
        sb.insert(5, " World");
        System.out.println("Insert: " + sb);

        // replace()
        sb.replace(0, 5, "Hi");
        System.out.println("Replace: " + sb);

        // delete()
        sb.delete(0, 3);
        System.out.println("Delete: " + sb);

        // deleteCharAt()
        sb.deleteCharAt(0);
        System.out.println("DeleteCharAt: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // Reverse back
        sb.reverse();

        // charAt()
        System.out.println("CharAt: " + sb.charAt(2));

        // codePointAt()
        System.out.println("CodePointAt: " + sb.codePointAt(2));

        // codePointBefore()
        System.out.println("CodePointBefore: " + sb.codePointBefore(3));

        // codePointCount()
        System.out.println("CodePointCount: "
                + sb.codePointCount(0, sb.length()));

        // offsetByCodePoints()
        System.out.println("OffsetByCodePoints: "
                + sb.offsetByCodePoints(0, 2));

        // setCharAt()
        sb.setCharAt(0, 'J');
        System.out.println("SetCharAt: " + sb);

        // setLength()
        sb.setLength(10);
        System.out.println("SetLength: " + sb);

        // length()
        System.out.println("Length: " + sb.length());

        // capacity()
        System.out.println("Capacity: " + sb.capacity());

        // ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("EnsureCapacity: " + sb.capacity());

        // trimToSize()
        sb.trimToSize();
        System.out.println("TrimToSize Capacity: " + sb.capacity());

        // indexOf()
        System.out.println("IndexOf: " + sb.indexOf("Java"));

        // indexOf() with fromIndex
        System.out.println("IndexOf From Index: "
                + sb.indexOf("Java", 0));

        // lastIndexOf()
        System.out.println("LastIndexOf: " + sb.lastIndexOf("Java"));

        // lastIndexOf() with fromIndex
        System.out.println("LastIndexOf From Index: "
                + sb.lastIndexOf("Java", sb.length()));

        // substring()
        System.out.println("Substring: " + sb.substring(0, 4));

        // substring() from index
        System.out.println("Substring From: " + sb.substring(2));

        // subSequence()
        System.out.println("SubSequence: " + sb.subSequence(0, 4));

        // getChars()
        char[] chars = new char[5];

        sb.getChars(0, 5, chars, 0);

        System.out.print("GetChars: ");

        for (char ch : chars) {
            System.out.print(ch);
        }

        System.out.println();

        // toString()
        String str = sb.toString();
        System.out.println("ToString: " + str);

        // chars()
        System.out.print("Chars: ");

        sb.chars().forEach(x -> System.out.print((char) x));

        System.out.println();

        // codePoints()
        System.out.print("CodePoints: ");

        sb.codePoints().forEach(x -> System.out.print(x + " "));

        System.out.println();
    }
}