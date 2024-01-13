package project2;

public class task6 {

    public static int countVowels(String d) {
        int count = 0;
        for (int i = 0; i < d.length(); i++) {
            char ch = d.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {


        System.out.println(countVowels("documentation"));

    }

}