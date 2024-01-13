package project2;

public class task4 {

    public static void main(String[] args) {
        String name = "madam";

        String reverseName ="";
            for (int i = name.length() - 1; i >= 0; i--) {
                reverseName = reverseName + name.charAt(i);
            }
            if (name.equals(reverseName)) {
                System.out.println(name + "  is  Palindrome");
            } else {
                System.out.println( name + "  is not  Palindrome");
            }
        }


    }






