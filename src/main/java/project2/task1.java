package project2;

public class task1 {
    public static void main(String[] args) {
        String a = "one";
        String b = "two";

        a = a + b;

        b = a.substring(0, a.length() - b.length());

        a = a.substring(b.length());

        System.out.println(" a = " + a + " b = " + b);

    }
}