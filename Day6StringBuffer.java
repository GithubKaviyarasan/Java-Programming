public class Day6StringBuffer {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello Java");

        System.out.println("Original: " + sb);

        // append()
        sb.append(" Programming");
        System.out.println("Append: " + sb);

        // insert()
        sb.insert(11, " Full Stack");
        System.out.println("Insert: " + sb);

        // replace()
        sb.replace(0, 5, "Hi");
        System.out.println("Replace: " + sb);

        // delete()
        sb.delete(0, 3);
        System.out.println("Delete: " + sb);

        // deleteCharAt()
        sb.deleteCharAt(0);
        System.out.println("Delete Character: " + sb);

        // charAt()
        System.out.println("Character: " + sb.charAt(2));

        // setCharAt()
        sb.setCharAt(0, 'J');
        System.out.println("Set Character: " + sb);

        // length()
        System.out.println("Length: " + sb.length());

        // capacity()
        System.out.println("Capacity: " + sb.capacity());

        // ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("Ensure Capacity: " + sb.capacity());

        // indexOf()
        System.out.println("Index Of: " + sb.indexOf("Java"));

        // lastIndexOf()
        System.out.println("Last Index Of: " + sb.lastIndexOf("Java"));

        // substring()
        System.out.println("Substring: " + sb.substring(0, 4));

        // setLength()
        sb.setLength(10);
        System.out.println("Set Length: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // toString()
        String str = sb.toString();
        System.out.println("To String: " + str);
    }
}